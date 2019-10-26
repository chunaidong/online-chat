package com.wangmike.chat.server.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.cgclecc.devarch.jsoncore.util.DateUtil;
import com.cgclecc.devarch.jsoncore.util.IdGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangmike.chat.common.constant.CommonResponse;
import com.wangmike.chat.common.constant.ErrorCodeEnum;
import com.wangmike.chat.common.constant.OrderStateEnum;
import com.wangmike.chat.common.constant.TradeTypeEnum;
import com.wangmike.chat.common.entity.Consumer;
import com.wangmike.chat.common.entity.ConsumerOrder;
import com.wangmike.chat.common.entity.ProviderType;
import com.wangmike.chat.common.entity.WalletDetail;
import com.wangmike.chat.common.request.ConsumerOrderListRequest;
import com.wangmike.chat.common.request.ConsumerOrderRequest;
import com.wangmike.chat.common.request.ConsumerRequest;
import com.wangmike.chat.common.request.MarkedRequest;
import com.wangmike.chat.common.response.ConsumerForAdmin;
import com.wangmike.chat.common.response.ProviderAllResponseForOrderList;
import com.wangmike.chat.common.response.ProviderResponseForList;
import com.wangmike.chat.common.response.ProviderResponseForOrderList;
import com.wangmike.chat.server.persistence.ConsumerMapper;
import com.wangmike.chat.server.persistence.ConsumerOrderMapper;
import com.wangmike.chat.server.persistence.ProviderTypeMapper;
import com.wangmike.chat.server.persistence.WalletDetailMapper;
import com.wangmike.chat.server.utils.CloseOrderTask;
import com.wangmike.chat.server.utils.FinishedOrderTask;
import com.wangmike.chat.server.utils.OrderSchedule;
import com.wangmike.chat.server.utils.ResponseUtils;
import com.wangmike.chat.service.ConsumerService;
import com.wangmike.chat.service.ProviderHeadImageService;
import com.wangmike.chat.service.TypeCollocationService;
import com.wangmike.chat.service.WalletService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    /*  45 */   private Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);


    @Autowired
    private ConsumerMapper consumerMapper;


    @Autowired
    private WalletService walletService;


    @Autowired
    private ProviderTypeMapper providerTypeMapper;


    @Autowired
    private TypeCollocationService typeCollocationService;

    @Autowired
    private ConsumerOrderMapper consumerOrderMapper;

    @Autowired
    private WalletDetailMapper walletDetailMapper;

    @Autowired
    private ProviderHeadImageService providerHeadImageService;

    @Value("${withdraw.money}")
    private String withdrawMoeny;


    @Transactional
    public CommonResponse registry(ConsumerRequest consumerRequest, HttpServletRequest request) {
        /*  78 */
        this.logger.info("========用户注册开始===========");
        /*  79 */
        String openId = request.getHeader("openId");

        /*  81 */
        int count = this.consumerMapper.judgeIsRegistry(openId);
        /*  82 */
        if (count > 0) {
            /*  83 */
            return ResponseUtils.buildSuccessResoonse("注册成功");
        }

        /*  86 */
        String walletId = this.walletService.insertWallet("0");
        /*  87 */
        this.logger.info("========用户注册新增钱包结束===========");

        /*  89 */
        Consumer consumer = buildConsumer(consumerRequest, openId, walletId);
        /*  90 */
        this.consumerMapper.insert(consumer);
        /*  91 */
        this.logger.info("========用户注册结束===========");
        /*  92 */
        return ResponseUtils.buildSuccessResoonse("注册成功");
    }


    /* 101 */
    public void updateByPrimaryKeySelective(Consumer consumer) {
        this.consumerMapper.updateByPrimaryKeySelective(consumer);
    }


    @Transactional
    public CommonResponse orderProvider(ConsumerOrderRequest consumerOrderRequest, HttpServletRequest request) {
        /* 114 */
        this.logger.info("========用户下单开始===========");
        /* 115 */
        String openId = request.getHeader("openId");

        /* 117 */
        Map<String, Object> resultMap = this.consumerMapper.getRestAmount(openId);
        /* 118 */
        BigDecimal consumerAmount = (BigDecimal) resultMap.get("total_amount");

        /* 120 */
        BigDecimal totalAmount = makeUpTotalAmount(consumerOrderRequest);
        /* 121 */
        if (consumerAmount.compareTo(totalAmount) < 0) {
            /* 122 */
            return ResponseUtils.buildErrorResponse(ErrorCodeEnum.REST_MOENY_NOT_ENOUGH.getCode(), ErrorCodeEnum.REST_MOENY_NOT_ENOUGH
/* 123 */.getName());
        }

        /* 126 */
        ConsumerOrder consumerOrder = makeUpConsumerOrder(consumerOrderRequest, openId, totalAmount);
        /* 127 */
        this.consumerOrderMapper.insert(consumerOrder);

        /* 129 */
        WalletDetail walletDetail = new WalletDetail();
        /* 130 */
        walletDetail.setDetailId(IdGenerator.getDefaultId() + "");
        /* 131 */
        walletDetail.setAmount(totalAmount);
        /* 132 */
        walletDetail.setTradeType(TradeTypeEnum.CONSUMER.getCode());
        /* 133 */
        walletDetail.setCreateTime(new Date());
        /* 134 */
        walletDetail.setCreateUser(openId);
        /* 135 */
        walletDetail.setOrderId(consumerOrder.getOrderId());

        /* 137 */
        walletDetail.setCreateRole("0");
        /* 138 */
        walletDetail.setWalletId(resultMap.get("wallet_id") + "");
        /* 139 */
        this.walletDetailMapper.insert(walletDetail);

        /* 141 */
        this.walletService.decreaseMoney(walletDetail.getWalletId(), totalAmount);

        /* 143 */
        OrderSchedule.getInstance().startTask(new CloseOrderTask(consumerOrder.getOrderId()), 30L, TimeUnit.MINUTES);
        /* 144 */
        this.logger.info("========用户下单结束===========");
        /* 145 */
        return ResponseUtils.buildSuccessResoonse("创建成功");
    }


    @Transactional
    public void cancelOrder(String orderId) {
        /* 156 */
        this.logger.info("========取消订单开始===========");


        /* 159 */
        ConsumerOrder consumerOrder = this.consumerOrderMapper.queryOrderById(orderId);

        /* 161 */
        if (!consumerOrder.getOrderState().equals(OrderStateEnum.WAIT_ACCESS.getCode())) {
            return;
        }

        /* 165 */
        this.consumerOrderMapper.closeOrderById(orderId);

        /* 167 */
        String walletId = this.walletDetailMapper.getWalletDetailByOrderId(orderId);
        /* 168 */
        WalletDetail walletDetail = new WalletDetail();
        /* 169 */
        walletDetail.setDetailId(IdGenerator.getDefaultId() + "");
        /* 170 */
        walletDetail.setAmount(consumerOrder.getOrderAmount());
        /* 171 */
        walletDetail.setTradeType(TradeTypeEnum.REFUND.getCode());
        /* 172 */
        walletDetail.setCreateTime(new Date());
        /* 173 */
        walletDetail.setCreateUser(consumerOrder.getConsumerId());
        /* 174 */
        walletDetail.setOrderId(consumerOrder.getOrderId());

        /* 176 */
        walletDetail.setCreateRole("0");
        /* 177 */
        walletDetail.setWalletId(walletId);
        /* 178 */
        this.walletDetailMapper.insert(walletDetail);

        /* 180 */
        this.walletService.increasMoney(walletDetail.getWalletId(), consumerOrder.getOrderAmount());
        /* 181 */
        this.logger.info("========取消订单结束===========");
    }


    public CommonResponse getAllOrderList(ConsumerOrderListRequest consumerOrderListRequest, HttpServletRequest request) {
        /* 194 */
        consumerOrderListRequest.setOpenId(request.getHeader("openId"));
        /* 195 */
        PageHelper.startPage(consumerOrderListRequest.getPage(), consumerOrderListRequest.getSize());
        /* 196 */
        List<ProviderResponseForOrderList> orderLists = this.consumerOrderMapper.getConsumerOrderList(consumerOrderListRequest);
        /* 197 */
        orderLists.stream().forEach(providerResponseForList -> {
            /* 198 */
            List<String> headerList = this.providerHeadImageService.getProHeadsById(providerResponseForList.getProviderId());
            /* 199 */
            if (headerList.size() > 0) {
                /* 200 */
                providerResponseForList.setHeadsLists(headerList);
            }
        });
        /* 203 */
        PageInfo<ProviderResponseForOrderList> page = new PageInfo<ProviderResponseForOrderList>(orderLists);

        /* 205 */
        Map<String, Object> resultMap = this.consumerOrderMapper.queryCount(consumerOrderListRequest.getOpenId());
        /* 206 */
        ProviderAllResponseForOrderList allResponseForOrderList = new ProviderAllResponseForOrderList();
        /* 207 */
        allResponseForOrderList.setPage(page);
        /* 208 */
        allResponseForOrderList.setTotalWaitAccess(Integer.parseInt(resultMap.get("accessCount") + ""));
        /* 209 */
        allResponseForOrderList.setTotalWaitChat(Integer.parseInt(resultMap.get("chatCount") + ""));
        /* 210 */
        allResponseForOrderList.setTotalChatting(Integer.parseInt(resultMap.get("chatingCount") + ""));
        /* 211 */
        return ResponseUtils.buildSuccessResoonse(allResponseForOrderList);
    }


    public CommonResponse getAllMarkedList(MarkedRequest markedRequest, HttpServletRequest request) {
        /* 223 */
        markedRequest.setOpenId(request.getHeader("openId"));
        /* 224 */
        PageHelper.startPage(markedRequest.getPage(), markedRequest.getSize());
        /* 225 */
        List<ProviderResponseForList> orderLists = this.consumerOrderMapper.getAllMarkedList(markedRequest);
        /* 226 */
        orderLists.stream().forEach(providerResponseForList -> {
            /* 227 */
            List<String> headerList = this.providerHeadImageService.getProHeadsById(providerResponseForList.getProviderId());
            /* 228 */
            if (headerList.size() > 0) {
                /* 229 */
                providerResponseForList.setHeadsLists(headerList);
            }
            /* 231 */
            List<ProviderType> typeList = this.typeCollocationService.getProviderTypes(providerResponseForList.getProviderId());
            /* 232 */
            if (typeList.size() > 0) {
                /* 233 */
                providerResponseForList.setTypeList(typeList);
            }
        });

        /* 237 */
        PageInfo<ProviderResponseForList> page = new PageInfo<ProviderResponseForList>(orderLists);
        /* 238 */
        return ResponseUtils.buildSuccessResoonse(page);
    }


    public CommonResponse getAllFlowerList(HttpServletRequest request) {
        /* 249 */
        List<ProviderType> flowerList = this.providerTypeMapper.getAllFlowerList();
        /* 250 */
        return ResponseUtils.buildSuccessResoonse(flowerList);
    }


    public CommonResponse updateStateToWaitConfirm(HttpServletRequest request, String orderId) {
        /* 262 */
        int count = this.consumerMapper.updateStateToWaitConfirm(orderId, request.getHeader("openId"));
        /* 263 */
        if (count == 0) {
            /* 264 */
            return ResponseUtils.buildErrorResponse("DATA_CHANGED", "该订单已被修改，请刷新后重试");
        }

        /* 267 */
        OrderSchedule.getInstance().startTask(new CloseOrderTask(orderId), 60L, TimeUnit.MINUTES);
        /* 268 */
        return ResponseUtils.buildSuccessResoonse("修改成功");
    }


    @Transactional
    public CommonResponse updateStateToChatting(HttpServletRequest request, String orderId) {
        /* 281 */
        int count = this.consumerMapper.updateStateToChatting(orderId, request.getHeader("openId"));
        /* 282 */
        if (count == 0) {
            /* 283 */
            return ResponseUtils.buildErrorResponse("DATA_CHANGED", "该订单已被修改，请刷新后重试");
        }



        /* 288 */
        String providerTime = this.consumerOrderMapper.getOrderTime(orderId);
        /* 289 */
        OrderSchedule.getInstance().startTask(new FinishedOrderTask(orderId), 1L, TimeUnit.MINUTES);

        /* 291 */
        return ResponseUtils.buildSuccessResoonse("修改成功");
    }


    @Transactional
    public void finishOrder(String orderId) {
        /* 303 */
        ConsumerOrder consumerOrder = this.consumerOrderMapper.queryOrderById(orderId);
        /* 304 */
        if (!StringUtils.equals(consumerOrder.getOrderState(), OrderStateEnum.IN_CHATTING.getCode())) {
            /* 305 */
            this.logger.error("该订单的状态已经发生异常，具体信息为：{}", JSONUtils.toJSONString(consumerOrder));

            return;
        }
        /* 309 */
        this.consumerOrderMapper.updateOrderState(consumerOrder);



        /* 313 */
        String walletId = this.consumerMapper.getProviderWalletId(consumerOrder.getProviderId());
        /* 314 */
        WalletDetail walletDetail = new WalletDetail();
        /* 315 */
        walletDetail.setDetailId(IdGenerator.getDefaultId() + "");
        /* 316 */
        walletDetail.setOrderId(orderId);
        /* 317 */
        walletDetail.setCreateRole("1");
        /* 318 */
        walletDetail.setCreateTime(new Date());
        /* 319 */
        walletDetail.setCreateUser(consumerOrder.getProviderId());
        /* 320 */
        walletDetail.setTradeType(TradeTypeEnum.RECEVIE.getCode());
        /* 321 */
        walletDetail.setAmount(consumerOrder.getOrderAmount()
/* 322 */.multiply(new BigDecimal(this.withdrawMoeny)));
        /* 323 */
        walletDetail.setWalletId(walletId);
        /* 324 */
        this.walletDetailMapper.insert(walletDetail);

        /* 326 */
        this.walletService.increasMoney(walletId, walletDetail.getAmount());

        /* 328 */
        this.consumerOrderMapper.incTotal(consumerOrder.getProviderId(), consumerOrder.getProviderType());
    }

    @Transactional
    public void cancelOrder2(String orderId) {
        /* 333 */
        this.logger.info("========取消订单开始===========");


        /* 336 */
        ConsumerOrder consumerOrder = this.consumerOrderMapper.queryOrderById(orderId);

        /* 338 */
        if (!consumerOrder.getOrderState().equals(OrderStateEnum.WAIT_CONFIRM.getCode())) {
            return;
        }

        /* 342 */
        this.consumerOrderMapper.closeOrderById(orderId);

        /* 344 */
        String walletId = this.walletDetailMapper.getWalletDetailByOrderId(orderId);
        /* 345 */
        WalletDetail walletDetail = new WalletDetail();
        /* 346 */
        walletDetail.setDetailId(IdGenerator.getDefaultId() + "");
        /* 347 */
        walletDetail.setAmount(consumerOrder.getOrderAmount());
        /* 348 */
        walletDetail.setTradeType(TradeTypeEnum.REFUND.getCode());
        /* 349 */
        walletDetail.setCreateTime(new Date());
        /* 350 */
        walletDetail.setCreateUser(consumerOrder.getConsumerId());
        /* 351 */
        walletDetail.setOrderId(consumerOrder.getOrderId());

        /* 353 */
        walletDetail.setCreateRole("0");
        /* 354 */
        walletDetail.setWalletId(walletId);
        /* 355 */
        this.walletDetailMapper.insert(walletDetail);

        /* 357 */
        this.walletService.increasMoney(walletDetail.getWalletId(), consumerOrder.getOrderAmount());
        /* 358 */
        this.logger.info("========取消订单结束===========");
    }


    public CommonResponse findConsumerBalance(HttpServletRequest request) {
        /* 369 */
        String openId = request.getHeader("openId");
        /* 370 */
        BigDecimal balance = this.consumerMapper.findConsumerBalance(openId);
        /* 371 */
        return ResponseUtils.buildSuccessResoonse(balance);
    }

    /**
     * 获取用户信息
     *
     * @param request
     * @return
     */
    @Override
    public CommonResponse getConsumerData(HttpServletRequest request) {
        String openId = request.getHeader("openId");
        ConsumerForAdmin consumerForAdmin = consumerMapper.getConsumerData(openId);
        return ResponseUtils.buildSuccessResoonse(consumerForAdmin);
    }


    private ConsumerOrder makeUpConsumerOrder(ConsumerOrderRequest consumerOrderRequest, String openId, BigDecimal totalAmount) {
        /* 376 */
        ConsumerOrder consumerOrder = new ConsumerOrder();
        /* 377 */
        consumerOrder.setOrderId(IdGenerator.getDefaultId() + "");
        /* 378 */
        consumerOrder.setOrderState(OrderStateEnum.WAIT_ACCESS.getCode());
        /* 379 */
        consumerOrder.setConsumerId(openId);
        /* 380 */
        consumerOrder.setProviderId(consumerOrderRequest.getProviderId());
        /* 381 */
        consumerOrder.setProviderType(consumerOrderRequest.getTypeId());
        /* 382 */
        consumerOrder.setProviderTime((consumerOrderRequest.getTotal().intValue() * 0.5D) + "");
        /* 383 */
        consumerOrder.setOrderAmount(totalAmount);
        /* 384 */
        consumerOrder.setOrderTime(new Date());
        /* 385 */
        consumerOrder.setPayTime(new Date());
        /* 386 */
        consumerOrder.setExpactStartTime(consumerOrderRequest.getExpireStartDate());
        /* 387 */
        return consumerOrder;
    }


    private BigDecimal makeUpTotalAmount(ConsumerOrderRequest consumerOrderRequest) {
        /* 397 */
        BigDecimal typeAmount = this.providerTypeMapper.getTypeAmount(consumerOrderRequest.getTypeId());
        /* 398 */
        return typeAmount.multiply(new BigDecimal(consumerOrderRequest.getTotal().intValue()));
    }


    private Consumer buildConsumer(ConsumerRequest consumerRequest, String openId, String walletId) {
        /* 411 */
        Consumer consumer = new Consumer();
        /* 412 */
        BeanUtils.copyProperties(consumerRequest, consumer);
        /* 413 */
        consumer.setConsumerId(openId);
        /* 414 */
        consumer.setWalletId(walletId);
        /* 415 */
        consumer.setConsumerVipLevel(Integer.valueOf(0));
        /* 416 */
        consumer.setConsumerUserRole("0");
        /* 417 */
        consumer.setCreateTime(new Date());
        consumer.setConsumerBirthDay(DateUtil.parse(consumerRequest.getBirthDay()));
        /* 418 */
        return consumer;
    }
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\ConsumerServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
package com.wangmike.chat.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangmike.chat.common.constant.AuditStateEnum;
import com.wangmike.chat.common.constant.CommonResponse;
import com.wangmike.chat.common.constant.ErrorCodeEnum;
import com.wangmike.chat.common.entity.Consumer;
import com.wangmike.chat.common.entity.Provider;
import com.wangmike.chat.common.entity.ProviderType;
import com.wangmike.chat.common.entity.TypeCollection;
import com.wangmike.chat.common.request.ProviderListRequest;
import com.wangmike.chat.common.request.ProviderOrderListRequest;
import com.wangmike.chat.common.request.ProviderRequest;
import com.wangmike.chat.common.response.ConsumerAllResponseForOrder;
import com.wangmike.chat.common.response.ConsumerResponseForOrderList;
import com.wangmike.chat.common.response.FlowerPool;
import com.wangmike.chat.common.response.ProviderResponseDetail;
import com.wangmike.chat.common.response.ProviderResponseForList;
import com.wangmike.chat.common.response.ProviderResponseForMy;
import com.wangmike.chat.common.response.ProviderResponseForSort;
import com.wangmike.chat.server.impl.ProviderServiceImpl;
import com.wangmike.chat.server.persistence.ProviderMapper;
import com.wangmike.chat.server.utils.ResponseUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;

import com.wangmike.chat.service.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProviderServiceImpl implements ProviderService {
    /*  35 */   private Logger logger = LoggerFactory.getLogger(ProviderServiceImpl.class);


    @Autowired
    private ProviderMapper providerMapper;


    @Autowired
    private WalletServiceImpl walletService;


    @Autowired
    private ConsumerService consumerService;


    @Autowired
    private TypeCollocationService typeCollocationService;


    @Autowired
    private ProviderHeadImageService providerHeadImageService;


    @Autowired
    private ConsumerCollectionService consumerCollectionService;


    @Transactional
    public CommonResponse registry(ProviderRequest providerRequest, HttpServletRequest request) {
        /*  67 */
        this.logger.info("========服务员注册开始===========");
        /*  68 */
        String openId = request.getHeader("openId");

        /*  70 */
        int count = this.providerMapper.judgeIsRegistry(openId);
        /*  71 */
        if (count > 0) {
            /*  72 */
            return ResponseUtils.buildSuccessResoonse("注册成功");
        }

        /*  75 */
        String walletId = this.walletService.insertWallet("1");

        /*  77 */
        Provider provider = buildProvider(providerRequest, openId, walletId);
        /*  78 */
        this.providerMapper.insert(provider);

        /*  87 */
        List<TypeCollection> types = new ArrayList<>();
        TypeCollection typeCollection = new TypeCollection();
        typeCollection.setTypeId("254125505756790785");
        typeCollection.setProviderId(openId);
        typeCollection.setCreateTime(new Date());
        //TODO 后续修改为默认声音地址
        typeCollection.setFilePath("后续修改为默认声音地址");
        typeCollection.setVoiceAudit("1");
        /*  88 */
        this.typeCollocationService.insertList(types);

        /*  91 */
        Consumer consumer = new Consumer();
        /*  92 */
        consumer.setConsumerId(openId);
        /*  93 */
        consumer.setConsumerUserRole("1");
        /*  94 */
        consumer.setProviderId(openId);
        /*  95 */
        this.consumerService.updateByPrimaryKeySelective(consumer);
        /*  96 */
        this.logger.info("========服务员注册结束===========");
        /*  97 */
        return ResponseUtils.buildSuccessResoonse("注册成功");
    }


    public CommonResponse getProviderList(ProviderListRequest providerListRequest, HttpServletRequest request) {
        List<ProviderResponseForList> providerList;
        /* 109 */
        PageHelper.startPage(providerListRequest.getPage(), providerListRequest.getSize());

        /* 111 */
        if (null == providerListRequest.getConsumerLoginLat()) {
            /* 112 */
            providerList = this.providerMapper.getProviderListBylevel(providerListRequest);
        } else {
            /* 114 */
            providerList = this.providerMapper.getProviderListByDistance(providerListRequest);
        }
        /* 116 */
        providerList.stream().forEach(providerResponseForList -> {
            /* 117 */
            List<String> headerList = this.providerHeadImageService.getProHeadsById(providerResponseForList.getProviderId());
            /* 118 */
            if (headerList.size() > 0) {
                /* 119 */
                providerResponseForList.setHeadsLists(headerList);
            }
        });
        /* 122 */
        PageInfo<ProviderResponseForList> page = new PageInfo<ProviderResponseForList>(providerList);

        /* 124 */
        return ResponseUtils.buildSuccessResoonse(page);
    }


    public CommonResponse getProviderDetail(String providerId, HttpServletRequest request) {
        /* 136 */
        String openId = request.getHeader("openId");
        /* 137 */
        ProviderResponseDetail providerDetail = this.providerMapper.getProviderDetail(providerId);
        /* 138 */
        if (null == providerDetail) {
            /* 139 */
            return ResponseUtils.buildErrorResponse(ErrorCodeEnum.DATA_IS_BLANK
/* 140 */.getCode(), ErrorCodeEnum.DATA_IS_BLANK.getName());
        }

        /* 143 */
        List<String> headerList = this.providerHeadImageService.getProHeadsById(providerId);
        /* 144 */
        if (headerList.size() > 0) {
            /* 145 */
            providerDetail.setHeadsLists(headerList);
        }

        /* 148 */
        List<ProviderType> typeList = this.typeCollocationService.getProviderTypes(providerId);
        /* 149 */
        typeList.stream().forEach(providerType -> {
            /* 150 */
            if (StringUtils.equals(providerType.getVoiceAudit(), "0")) {
                /* 151 */
                providerType.setFilePath("ssss");
            }
        });
        /* 154 */
        providerDetail.setTypeList(typeList);

        /* 156 */
        int count = this.consumerCollectionService.queryIsMark(openId, providerId);
        /* 157 */
        if (count != 0) {
            /* 158 */
            providerDetail.setMarked(true);
        }
        /* 160 */
        return ResponseUtils.buildSuccessResoonse(providerDetail);
    }


    public CommonResponse markProvider(String providerId, HttpServletRequest request) {
        /* 172 */
        String openId = request.getHeader("openId");
        /* 173 */
        this.consumerCollectionService.markProvider(providerId, openId);
        /* 174 */
        return ResponseUtils.buildSuccessResoonse("收藏成功");
    }


    public CommonResponse unmarkProvider(String providerId, HttpServletRequest request) {
        /* 186 */
        String openId = request.getHeader("openId");
        /* 187 */
        this.consumerCollectionService.unmarkProvider(providerId, openId);
        /* 188 */
        return ResponseUtils.buildSuccessResoonse("取消成功");
    }


    public CommonResponse getMyData(HttpServletRequest request) {
        /* 199 */
        String openId = request.getHeader("openId");
        /* 200 */
        ProviderResponseForMy providerResponseForMy = this.providerMapper.getProviderForMy(openId);

        /* 202 */
        List<String> headerList = this.providerHeadImageService.getProHeadsById(openId);
        /* 203 */
        if (headerList.size() > 0) {
            /* 204 */
            providerResponseForMy.setHeadsLists(headerList);
        }

        /* 207 */
        List<ProviderType> typeList = this.typeCollocationService.getProviderTypes(openId);
        /* 208 */
        providerResponseForMy.setTypeList(typeList);
        /* 209 */
        return ResponseUtils.buildSuccessResoonse(providerResponseForMy);
    }


    public CommonResponse getMyFlower(HttpServletRequest request) {
        /* 220 */
        BigDecimal totalFlower = this.providerMapper.getMyFlower(request.getHeader("openId"));
        /* 221 */
        return ResponseUtils.buildSuccessResoonse(totalFlower);
    }


    public CommonResponse getProviderTypeList() {
        /* 231 */
        List<ProviderType> lists = this.providerMapper.getAllProviderTypeList();
        /* 232 */
        return ResponseUtils.buildSuccessResoonse(lists);
    }


    public CommonResponse getFlowerPoolList(HttpServletRequest request) {
        /* 243 */
        List<FlowerPool> flowerPool = this.providerMapper.getMyFlowerPool(request.getHeader("openId"));
        /* 244 */
        return ResponseUtils.buildSuccessResoonse(flowerPool);
    }


    public CommonResponse updateProviderData(ProviderResponseForMy providerResponseForMy) {
        /* 255 */
        Provider provider = new Provider();
        /* 256 */
        BeanUtils.copyProperties(providerResponseForMy, provider);
        /* 257 */
        if (!StringUtils.equals(provider.getProviderWechatNo(), provider
/* 258 */.getProviderRawWechatNo())) {
            /* 259 */
            provider.setProviderAduitState(AuditStateEnum.WECHAT_NO_WAIT_AUDIT.getCode());
        }
        /* 261 */
        if (!StringUtils.equals(provider.getProviderContent(), provider
/* 262 */.getProviderRawContent())) {
            /* 263 */
            provider.setContentAudit("0");
        }
        /* 265 */
        this.providerMapper.updateData(provider);
        /* 266 */
        return ResponseUtils.buildSuccessResoonse("修改成功");
    }


    public CommonResponse getSortList(HttpServletRequest request) {
        /* 277 */
        String openId = request.getHeader("openId");
        /* 278 */
        List<ProviderResponseForSort> sortList = this.providerMapper.getSortList(openId);
        /* 279 */
        int i = 1;
        /* 280 */
        for (ProviderResponseForSort providerResponseForSort : sortList) {
            /* 281 */
            providerResponseForSort.setIndex(Integer.valueOf(i++));

            /* 283 */
            List<String> headerList = this.providerHeadImageService.getProHeadsById(openId);
            /* 284 */
            if (headerList.size() > 0) {
                /* 285 */
                providerResponseForSort.setHeadsLists(headerList);
            }
            /* 287 */
            if (providerResponseForSort.getProviderId().equals(openId)) {
                /* 288 */
                providerResponseForSort.setMy(true);
            }
        }
        /* 291 */
        return ResponseUtils.buildSuccessResoonse(sortList);
    }


    public CommonResponse getAllOrderList(ProviderOrderListRequest providerOrderListRequest, HttpServletRequest request) {
        /* 303 */
        providerOrderListRequest.setOpenId(request.getHeader("openId"));
        /* 304 */
        PageHelper.startPage(providerOrderListRequest.getPage().intValue(), providerOrderListRequest.getSize().intValue());
        /* 305 */
        List<ConsumerResponseForOrderList> orderLists = this.providerMapper.getProviderOrderList(providerOrderListRequest);
        /* 306 */
        PageInfo<ConsumerResponseForOrderList> page = new PageInfo<ConsumerResponseForOrderList>(orderLists);

        /* 308 */
        Map<String, Object> resultMap = this.providerMapper.queryCount(providerOrderListRequest.getOpenId());
        /* 309 */
        ConsumerAllResponseForOrder allResponseForOrderList = new ConsumerAllResponseForOrder();
        /* 310 */
        allResponseForOrderList.setPage(page);
        /* 311 */
        allResponseForOrderList.setTotalWaitAccess(Integer.parseInt(resultMap.get("accessCount") + ""));
        /* 312 */
        allResponseForOrderList.setTotalWaitChat(Integer.parseInt(resultMap.get("chatCount") + ""));
        /* 313 */
        allResponseForOrderList.setTotalChatting(Integer.parseInt("" + resultMap.get("chatingCount")));
        /* 314 */
        allResponseForOrderList.setTotalFinished(Integer.parseInt(resultMap.get("finishCount") + ""));
        /* 315 */
        return ResponseUtils.buildSuccessResoonse(allResponseForOrderList);
    }


    public CommonResponse accessOrder(String orderId, HttpServletRequest httpServletRequest) {
        /* 327 */
        int count = this.providerMapper.accessOrder(orderId, httpServletRequest.getHeader("openId"));
        /* 328 */
        if (count == 0) {
            /* 329 */
            return ResponseUtils.buildErrorResponse("DATA_CHANGED", "该订单已被修改，请刷新后重试");
        }
        /* 331 */
        return ResponseUtils.buildSuccessResoonse("修改成功");
    }


    @Transactional
    public CommonResponse updateTypeList(List<String> types, String openId) {
        /* 345 */
        this.typeCollocationService.deleteTypes(openId);








        /* 354 */
        List<TypeCollection> type = (List) types.stream().map(typeId -> {
            TypeCollection typeCollection = new TypeCollection();
            typeCollection.setProviderId(openId);
            typeCollection.setTypeId(typeId);
            typeCollection.setCreateTime(new Date());
            return typeCollection;
        }).collect(Collectors.toList());
        /* 355 */
        this.typeCollocationService.insertList(type);
        /* 356 */
        return ResponseUtils.buildSuccessResoonse("修改成功");
    }


    /* 366 */
    public void updateType(TypeCollection updateType) {
        this.providerMapper.updateType(updateType);
    }


    private Provider buildProvider(ProviderRequest providerRequest, String openId, String walletId) {
        /* 377 */
        Provider provider = new Provider();
        /* 378 */
        BeanUtils.copyProperties(providerRequest, provider);
        /* 379 */
        provider.setProviderId(openId);
        /* 380 */
        provider.setWalletId(walletId);
        /* 381 */
        provider.setCreateTime(new Date());
        /* 382 */
        provider.setProviderRawWechatNo(provider.getProviderWechatNo());
        /* 383 */
        provider.setProviderIsable("0");
        /* 384 */
        provider.setProviderOnlineState("0");
        /* 385 */
        provider.setProviderRawContent(provider.getProviderContent());
        /* 386 */
        provider.setProviderAduitState(AuditStateEnum.REGISTRY_WAIT_AUDIT.getCode());
        /* 387 */
        return provider;
    }
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\ProviderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
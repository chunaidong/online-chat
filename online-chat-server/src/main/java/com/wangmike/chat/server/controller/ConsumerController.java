 package com.wangmike.chat.server.controller;
 import com.wangmike.chat.common.constant.CommonResponse;
 import com.wangmike.chat.common.constant.ErrorCodeEnum;
 import com.wangmike.chat.common.request.ConsumerOrderListRequest;
 import com.wangmike.chat.common.request.ConsumerOrderRequest;
 import com.wangmike.chat.common.request.ConsumerRequest;
 import com.wangmike.chat.common.request.MarkedRequest;
 import com.wangmike.chat.common.request.ProviderListRequest;
 import com.wangmike.chat.server.controller.ConsumerController;
 import com.wangmike.chat.server.utils.ResponseUtils;
 import com.wangmike.chat.service.ConsumerService;
 import com.wangmike.chat.service.ProviderService;
 import io.swagger.annotations.Api;
 import io.swagger.annotations.ApiImplicitParam;
 import io.swagger.annotations.ApiImplicitParams;
 import io.swagger.annotations.ApiOperation;
 import javax.servlet.http.HttpServletRequest;
 import javax.validation.Valid;
 import org.apache.commons.lang3.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.validation.BindingResult;
 import org.springframework.validation.ObjectError;
 import org.springframework.web.bind.annotation.*;




 @RestController
 @RequestMapping({"/consumer"})
 @Api(value = "ConsumerController", tags = {"C端用户层 入口"})
 public class ConsumerController {
   @Autowired
   private ConsumerService consumerService;
   
   @PostMapping({"/registry"})
   @ApiOperation("C端用户注册 入口")
   public CommonResponse registry(@Valid @RequestBody ConsumerRequest consumerRequest, BindingResult errors, HttpServletRequest request) {
/*  37 */     if (errors.hasErrors()) {
/*  38 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/*  39 */           .getAllErrors().get(0)).getDefaultMessage());
     }
/*  41 */     return this.consumerService.registry(consumerRequest, request);
   }
   @Autowired
   private ProviderService providerService;
   @GetMapping({"/getProviderList"})
   @ApiOperation("获取服务员信息列表")
   public CommonResponse getProviderList(@Valid ProviderListRequest providerListRequest, BindingResult errors, HttpServletRequest request) {
/*  48 */     if (errors.hasErrors()) {
/*  49 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/*  50 */           .getAllErrors().get(0)).getDefaultMessage());
     }
/*  52 */     return this.providerService.getProviderList(providerListRequest, request);
   }
 
 
   
   @GetMapping({"/getProviderDetail"})
   @ApiOperation("获取服务员详细信息")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "String", required = true)})
   public CommonResponse getProviderDetail(String providerId, HttpServletRequest request) {
/*  61 */     if (StringUtils.isBlank(providerId)) {
/*  62 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), "主键不能为空");
     }
/*  64 */     return this.providerService.getProviderDetail(providerId, request);
   }
 
 
   
   @PostMapping({"/markProvider"})
   @ApiOperation("收藏服务员")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "String", required = true)})
   public CommonResponse markProvider(@RequestBody String providerId, HttpServletRequest request) {
/*  73 */     if (StringUtils.isBlank(providerId)) {
/*  74 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), "主键不能为空");
     }
/*  76 */     return this.providerService.markProvider(providerId, request);
   }
 
 
   
   @GetMapping({"/findConsumerBalance"})
   @ApiOperation("获取当前消费者余额")
/*  83 */   public CommonResponse findConsumerBalance(HttpServletRequest request) { return this.consumerService.findConsumerBalance(request); }
 
 
 
   
   @PostMapping({"/unmarkProvider"})
   @ApiOperation("取消收藏服务员")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "String", required = true)})
   public CommonResponse unmarkProvider(@RequestBody String providerId, HttpServletRequest request) {
/*  92 */     if (StringUtils.isBlank(providerId)) {
/*  93 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), "主键不能为空");
     }
/*  95 */     return this.providerService.unmarkProvider(providerId, request);
   }
 
   
   @PostMapping({"/orderProvider"})
   @ApiOperation("预约接口")
   public CommonResponse orderProvider(@Valid @RequestBody ConsumerOrderRequest consumerOrderRequest, BindingResult errors, HttpServletRequest request) {
/* 102 */     if (errors.hasErrors()) {
/* 103 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/* 104 */           .getAllErrors().get(0)).getDefaultMessage());
     }
     
/* 107 */     return this.consumerService.orderProvider(consumerOrderRequest, request);
   }
 
   
   @GetMapping({"/getAllOrderList"})
   @ApiOperation("订单列表")
   public CommonResponse getAllOrderList(@Valid ConsumerOrderListRequest consumerOrderListRequest, BindingResult errors, HttpServletRequest request) {
/* 114 */     if (errors.hasErrors()) {
/* 115 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/* 116 */           .getAllErrors().get(0)).getDefaultMessage());
     }
/* 118 */     return this.consumerService.getAllOrderList(consumerOrderListRequest, request);
   }
   
   @GetMapping({"/getAllMarkedList"})
   @ApiOperation("收藏服务员列表")
   public CommonResponse getAllMarkedList(@Valid MarkedRequest markedRequest, BindingResult errors, HttpServletRequest request) {
/* 124 */     if (errors.hasErrors()) {
/* 125 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/* 126 */           .getAllErrors().get(0)).getDefaultMessage());
     }
/* 128 */     return this.consumerService.getAllMarkedList(markedRequest, request);
   }
 
   
   @GetMapping({"/getAllFlowerList"})
   @ApiOperation("获取所有鲜花列表")
/* 134 */   public CommonResponse getAllFlowerList(HttpServletRequest request) { return this.consumerService.getAllFlowerList(request); }
 
 
 
   
   @PostMapping({"/updateStateToWaitConfirm"})
   @ApiOperation("订单由待沟通改为待确认")
   @ApiImplicitParams({@ApiImplicitParam(name = "orderId", value = "订单id", dataType = "String", required = true)})
/* 142 */   public CommonResponse updateStateToWaitConfirm(HttpServletRequest request, String orderId) { return this.consumerService.updateStateToWaitConfirm(request, orderId); }
 
 
 
 
   
   @PostMapping({"/updateStateToChatting"})
   @ApiOperation("订单由待确认改为沟通中")
   @ApiImplicitParams({@ApiImplicitParam(name = "orderId", value = "订单id", dataType = "String", required = true)})
/* 151 */   public CommonResponse updateStateToChatting(HttpServletRequest request, String orderId) { return this.consumerService.updateStateToChatting(request, orderId); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\controller\ConsumerController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
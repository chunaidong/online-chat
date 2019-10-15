 package com.wangmike.chat.server.controller;
 
 import com.wangmike.chat.common.constant.CommonResponse;
 import com.wangmike.chat.common.entity.ProviderType;
 import com.wangmike.chat.server.controller.AdminController;
 import com.wangmike.chat.server.impl.AdminService;
 import io.swagger.annotations.Api;
 import io.swagger.annotations.ApiImplicitParam;
 import io.swagger.annotations.ApiImplicitParams;
 import io.swagger.annotations.ApiOperation;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
 
 
 @RestController
 @RequestMapping({"/admin"})
 @Api(value = "AdminController", tags = {"后台接口 入口"})
 public class AdminController
 {
   @Autowired
   private AdminService adminService;
   
   @ApiOperation("获取所有的订单信息")
   @ApiImplicitParams({@ApiImplicitParam(name = "page", value = "页数", dataType = "int", required = true), @ApiImplicitParam(name = "size", value = "当前页展示数量", dataType = "int", required = true)})
   @GetMapping({"/getAllOrderList"})
/*  31 */   public CommonResponse getAllOrderList(@RequestParam int page, @RequestParam int size) { return this.adminService.getAllOrderList(page, size); }
 
 
 
 
 
   
   @ApiOperation("获取所有的用户信息")
   @ApiImplicitParams({@ApiImplicitParam(name = "page", value = "页数", dataType = "int", required = true), @ApiImplicitParam(name = "size", value = "当前页展示数量", dataType = "int", required = true)})
   @GetMapping({"/getAllConsumerList"})
/*  41 */   public CommonResponse getAllConsumerList(@RequestParam int page, @RequestParam int size) { return this.adminService.getAllConsumerList(page, size); }
 
 
 
 
 
   
   @ApiOperation("获取所有的服务员列表信息")
   @ApiImplicitParams({@ApiImplicitParam(name = "page", value = "页数", dataType = "int", required = true), @ApiImplicitParam(name = "size", value = "当前页展示数量", dataType = "int", required = true)})
   @GetMapping({"/getAllProviderList"})
/*  51 */   public CommonResponse getAllProviderList(@RequestParam int page, @RequestParam int size) { return this.adminService.getAllProviderList(page, size); }
 
 
 
   
   @ApiOperation("上架服务员")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true)})
   @PostMapping({"/onlineState"})
/*  59 */   public CommonResponse onlineState(String providerId) { return this.adminService.onlineState(providerId); }
 
 
 
 
   
   @ApiOperation("下架服务员")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true)})
   @PostMapping({"/offlineState"})
/*  68 */   public CommonResponse offlineState(String providerId) { return this.adminService.offlineState(providerId); }
 
   
   @ApiOperation("获取服务员待审核的信息")
   @GetMapping({"/getWaitAuditData"})
/*  73 */   public CommonResponse getWaitAuditData() { return this.adminService.getWaitAuditData(); }
 
 
 
 
   
   @ApiOperation("删除服务员头像信息")
   @ApiImplicitParams({@ApiImplicitParam(name = "finalPath", value = "头像所在路径", dataType = "String", required = true)})
   @PostMapping({"/removeHeadImage"})
/*  82 */   public CommonResponse removeHeadImage(String finalPath) { return this.adminService.removeHeadImage(finalPath); }
 
 
 
   
   @ApiOperation("服务员头像拒绝")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/denyHeadImage"})
/*  90 */   public CommonResponse denyHeadImage(String providerId) { return this.adminService.denyHeadImage(providerId); }
 
 
 
 
   
   @ApiOperation("服务员头像审核通过")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/passHeadImage"})
/*  99 */   public CommonResponse passHeadImage(String providerId) { return this.adminService.passHeadImage(providerId); }
 
 
 
 
   
   @ApiOperation("服务员微信号拒绝")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/denyWechatNo"})
/* 108 */   public CommonResponse denyWechatNo(String providerId) { return this.adminService.denyWechatNo(providerId); }
 
 
 
 
   
   @ApiOperation("服务员微信号审核通过")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/passWechatNo"})
/* 117 */   public CommonResponse passWechatNo(String providerId) { return this.adminService.passWechatNo(providerId); }
 
 
 
 
   
   @ApiOperation("服务员简介拒绝")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/denyContent"})
/* 126 */   public CommonResponse denyContent(String providerId) { return this.adminService.denyContent(providerId); }
 
 
 
 
   
   @ApiOperation("服务员简介审核通过")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员id", dataType = "String", required = true)})
   @PostMapping({"/passContent"})
/* 135 */   public CommonResponse passContent(String providerId) { return this.adminService.passContent(providerId); }
 
 
   
   @ApiOperation("资金管理")
   @GetMapping({"/moneyCommand"})
/* 141 */   public CommonResponse moneyCommand() { return this.adminService.moneyCommand(); }
 
   
   @ApiOperation("服务类型列表")
   @GetMapping({"/queryProviderType"})
/* 146 */   public CommonResponse queryProviderType() { return this.adminService.queryProviderType(); }
 
   
   @ApiOperation("新增服务类型")
   @PostMapping({"/insertProviderType"})
/* 151 */   public CommonResponse insertProviderType(@RequestBody ProviderType providerType) { return this.adminService.insertProviderType(providerType); }
 
 
   
   @ApiOperation("修改服务类型")
   @PostMapping({"/updateProviderType"})
/* 157 */   public CommonResponse updateProviderType(@RequestBody ProviderType providerType) { return this.adminService.updateProviderType(providerType); }
 
 
   
   @ApiOperation("删除服务类型")
   @PostMapping({"/deleteProviderType"})
/* 163 */   public CommonResponse deleteProviderType(@RequestBody ProviderType providerType) { return this.adminService.deleteProviderType(providerType); }
 
 
 
 
 
   
   @ApiOperation("服务员审核通过")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true)})
   @PostMapping({"/providerPass"})
/* 173 */   public CommonResponse providerPass(String providerId) { return this.adminService.providerPass(providerId); }
 
 
 
 
   
   @ApiOperation("服务员审核拒绝")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true)})
   @PostMapping({"/providerDeny"})
/* 182 */   public CommonResponse providerDeny(String providerId) { return this.adminService.providerDeny(providerId); }
 
 
 
 
 
   
   @ApiOperation("服务员声音通过")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true), @ApiImplicitParam(name = "typeId", value = "服务类型Id", dataType = "string", required = true)})
   @PostMapping({"/providerViocePass"})
/* 192 */   public CommonResponse providerViocePass(String providerId, String typeId) { return this.adminService.providerViocePass(providerId, typeId); }
 
 
 
 
 
   
   @ApiOperation("服务员声音拒绝")
   @ApiImplicitParams({@ApiImplicitParam(name = "providerId", value = "服务员Id", dataType = "string", required = true), @ApiImplicitParam(name = "typeId", value = "服务类型Id", dataType = "string", required = true)})
   @PostMapping({"/providerVioceDeny"})
/* 202 */   public CommonResponse providerVioceDeny(String providerId, String typeId) { return this.adminService.providerVioceDeny(providerId, typeId); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\controller\AdminController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
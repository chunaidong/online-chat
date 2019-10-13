/*     */ package com.wangmike.chat.server.impl;
/*     */ 
/*     */ import com.cgclecc.devarch.jsoncore.util.IdGenerator;
/*     */ import com.github.pagehelper.PageHelper;
/*     */ import com.github.pagehelper.PageInfo;
/*     */ import com.wangmike.chat.common.constant.CommonResponse;
/*     */ import com.wangmike.chat.common.entity.ProviderType;
/*     */ import com.wangmike.chat.common.response.ConsumerForAdmin;
/*     */ import com.wangmike.chat.common.response.OrderForAdminResponse;
/*     */ import com.wangmike.chat.common.response.ProHeaderAudit;
/*     */ import com.wangmike.chat.common.response.ProviderResponseForAdmin;
/*     */ import com.wangmike.chat.server.impl.AdminService;
/*     */ import com.wangmike.chat.server.persistence.ConsumerMapper;
/*     */ import com.wangmike.chat.server.persistence.ConsumerOrderMapper;
/*     */ import com.wangmike.chat.server.persistence.ProviderMapper;
/*     */ import com.wangmike.chat.server.utils.ResponseUtils;
/*     */ import com.wangmike.chat.service.ProviderHeadImageService;
/*     */ import java.io.File;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.beans.factory.annotation.Value;
/*     */ import org.springframework.stereotype.Service;
/*     */ 
/*     */ @Service
/*     */ public class AdminService
/*     */ {
/*     */   @Autowired
/*     */   private ConsumerOrderMapper consumerOrderMapper;
/*     */   @Autowired
/*     */   private ConsumerMapper consumerMapper;
/*     */   @Autowired
/*     */   private ProviderMapper providerMapper;
/*     */   @Autowired
/*     */   private ProviderHeadImageService providerHeadImageService;
/*     */   @Value("${withdraw.money}")
/*     */   private String withdrawMoeny;
/*  43 */   private Logger logger = LoggerFactory.getLogger(AdminService.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse getAllOrderList(int page, int size) {
/*  54 */     PageHelper.startPage(page, size);
/*  55 */     List<OrderForAdminResponse> orderLists = this.consumerOrderMapper.getAllOrderList();
/*  56 */     orderLists.stream().forEach(orderForAdminResponse -> {
/*  57 */           orderForAdminResponse.setUsedAmount(orderForAdminResponse
/*  58 */               .getOrderAmount()
/*  59 */               .multiply(new BigDecimal(this.withdrawMoeny)));
/*  60 */           orderForAdminResponse.setRestAmount(orderForAdminResponse.getOrderAmount()
/*  61 */               .subtract(orderForAdminResponse.getUsedAmount()));
/*     */         });
/*  63 */     PageInfo<OrderForAdminResponse> pages = new PageInfo<OrderForAdminResponse>(orderLists);
/*  64 */     return ResponseUtils.buildSuccessResoonse(pages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse getAllConsumerList(int page, int size) {
/*  77 */     PageHelper.startPage(page, size);
/*  78 */     List<ConsumerForAdmin> orderLists = this.consumerMapper.getAllConsumerList();
/*  79 */     PageInfo<ConsumerForAdmin> pages = new PageInfo<ConsumerForAdmin>(orderLists);
/*  80 */     return ResponseUtils.buildSuccessResoonse(pages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse getAllProviderList(int page, int size) {
/*  90 */     PageHelper.startPage(page, size);
/*  91 */     List<ProviderResponseForAdmin> orderLists = this.providerMapper.getAllProviderList();
/*  92 */     orderLists.stream().forEach(providerResponseForList -> {
/*  93 */           List<String> headerList = this.providerHeadImageService.getProHeadsById(providerResponseForList.getProviderId());
/*  94 */           if (headerList.size() > 0) {
/*  95 */             providerResponseForList.setHeadsLists(headerList);
/*     */           }
/*  97 */           if (StringUtils.equals("0", providerResponseForList.getProviderAduitState())) {
/*  98 */             providerResponseForList.setWaitAudit(true);
/*     */           }
/*     */         });
/*     */     
/* 102 */     PageInfo<ProviderResponseForAdmin> pages = new PageInfo<ProviderResponseForAdmin>(orderLists);
/* 103 */     return ResponseUtils.buildSuccessResoonse(pages);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse onlineState(String providerId) {
/* 112 */     this.providerMapper.onlineState(providerId);
/* 113 */     return ResponseUtils.buildSuccessResoonse("修改成功");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse offlineState(String providerId) {
/* 122 */     this.providerMapper.offlineState(providerId);
/* 123 */     return ResponseUtils.buildSuccessResoonse("修改成功");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse getWaitAuditData() {
/* 132 */     List<ProHeaderAudit> proHeaderAuditList = this.providerMapper.getAllWaitHeaderList();
/* 133 */     proHeaderAuditList.stream().forEach(proHeaderAudit -> {
/* 134 */           List<String> auditList = this.providerMapper.queryWaitAuditList(proHeaderAudit.getProviderId());
/* 135 */           proHeaderAudit.setHeaderList(auditList);
/*     */         });
/*     */     
/* 138 */     List<Map<String, Object>> auditProvider = this.providerMapper.queryWaitProvider();
/*     */     
/* 140 */     List<Map<String, Object>> contensProvider = this.providerMapper.queryWaitContens();
/*     */     
/* 142 */     List<Map<String, Object>> voiceLists = this.providerMapper.queryVoiceLists();
/* 143 */     Map<String, Object> map = new HashMap<String, Object>();
/* 144 */     map.put("headerList", proHeaderAuditList);
/* 145 */     map.put("wechatList", auditProvider);
/* 146 */     map.put("contentList", contensProvider);
/* 147 */     map.put("voiceList", voiceLists);
/* 148 */     return ResponseUtils.buildSuccessResoonse(map);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse removeHeadImage(String finalPath) {
/* 158 */     this.logger.info("删除图片路径为【" + finalPath + "】");
/* 159 */     this.providerMapper.removeHeadImage(finalPath);
/*     */     
/* 161 */     File file = new File(finalPath);
/* 162 */     if (file.exists() && file.isFile()) {
/* 163 */       file.delete();
/*     */     }
/* 165 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse denyHeadImage(String providerId) {
/* 175 */     this.providerMapper.auditHeadImage(providerId, "0");
/* 176 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse passHeadImage(String providerId) {
/* 185 */     this.providerMapper.auditHeadImage(providerId, "1");
/* 186 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse denyWechatNo(String providerId) {
/* 195 */     this.providerMapper.auditWechatNo(providerId, "4");
/* 196 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse passWechatNo(String providerId) {
/* 204 */     this.providerMapper.auditWechatNo(providerId, "5");
/* 205 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse denyContent(String providerId) {
/* 214 */     this.providerMapper.auditContent(providerId, "1");
/* 215 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse passContent(String providerId) {
/* 224 */     this.providerMapper.auditContent(providerId, "2");
/* 225 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse moneyCommand() {
/* 233 */     Map<String, Object> resultMap = new HashMap<String, Object>();
/*     */     
/* 235 */     BigDecimal restAmount = this.providerMapper.getRestAmount();
/*     */     
/* 237 */     BigDecimal totalReceive = this.providerMapper.getTotalReceive();
/*     */     
/* 239 */     BigDecimal withdraw = this.providerMapper.getWithDrawTotal();
/*     */     
/* 241 */     BigDecimal proReceive = this.providerMapper.getProReceive();
/* 242 */     BigDecimal totalSy = proReceive.divide(new BigDecimal(this.withdrawMoeny)).multiply((new BigDecimal("1"))
/* 243 */         .subtract(new BigDecimal(this.withdrawMoeny)));
/*     */     
/* 245 */     resultMap.put("platformBalance", restAmount);
/* 246 */     resultMap.put("chargeAmount", totalReceive);
/* 247 */     resultMap.put("withdrawCash", withdraw);
/* 248 */     resultMap.put("platformRevenue", totalSy);
/* 249 */     return ResponseUtils.buildSuccessResoonse(resultMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse queryProviderType() {
/* 257 */     List<ProviderType> providerTypes = this.providerMapper.queryProviderType();
/* 258 */     return ResponseUtils.buildSuccessResoonse(providerTypes);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse insertProviderType(ProviderType providerType) {
/* 267 */     providerType.setTypeId(IdGenerator.getDefaultId() + "");
/* 268 */     this.providerMapper.insertProviderType(providerType);
/* 269 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse updateProviderType(ProviderType providerType) {
/* 278 */     this.providerMapper.updateProviderType(providerType);
/* 279 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse deleteProviderType(ProviderType providerType) {
/* 288 */     this.providerMapper.deleteProviderType(providerType.getTypeId());
/* 289 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse providerPass(String providerId) {
/* 298 */     this.providerMapper.providerPass(providerId);
/* 299 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse providerDeny(String providerId) {
/* 308 */     this.providerMapper.providerDeny(providerId);
/* 309 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse providerViocePass(String providerId, String typeId) {
/* 319 */     this.providerMapper.providerViocePass(providerId, typeId);
/* 320 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommonResponse providerVioceDeny(String providerId, String typeId) {
/* 330 */     this.providerMapper.providerVioceDeny(providerId, typeId);
/* 331 */     return ResponseUtils.buildSuccessResoonse("SUCCESS");
/*     */   }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\AdminService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
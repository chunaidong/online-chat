/*     */ package com.wangmike.chat.common.response;
/*     */ 
/*     */ import com.wangmike.chat.common.utils.ResponseEnumUtils;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProviderResponseForOrderList
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -1L;
/*     */   private String providerId;
/*     */   private String orderId;
/*     */   @ApiModelProperty(value = "名称", name = "providerNickName")
/*     */   private String providerNickName;
/*     */   @ApiModelProperty(value = "年龄", name = "providerAge")
/*     */   private Integer providerAge;
/*     */   @ApiModelProperty(value = "性别", name = "providerSex")
/*     */   private String providerSex;
/*     */   private Date expireStartDate;
/*     */   private String orderState;
/*     */   private String orderStateName;
/*     */   private String providerRawWechatNo;
/*     */   @ApiModelProperty(value = "简介", name = "providerContent")
/*     */   private String providerContent;
/*     */   private List<String> headsLists;
/*     */   private String providerTime;
/*     */   private String providerType;
/*     */   
/*  85 */   public String getProviderType() { return this.providerType; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public void setProviderType(String providerType) { this.providerType = providerType; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public String getProviderNickName() { return this.providerNickName; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public Integer getProviderAge() { return this.providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public String getProviderSex() { return this.providerSex; }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public Date getExpireStartDate() { return this.expireStartDate; }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public void setExpireStartDate(Date expireStartDate) { this.expireStartDate = expireStartDate; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public String getOrderState() { return this.orderState; }
/*     */ 
/*     */   
/*     */   public void setOrderState(String orderState) {
/* 129 */     this.orderState = orderState;
/* 130 */     this.orderStateName = ResponseEnumUtils.getOrderStateEnum(orderState);
/*     */   }
/*     */ 
/*     */   
/* 134 */   public String getOrderStateName() { return this.orderStateName; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public void setOrderStateName(String orderStateName) { this.orderStateName = orderStateName; }
/*     */ 
/*     */ 
/*     */   
/* 142 */   public String getProviderRawWechatNo() { return this.providerRawWechatNo; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public void setProviderRawWechatNo(String providerRawWechatNo) { this.providerRawWechatNo = providerRawWechatNo; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public String getProviderContent() { return this.providerContent; }
/*     */ 
/*     */ 
/*     */   
/* 154 */   public void setProviderContent(String providerContent) { this.providerContent = providerContent; }
/*     */ 
/*     */ 
/*     */   
/* 158 */   public List<String> getHeadsLists() { return this.headsLists; }
/*     */ 
/*     */ 
/*     */   
/* 162 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }
/*     */ 
/*     */ 
/*     */   
/* 166 */   public String getProviderTime() { return this.providerTime; }
/*     */ 
/*     */ 
/*     */   
/* 170 */   public void setProviderTime(String providerTime) { this.providerTime = providerTime; }
/*     */ 
/*     */   
/* 173 */   public String getProviderId() { return this.providerId; }
/*     */ 
/*     */ 
/*     */   
/* 177 */   public void setProviderId(String providerId) { this.providerId = providerId; }
/*     */ 
/*     */ 
/*     */   
/* 181 */   public String getOrderId() { return this.orderId; }
/*     */ 
/*     */ 
/*     */   
/* 185 */   public void setOrderId(String orderId) { this.orderId = orderId; }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseForOrderList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
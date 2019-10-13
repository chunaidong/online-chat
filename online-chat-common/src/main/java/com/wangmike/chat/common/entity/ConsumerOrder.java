/*     */ package com.wangmike.chat.common.entity;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
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
/*     */ public class ConsumerOrder
/*     */   implements Serializable
/*     */ {
/*     */   private String orderId;
/*     */   private String orderState;
/*     */   private String consumerId;
/*     */   private String providerId;
/*     */   private String providerType;
/*     */   private String providerTime;
/*     */   private BigDecimal orderAmount;
/*     */   private Date orderTime;
/*     */   private Date payTime;
/*     */   private Date receiveTime;
/*     */   private Date expactStartTime;
/*     */   private Date startChatTime;
/*     */   private Date confirmStartChatTime;
/*     */   private Date orderFinishTime;
/*     */   private Date closeTime;
/*     */   private String closeReason;
/*     */   private String billingState;
/*     */   
/*  43 */   public String getOrderId() { return this.orderId; }
/*     */ 
/*     */ 
/*     */   
/*  47 */   public void setOrderId(String orderId) { this.orderId = (orderId == null) ? null : orderId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  51 */   public String getOrderState() { return this.orderState; }
/*     */ 
/*     */ 
/*     */   
/*  55 */   public void setOrderState(String orderState) { this.orderState = (orderState == null) ? null : orderState.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  59 */   public String getConsumerId() { return this.consumerId; }
/*     */ 
/*     */ 
/*     */   
/*  63 */   public void setConsumerId(String consumerId) { this.consumerId = (consumerId == null) ? null : consumerId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  67 */   public String getProviderId() { return this.providerId; }
/*     */ 
/*     */ 
/*     */   
/*  71 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  75 */   public String getProviderType() { return this.providerType; }
/*     */ 
/*     */ 
/*     */   
/*  79 */   public void setProviderType(String providerType) { this.providerType = (providerType == null) ? null : providerType.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  83 */   public String getProviderTime() { return this.providerTime; }
/*     */ 
/*     */ 
/*     */   
/*  87 */   public void setProviderTime(String providerTime) { this.providerTime = (providerTime == null) ? null : providerTime.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public BigDecimal getOrderAmount() { return this.orderAmount; }
/*     */ 
/*     */ 
/*     */   
/*  95 */   public void setOrderAmount(BigDecimal orderAmount) { this.orderAmount = orderAmount; }
/*     */ 
/*     */ 
/*     */   
/*  99 */   public Date getOrderTime() { return this.orderTime; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setOrderTime(Date orderTime) { this.orderTime = orderTime; }
/*     */ 
/*     */ 
/*     */   
/* 107 */   public Date getPayTime() { return this.payTime; }
/*     */ 
/*     */ 
/*     */   
/* 111 */   public void setPayTime(Date payTime) { this.payTime = payTime; }
/*     */ 
/*     */ 
/*     */   
/* 115 */   public Date getReceiveTime() { return this.receiveTime; }
/*     */ 
/*     */ 
/*     */   
/* 119 */   public void setReceiveTime(Date receiveTime) { this.receiveTime = receiveTime; }
/*     */ 
/*     */ 
/*     */   
/* 123 */   public Date getExpactStartTime() { return this.expactStartTime; }
/*     */ 
/*     */ 
/*     */   
/* 127 */   public void setExpactStartTime(Date expactStartTime) { this.expactStartTime = expactStartTime; }
/*     */ 
/*     */ 
/*     */   
/* 131 */   public Date getStartChatTime() { return this.startChatTime; }
/*     */ 
/*     */ 
/*     */   
/* 135 */   public void setStartChatTime(Date startChatTime) { this.startChatTime = startChatTime; }
/*     */ 
/*     */ 
/*     */   
/* 139 */   public Date getConfirmStartChatTime() { return this.confirmStartChatTime; }
/*     */ 
/*     */ 
/*     */   
/* 143 */   public void setConfirmStartChatTime(Date confirmStartChatTime) { this.confirmStartChatTime = confirmStartChatTime; }
/*     */ 
/*     */ 
/*     */   
/* 147 */   public Date getOrderFinishTime() { return this.orderFinishTime; }
/*     */ 
/*     */ 
/*     */   
/* 151 */   public void setOrderFinishTime(Date orderFinishTime) { this.orderFinishTime = orderFinishTime; }
/*     */ 
/*     */ 
/*     */   
/* 155 */   public Date getCloseTime() { return this.closeTime; }
/*     */ 
/*     */ 
/*     */   
/* 159 */   public void setCloseTime(Date closeTime) { this.closeTime = closeTime; }
/*     */ 
/*     */ 
/*     */   
/* 163 */   public String getCloseReason() { return this.closeReason; }
/*     */ 
/*     */ 
/*     */   
/* 167 */   public void setCloseReason(String closeReason) { this.closeReason = (closeReason == null) ? null : closeReason.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 171 */   public String getBillingState() { return this.billingState; }
/*     */ 
/*     */ 
/*     */   
/* 175 */   public void setBillingState(String billingState) { this.billingState = (billingState == null) ? null : billingState.trim(); }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\ConsumerOrder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
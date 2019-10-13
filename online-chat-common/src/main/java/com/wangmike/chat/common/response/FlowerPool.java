/*    */ package com.wangmike.chat.common.response;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FlowerPool
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -11L;
/*    */   private Date detailDate;
/*    */   private String tradeType;
/*    */   private String providerType;
/*    */   private BigDecimal detailAmount;
/*    */   
/* 33 */   public Date getDetailDate() { return this.detailDate; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setDetailDate(Date detailDate) { this.detailDate = detailDate; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public String getTradeType() { return this.tradeType; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setTradeType(String tradeType) { this.tradeType = tradeType; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String getProviderType() { return this.providerType; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setProviderType(String providerType) { this.providerType = providerType; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public BigDecimal getDetailAmount() { return this.detailAmount; }
/*    */ 
/*    */ 
/*    */   
/* 61 */   public void setDetailAmount(BigDecimal detailAmount) { this.detailAmount = detailAmount; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\FlowerPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
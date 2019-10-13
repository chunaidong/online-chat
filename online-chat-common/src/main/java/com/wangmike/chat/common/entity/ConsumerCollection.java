/*    */ package com.wangmike.chat.common.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class ConsumerCollection
/*    */   implements Serializable
/*    */ {
/*    */   private String consumerId;
/*    */   private String providerId;
/*    */   
/* 11 */   public String getConsumerId() { return this.consumerId; }
/*    */ 
/*    */ 
/*    */   
/* 15 */   public void setConsumerId(String consumerId) { this.consumerId = (consumerId == null) ? null : consumerId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 19 */   public String getProviderId() { return this.providerId; }
/*    */ 
/*    */ 
/*    */   
/* 23 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\ConsumerCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
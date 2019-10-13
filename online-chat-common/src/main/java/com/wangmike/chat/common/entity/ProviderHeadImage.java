/*    */ package com.wangmike.chat.common.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ public class ProviderHeadImage
/*    */   implements Serializable
/*    */ {
/*    */   private String providerId;
/*    */   private String hearImage;
/*    */   private String auditState;
/*    */   
/* 13 */   public String getProviderId() { return this.providerId; }
/*    */ 
/*    */ 
/*    */   
/* 17 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 21 */   public String getHearImage() { return this.hearImage; }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public void setHearImage(String hearImage) { this.hearImage = (hearImage == null) ? null : hearImage.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public String getAuditState() { return this.auditState; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void setAuditState(String auditState) { this.auditState = (auditState == null) ? null : auditState.trim(); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\ProviderHeadImage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
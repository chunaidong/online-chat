/*    */ package com.wangmike.chat.common.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProviderType
/*    */   implements Serializable
/*    */ {
/*    */   private String typeId;
/*    */   private String typeName;
/*    */   private BigDecimal typePrice;
/*    */   private int total;
/*    */   private String filePath;
/*    */   private String voiceAudit;
/*    */   
/* 20 */   public String getFilePath() { return this.filePath; }
/*    */ 
/*    */ 
/*    */   
/* 24 */   public void setFilePath(String filePath) { this.filePath = filePath; }
/*    */ 
/*    */ 
/*    */   
/* 28 */   public String getVoiceAudit() { return this.voiceAudit; }
/*    */ 
/*    */ 
/*    */   
/* 32 */   public void setVoiceAudit(String voiceAudit) { this.voiceAudit = voiceAudit; }
/*    */ 
/*    */ 
/*    */   
/* 36 */   public int getTotal() { return this.total; }
/*    */ 
/*    */ 
/*    */   
/* 40 */   public void setTotal(int total) { this.total = total; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public String getTypeId() { return this.typeId; }
/*    */ 
/*    */ 
/*    */   
/* 48 */   public void setTypeId(String typeId) { this.typeId = (typeId == null) ? null : typeId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 52 */   public String getTypeName() { return this.typeName; }
/*    */ 
/*    */ 
/*    */   
/* 56 */   public void setTypeName(String typeName) { this.typeName = (typeName == null) ? null : typeName.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 60 */   public BigDecimal getTypePrice() { return this.typePrice; }
/*    */ 
/*    */ 
/*    */   
/* 64 */   public void setTypePrice(BigDecimal typePrice) { this.typePrice = typePrice; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\ProviderType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
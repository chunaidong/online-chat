 package com.wangmike.chat.common.entity;

 import java.io.Serializable;
 import java.util.Date;




 public class TypeCollection
   implements Serializable
 {
   private String providerId;
   private String typeId;
   private Date createTime;
   private String filePath;
   private String voiceAudit;

/* 18 */   public String getFilePath() { return this.filePath; }



/* 22 */   public void setFilePath(String filePath) { this.filePath = filePath; }



/* 26 */   public String getVoiceAudit() { return this.voiceAudit; }



/* 30 */   public void setVoiceAudit(String voiceAudit) { this.voiceAudit = voiceAudit; }



/* 34 */   public Date getCreateTime() { return this.createTime; }



/* 38 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }



/* 42 */   public String getProviderId() { return this.providerId; }



/* 46 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }



/* 50 */   public String getTypeId() { return this.typeId; }



/* 54 */   public void setTypeId(String typeId) { this.typeId = (typeId == null) ? null : typeId.trim(); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\TypeCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
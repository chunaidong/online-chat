 package com.wangmike.chat.common.entity;

 import java.io.Serializable;
 import java.math.BigDecimal;
 import java.util.Date;





















 public class Provider
   implements Serializable
 {
   private String providerId;
   private String providerNickName;
   private String providerWechatNo;
   private Date providerBirthDay;
   private String providerSex;
   private String providerStature;
   private String providerProfession;
   private String providerEmotion;
   private String providerContent;
   private String providerSignature;
   private String providerOnlineState;
   private String providerIsable;
   private BigDecimal providerLastLoginLat;
   private BigDecimal providerLastLoginLng;
   private String providerAduitState;
   private String walletId;
   private String providerRawWechatNo;
   private String providerRawContent;
   private String contentAudit;
   private String audioMsg;
   private Integer providerAge;
   private Date createTime;

/*  53 */   public String getProviderRawContent() { return this.providerRawContent; }



/*  57 */   public void setProviderRawContent(String providerRawContent) { this.providerRawContent = providerRawContent; }



/*  61 */   public String getContentAudit() { return this.contentAudit; }



/*  65 */   public void setContentAudit(String contentAudit) { this.contentAudit = contentAudit; }



/*  69 */   public String getProviderId() { return this.providerId; }



/*  73 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }



/*  77 */   public String getProviderNickName() { return this.providerNickName; }



/*  81 */   public void setProviderNickName(String providerNickName) { this.providerNickName = (providerNickName == null) ? null : providerNickName.trim(); }



/*  85 */   public String getProviderWechatNo() { return this.providerWechatNo; }



/*  89 */   public void setProviderWechatNo(String providerWechatNo) { this.providerWechatNo = (providerWechatNo == null) ? null : providerWechatNo.trim(); }



/*  93 */   public Date getProviderBirthDay() { return this.providerBirthDay; }



/*  97 */   public void setProviderBirthDay(Date providerBirthDay) { this.providerBirthDay = providerBirthDay; }



/* 101 */   public String getProviderSex() { return this.providerSex; }



/* 105 */   public void setProviderSex(String providerSex) { this.providerSex = (providerSex == null) ? null : providerSex.trim(); }



/* 109 */   public String getProviderStature() { return this.providerStature; }



/* 113 */   public void setProviderStature(String providerStature) { this.providerStature = (providerStature == null) ? null : providerStature.trim(); }



/* 117 */   public String getProviderProfession() { return this.providerProfession; }



/* 121 */   public void setProviderProfession(String providerProfession) { this.providerProfession = (providerProfession == null) ? null : providerProfession.trim(); }



/* 125 */   public String getProviderEmotion() { return this.providerEmotion; }



/* 129 */   public void setProviderEmotion(String providerEmotion) { this.providerEmotion = (providerEmotion == null) ? null : providerEmotion.trim(); }



/* 133 */   public String getProviderContent() { return this.providerContent; }



/* 137 */   public void setProviderContent(String providerContent) { this.providerContent = (providerContent == null) ? null : providerContent.trim(); }



/* 141 */   public String getProviderSignature() { return this.providerSignature; }



/* 145 */   public void setProviderSignature(String providerSignature) { this.providerSignature = (providerSignature == null) ? null : providerSignature.trim(); }



/* 149 */   public String getProviderOnlineState() { return this.providerOnlineState; }



/* 153 */   public void setProviderOnlineState(String providerOnlineState) { this.providerOnlineState = (providerOnlineState == null) ? null : providerOnlineState.trim(); }



/* 157 */   public String getProviderIsable() { return this.providerIsable; }



/* 161 */   public void setProviderIsable(String providerIsable) { this.providerIsable = providerIsable; }



/* 165 */   public BigDecimal getProviderLastLoginLat() { return this.providerLastLoginLat; }



/* 169 */   public void setProviderLastLoginLat(BigDecimal providerLastLoginLat) { this.providerLastLoginLat = providerLastLoginLat; }



/* 173 */   public BigDecimal getProviderLastLoginLng() { return this.providerLastLoginLng; }



/* 177 */   public void setProviderLastLoginLng(BigDecimal providerLastLoginLng) { this.providerLastLoginLng = providerLastLoginLng; }



/* 181 */   public String getProviderAduitState() { return this.providerAduitState; }



/* 185 */   public void setProviderAduitState(String providerAduitState) { this.providerAduitState = (providerAduitState == null) ? null : providerAduitState.trim(); }



/* 189 */   public String getWalletId() { return this.walletId; }



/* 193 */   public void setWalletId(String walletId) { this.walletId = (walletId == null) ? null : walletId.trim(); }



/* 197 */   public String getProviderRawWechatNo() { return this.providerRawWechatNo; }



/* 201 */   public void setProviderRawWechatNo(String providerRawWechatNo) { this.providerRawWechatNo = (providerRawWechatNo == null) ? null : providerRawWechatNo.trim(); }



/* 205 */   public String getAudioMsg() { return this.audioMsg; }



/* 209 */   public void setAudioMsg(String audioMsg) { this.audioMsg = (audioMsg == null) ? null : audioMsg.trim(); }



/* 213 */   public Integer getProviderAge() { return this.providerAge; }



/* 217 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }



/* 221 */   public Date getCreateTime() { return this.createTime; }



/* 225 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\Provider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
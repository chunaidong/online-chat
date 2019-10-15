 package com.wangmike.chat.common.entity;

 import java.io.Serializable;
 import java.math.BigDecimal;
 import java.util.Date;




















 public class Consumer
   implements Serializable
 {
   private String consumerId;
   private String consumerNickName;
   private String consumerHeadImage;
   private String consumerSex;
   private Integer consumerVipLevel;
   private Date consumerBirthDay;
   private BigDecimal consumerLastLoginLat;
   private BigDecimal consumerLastLoginLng;
   private String consumerUserRole;
   private String providerId;
   private String walletId;
   private String consumerContent;
   private Date createTime;

/*  43 */   public String getConsumerId() { return this.consumerId; }



/*  47 */   public void setConsumerId(String consumerId) { this.consumerId = (consumerId == null) ? null : consumerId.trim(); }



/*  51 */   public String getConsumerNickName() { return this.consumerNickName; }



/*  55 */   public void setConsumerNickName(String consumerNickName) { this.consumerNickName = (consumerNickName == null) ? null : consumerNickName.trim(); }



/*  59 */   public String getConsumerHeadImage() { return this.consumerHeadImage; }



/*  63 */   public void setConsumerHeadImage(String consumerHeadImage) { this.consumerHeadImage = (consumerHeadImage == null) ? null : consumerHeadImage.trim(); }



/*  67 */   public String getConsumerSex() { return this.consumerSex; }



/*  71 */   public void setConsumerSex(String consumerSex) { this.consumerSex = (consumerSex == null) ? null : consumerSex.trim(); }



/*  75 */   public Integer getConsumerVipLevel() { return this.consumerVipLevel; }



/*  79 */   public void setConsumerVipLevel(Integer consumerVipLevel) { this.consumerVipLevel = consumerVipLevel; }



/*  83 */   public Date getConsumerBirthDay() { return this.consumerBirthDay; }



/*  87 */   public void setConsumerBirthDay(Date consumerBirthDay) { this.consumerBirthDay = consumerBirthDay; }



/*  91 */   public BigDecimal getConsumerLastLoginLat() { return this.consumerLastLoginLat; }



/*  95 */   public void setConsumerLastLoginLat(BigDecimal consumerLastLoginLat) { this.consumerLastLoginLat = consumerLastLoginLat; }



/*  99 */   public BigDecimal getConsumerLastLoginLng() { return this.consumerLastLoginLng; }



/* 103 */   public void setConsumerLastLoginLng(BigDecimal consumerLastLoginLng) { this.consumerLastLoginLng = consumerLastLoginLng; }



/* 107 */   public String getConsumerUserRole() { return this.consumerUserRole; }



/* 111 */   public void setConsumerUserRole(String consumerUserRole) { this.consumerUserRole = (consumerUserRole == null) ? null : consumerUserRole.trim(); }



/* 115 */   public String getProviderId() { return this.providerId; }



/* 119 */   public void setProviderId(String providerId) { this.providerId = (providerId == null) ? null : providerId.trim(); }



/* 123 */   public String getWalletId() { return this.walletId; }



/* 127 */   public void setWalletId(String walletId) { this.walletId = (walletId == null) ? null : walletId.trim(); }



/* 131 */   public String getConsumerContent() { return this.consumerContent; }



/* 135 */   public void setConsumerContent(String consumerContent) { this.consumerContent = (consumerContent == null) ? null : consumerContent.trim(); }



/* 139 */   public Date getCreateTime() { return this.createTime; }



/* 143 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\Consumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
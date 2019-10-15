 package com.wangmike.chat.common.response;

 import com.wangmike.chat.common.utils.ResponseEnumUtils;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.math.BigDecimal;
 import java.util.Date;
 import java.util.List;






















 @ApiModel("后台 服务员列表")
 public class ProviderResponseForAdmin
 {
   @ApiModelProperty(value = "主键", name = "providerId")
   private String providerId;
   @ApiModelProperty(value = "名称", name = "providerNickName")
   private String providerNickName;
   @ApiModelProperty(value = "性别", name = "providerSex")
   private String providerSex;
   @ApiModelProperty(value = "出生日期", name = "providerBirthDay")
   private Date providerBirthDay;
   @ApiModelProperty(value = "职业", name = "providerProfession")
   private String providerProfession;
   @ApiModelProperty(value = "情感状况", name = "providerEmotion")
   private String providerEmotion;
   @ApiModelProperty(value = "注册日期", name = "createTime")
   private Date createTime;
   @ApiModelProperty(value = "微信号", name = "providerWechatNo")
   private String providerWechatNo;
   @ApiModelProperty(value = "接单数", name = "orderCount")
   private int orderCount;
   @ApiModelProperty(value = "接单金额", name = "orderAmount")
   private BigDecimal orderAmount;
   @ApiModelProperty(value = "收入", name = "receiveAmount")
   private BigDecimal receiveAmount;
   @ApiModelProperty(value = "待审核", name = "waitAudit")
   private boolean waitAudit;
   @ApiModelProperty(value = "存在待审核头像", name = "waitHeadAudit")
   private int waitHeadAudit;
   @ApiModelProperty(value = "服务员上下架", name = "providerOnlineState")
   private String providerOnlineState;
   @ApiModelProperty(value = "简介审核状态", name = "providerOnlineState")
   private String contentAudit;
   @ApiModelProperty(value = "审核状态", name = "providerOnlineState")
   private String providerAduitState;
   private String providerEmotionName;
   private List<String> headsLists;

/*  69 */   public String getContentAudit() { return this.contentAudit; }



/*  73 */   public void setContentAudit(String contentAudit) { this.contentAudit = contentAudit; }



/*  77 */   public String getProviderAduitState() { return this.providerAduitState; }



/*  81 */   public void setProviderAduitState(String providerAduitState) { this.providerAduitState = providerAduitState; }



/*  85 */   public int getWaitHeadAudit() { return this.waitHeadAudit; }



/*  89 */   public void setWaitHeadAudit(int waitHeadAudit) { this.waitHeadAudit = waitHeadAudit; }



/*  93 */   public String getProviderOnlineState() { return this.providerOnlineState; }



/*  97 */   public void setProviderOnlineState(String providerOnlineState) { this.providerOnlineState = providerOnlineState; }



/* 101 */   public boolean isWaitAudit() { return this.waitAudit; }



/* 105 */   public void setWaitAudit(boolean waitAudit) { this.waitAudit = waitAudit; }



/* 109 */   public List<String> getHeadsLists() { return this.headsLists; }



/* 113 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }



/* 117 */   public String getProviderId() { return this.providerId; }



/* 121 */   public void setProviderId(String providerId) { this.providerId = providerId; }



/* 125 */   public String getProviderNickName() { return this.providerNickName; }



/* 129 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }



/* 133 */   public String getProviderSex() { return this.providerSex; }



/* 137 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }



/* 141 */   public Date getProviderBirthDay() { return this.providerBirthDay; }



/* 145 */   public void setProviderBirthDay(Date providerBirthDay) { this.providerBirthDay = providerBirthDay; }



/* 149 */   public String getProviderProfession() { return this.providerProfession; }



/* 153 */   public void setProviderProfession(String providerProfession) { this.providerProfession = providerProfession; }



/* 157 */   public String getProviderEmotion() { return this.providerEmotion; }


   public void setProviderEmotion(String providerEmotion) {
/* 161 */     this.providerEmotion = providerEmotion;
/* 162 */     this.providerEmotionName = ResponseEnumUtils.getEmotionStateEnum(this.providerEmotion);
   }


/* 166 */   public Date getCreateTime() { return this.createTime; }



/* 170 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }



/* 174 */   public String getProviderWechatNo() { return this.providerWechatNo; }



/* 178 */   public void setProviderWechatNo(String providerWechatNo) { this.providerWechatNo = providerWechatNo; }



/* 182 */   public int getOrderCount() { return this.orderCount; }



/* 186 */   public void setOrderCount(int orderCount) { this.orderCount = orderCount; }



/* 190 */   public BigDecimal getOrderAmount() { return this.orderAmount; }



/* 194 */   public void setOrderAmount(BigDecimal orderAmount) { this.orderAmount = orderAmount; }



/* 198 */   public BigDecimal getReceiveAmount() { return this.receiveAmount; }



/* 202 */   public void setReceiveAmount(BigDecimal receiveAmount) { this.receiveAmount = receiveAmount; }



/* 206 */   public String getProviderEmotionName() { return this.providerEmotionName; }



/* 210 */   public void setProviderEmotionName(String providerEmotionName) { this.providerEmotionName = providerEmotionName; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseForAdmin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
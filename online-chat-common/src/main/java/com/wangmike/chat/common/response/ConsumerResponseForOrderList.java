 package com.wangmike.chat.common.response;

 import com.wangmike.chat.common.utils.ResponseEnumUtils;
 import io.swagger.annotations.ApiModelProperty;
 import java.io.Serializable;
 import java.util.Date;










 public class ConsumerResponseForOrderList
   implements Serializable
 {
   @ApiModelProperty(value = "昵称", name = "consumerNickName")
   private String consumerNickName;
   @ApiModelProperty(value = "头像", name = "consumerHeadImage")
   private String consumerHeadImage;
   @ApiModelProperty(value = "性别", name = "consumerSex")
   private String consumerSex;
   @ApiModelProperty(value = "等级", name = "consumerVipLevel")
   private Integer consumerVipLevel;
   @ApiModelProperty(value = "出生年月", name = "consumerBirthDay")
   private Date consumerBirthDay;
   @ApiModelProperty(value = "个性签名", name = "consumerContent")
   private String consumerContent;
   @ApiModelProperty(value = "服务时长", name = "providerTime")
   private String providerTime;
   @ApiModelProperty(value = "服务类型", name = "providerType")
   private String providerType;
   @ApiModelProperty(value = "预约开始时间", name = "expactStartTime")
   private Date expactStartTime;
   @ApiModelProperty(value = "订单Id", name = "orderId")
   private String orderId;
   private String orderState;
   private String orderStateName;

/*  43 */   public String getOrderId() { return this.orderId; }



/*  47 */   public void setOrderId(String orderId) { this.orderId = orderId; }



/*  51 */   public String getConsumerNickName() { return this.consumerNickName; }



/*  55 */   public void setConsumerNickName(String consumerNickName) { this.consumerNickName = consumerNickName; }



/*  59 */   public String getConsumerHeadImage() { return this.consumerHeadImage; }



/*  63 */   public void setConsumerHeadImage(String consumerHeadImage) { this.consumerHeadImage = consumerHeadImage; }



/*  67 */   public String getConsumerSex() { return this.consumerSex; }



/*  71 */   public void setConsumerSex(String consumerSex) { this.consumerSex = consumerSex; }



/*  75 */   public Integer getConsumerVipLevel() { return this.consumerVipLevel; }



/*  79 */   public void setConsumerVipLevel(Integer consumerVipLevel) { this.consumerVipLevel = consumerVipLevel; }



/*  83 */   public Date getConsumerBirthDay() { return this.consumerBirthDay; }



/*  87 */   public void setConsumerBirthDay(Date consumerBirthDay) { this.consumerBirthDay = consumerBirthDay; }



/*  91 */   public String getConsumerContent() { return this.consumerContent; }



/*  95 */   public void setConsumerContent(String consumerContent) { this.consumerContent = consumerContent; }



/*  99 */   public String getProviderTime() { return this.providerTime; }



/* 103 */   public void setProviderTime(String providerTime) { this.providerTime = providerTime; }



/* 107 */   public String getProviderType() { return this.providerType; }



/* 111 */   public void setProviderType(String providerType) { this.providerType = providerType; }



/* 115 */   public Date getExpactStartTime() { return this.expactStartTime; }



/* 119 */   public void setExpactStartTime(Date expactStartTime) { this.expactStartTime = expactStartTime; }



/* 123 */   public String getOrderState() { return this.orderState; }


   public void setOrderState(String orderState) {
/* 127 */     this.orderState = orderState;
/* 128 */     this.orderStateName = ResponseEnumUtils.getOrderStateEnum(this.orderState);
   }


/* 132 */   public String getOrderStateName() { return this.orderStateName; }



/* 136 */   public void setOrderStateName(String orderStateName) { this.orderStateName = orderStateName; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ConsumerResponseForOrderList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
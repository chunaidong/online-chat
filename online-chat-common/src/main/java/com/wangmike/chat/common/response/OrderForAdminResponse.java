 package com.wangmike.chat.common.response;

 import com.wangmike.chat.common.utils.ResponseEnumUtils;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.io.Serializable;
 import java.math.BigDecimal;
 import java.util.Date;












 @ApiModel("后台订单对象")
 public class OrderForAdminResponse
   implements Serializable
 {
   private static final long serialVersionUID = -11L;
   @ApiModelProperty(value = "订单编号", name = "orderId")
   private String orderId;
   @ApiModelProperty(value = "用户名称", name = "consumerName")
   private String consumerName;
   @ApiModelProperty(value = "服务员名称", name = "providerName")
   private String providerName;
   @ApiModelProperty(value = "服务类型", name = "typeName")
   private String typeName;
   @ApiModelProperty(value = "订单金额", name = "orderAmount")
   private BigDecimal orderAmount;
   @ApiModelProperty(value = "结算金额", name = "usedAmount")
   private BigDecimal usedAmount;
   @ApiModelProperty(value = "平台收益", name = "restAmount")
   private BigDecimal restAmount;
   @ApiModelProperty(value = "下单时间", name = "orderDate")
   private Date orderDate;
   @ApiModelProperty(value = "开始时间", name = "startDate")
   private Date startDate;
   @ApiModelProperty(value = "下单数量", name = "orderCount")
   private int orderCount;
   private String orderState;
   private String orderStateName;

/*  49 */   public int getOrderCount() { return this.orderCount; }



/*  53 */   public void setOrderCount(int orderCount) { this.orderCount = orderCount; }



/*  57 */   public String getOrderState() { return this.orderState; }


   public void setOrderState(String orderState) {
/*  61 */     this.orderState = orderState;
/*  62 */     this.orderStateName = ResponseEnumUtils.getOrderStateEnum(this.orderState);
   }


/*  66 */   public String getOrderStateName() { return this.orderStateName; }



/*  70 */   public void setOrderStateName(String orderStateName) { this.orderStateName = orderStateName; }



/*  74 */   public String getOrderId() { return this.orderId; }



/*  78 */   public void setOrderId(String orderId) { this.orderId = orderId; }



/*  82 */   public String getConsumerName() { return this.consumerName; }



/*  86 */   public void setConsumerName(String consumerName) { this.consumerName = consumerName; }



/*  90 */   public String getProviderName() { return this.providerName; }



/*  94 */   public void setProviderName(String providerName) { this.providerName = providerName; }



/*  98 */   public String getTypeName() { return this.typeName; }



/* 102 */   public void setTypeName(String typeName) { this.typeName = typeName; }



/* 106 */   public BigDecimal getOrderAmount() { return this.orderAmount; }



/* 110 */   public void setOrderAmount(BigDecimal orderAmount) { this.orderAmount = orderAmount; }



/* 114 */   public BigDecimal getUsedAmount() { return this.usedAmount; }



/* 118 */   public void setUsedAmount(BigDecimal usedAmount) { this.usedAmount = usedAmount; }



/* 122 */   public BigDecimal getRestAmount() { return this.restAmount; }



/* 126 */   public void setRestAmount(BigDecimal restAmount) { this.restAmount = restAmount; }



/* 130 */   public Date getOrderDate() { return this.orderDate; }



/* 134 */   public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }



/* 138 */   public Date getStartDate() { return this.startDate; }



/* 142 */   public void setStartDate(Date startDate) { this.startDate = startDate; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\OrderForAdminResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
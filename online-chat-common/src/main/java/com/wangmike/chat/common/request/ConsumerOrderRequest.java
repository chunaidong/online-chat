 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.util.Date;
 import javax.validation.constraints.NotNull;
 import org.hibernate.validator.constraints.NotBlank;







 @ApiModel("消费者下单参数")
 public class ConsumerOrderRequest
 {
   @ApiModelProperty(value = "服务类型Id", name = "typeId", required = true)
   @NotBlank(message = "服务类型不允许为空")
   private String typeId;
   @ApiModelProperty(value = "预计开始时间", name = "expireStartDate", required = true)
   @NotNull(message = "开始时间不允许为空")
   private Date expireStartDate;
   @ApiModelProperty(value = "下单数量", name = "total", required = true)
   @NotNull(message = "下单数量不允许为空")
   private Integer total;
   @ApiModelProperty(value = "服务员Id", name = "providerId", required = true)
   @NotBlank(message = "服务员信息不允许为空")
   private String providerId;

/* 31 */   public String getProviderId() { return this.providerId; }



/* 35 */   public void setProviderId(String providerId) { this.providerId = providerId; }



/* 39 */   public String getTypeId() { return this.typeId; }



/* 43 */   public void setTypeId(String typeId) { this.typeId = typeId; }



/* 47 */   public Date getExpireStartDate() { return this.expireStartDate; }



/* 51 */   public void setExpireStartDate(Date expireStartDate) { this.expireStartDate = expireStartDate; }



/* 55 */   public Integer getTotal() { return this.total; }



/* 59 */   public void setTotal(Integer total) { this.total = total; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ConsumerOrderRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
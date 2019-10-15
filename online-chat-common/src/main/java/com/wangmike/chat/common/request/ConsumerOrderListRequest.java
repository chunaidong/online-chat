 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import javax.validation.constraints.NotNull;












 @ApiModel("消费者订单列表请求参数")
 public class ConsumerOrderListRequest
 {
   @ApiModelProperty(value = "页码", name = "page", required = true)
   @NotNull(message = "页码不允许为空")
   private Integer page;
   @ApiModelProperty(value = "当前页展示内容数量", name = "size", required = true)
   @NotNull(message = "当前页展示内容数量不允许为空")
   private Integer size;
   @ApiModelProperty(value = "请求类型 全部：all,待介入：0，待沟通：1，沟通中：3", name = "type", required = true)
   @NotNull(message = "请求类型不允许为空")
   private String type;
   private String openId;

/* 32 */   public String getOpenId() { return this.openId; }



/* 36 */   public void setOpenId(String openId) { this.openId = openId; }



/* 40 */   public int getPage() { return this.page.intValue(); }



/* 44 */   public void setPage(int page) { this.page = Integer.valueOf(page); }



/* 48 */   public int getSize() { return this.size.intValue(); }



/* 52 */   public void setSize(int size) { this.size = Integer.valueOf(size); }



/* 56 */   public String getType() { return this.type; }



/* 60 */   public void setType(String type) { this.type = type; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ConsumerOrderListRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
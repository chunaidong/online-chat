 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import javax.validation.constraints.NotNull;













 @ApiModel("服务员订单列表请求参数")
 public class ProviderOrderListRequest
 {
   @ApiModelProperty(value = "页码", name = "page", required = true)
   @NotNull(message = "页码不允许为空")
   private Integer page;
   @ApiModelProperty(value = "当前页展示内容数量", name = "size", required = true)
   @NotNull(message = "当前页展示内容数量不允许为空")
   private Integer size;
   @ApiModelProperty(value = "请求类型 全部：all,待介入：0，待沟通：1，沟通中：3，已完成：4", name = "type", required = true)
   @NotNull(message = "请求类型不允许为空")
   private String type;
   private String openId;

/* 33 */   public Integer getPage() { return this.page; }



/* 37 */   public void setPage(Integer page) { this.page = page; }



/* 41 */   public Integer getSize() { return this.size; }



/* 45 */   public void setSize(Integer size) { this.size = size; }



/* 49 */   public String getType() { return this.type; }



/* 53 */   public void setType(String type) { this.type = type; }



/* 57 */   public String getOpenId() { return this.openId; }



/* 61 */   public void setOpenId(String openId) { this.openId = openId; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ProviderOrderListRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
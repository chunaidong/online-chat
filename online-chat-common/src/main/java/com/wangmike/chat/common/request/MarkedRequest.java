/*    */ package com.wangmike.chat.common.request;
/*    */ 
/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ import java.math.BigDecimal;
/*    */ import javax.validation.constraints.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel("收藏列表请求对象")
/*    */ public class MarkedRequest
/*    */ {
/*    */   @ApiModelProperty(value = "页码", name = "page", required = true)
/*    */   @NotNull(message = "页码不允许为空")
/*    */   private Integer page;
/*    */   @ApiModelProperty(value = "当前页展示内容数量", name = "size", required = true)
/*    */   @NotNull(message = "当前页展示内容数量不允许为空")
/*    */   private Integer size;
/*    */   private String openId;
/*    */   @ApiModelProperty(value = "用户登录经度", name = "consumerLastLoginLat")
/*    */   private BigDecimal consumerLoginLat;
/*    */   @ApiModelProperty(value = "用户登录维度", name = "consumerLastLoginLng")
/*    */   private BigDecimal consumerLoginLng;
/*    */   
/* 37 */   public String getOpenId() { return this.openId; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setOpenId(String openId) { this.openId = openId; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public int getPage() { return this.page.intValue(); }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setPage(int page) { this.page = Integer.valueOf(page); }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public int getSize() { return this.size.intValue(); }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public void setSize(int size) { this.size = Integer.valueOf(size); }
/*    */ 
/*    */ 
/*    */   
/* 61 */   public BigDecimal getConsumerLoginLat() { return this.consumerLoginLat; }
/*    */ 
/*    */ 
/*    */   
/* 65 */   public void setConsumerLoginLat(BigDecimal consumerLoginLat) { this.consumerLoginLat = consumerLoginLat; }
/*    */ 
/*    */ 
/*    */   
/* 69 */   public BigDecimal getConsumerLoginLng() { return this.consumerLoginLng; }
/*    */ 
/*    */ 
/*    */   
/* 73 */   public void setConsumerLoginLng(BigDecimal consumerLoginLng) { this.consumerLoginLng = consumerLoginLng; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\MarkedRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
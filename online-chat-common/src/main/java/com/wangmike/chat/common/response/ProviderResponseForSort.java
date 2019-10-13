/*    */ package com.wangmike.chat.common.response;
/*    */ 
/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel("排行榜对象")
/*    */ public class ProviderResponseForSort
/*    */   implements Serializable
/*    */ {
/*    */   private boolean isMy;
/*    */   @ApiModelProperty(value = "名称", name = "providerNickName")
/*    */   private String providerNickName;
/*    */   private String providerId;
/*    */   @ApiModelProperty(value = "年龄", name = "providerAge")
/*    */   private Integer providerAge;
/*    */   @ApiModelProperty(value = "成长值", name = "totalAmount")
/*    */   private BigDecimal totalAmount;
/*    */   @ApiModelProperty(value = "排名", name = "index")
/*    */   private Integer index;
/*    */   private List<String> headsLists;
/*    */   
/* 42 */   public boolean isMy() { return this.isMy; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setMy(boolean my) { this.isMy = my; }
/*    */ 
/*    */ 
/*    */   
/* 50 */   public String getProviderNickName() { return this.providerNickName; }
/*    */ 
/*    */ 
/*    */   
/* 54 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public String getProviderId() { return this.providerId; }
/*    */ 
/*    */ 
/*    */   
/* 62 */   public void setProviderId(String providerId) { this.providerId = providerId; }
/*    */ 
/*    */ 
/*    */   
/* 66 */   public Integer getProviderAge() { return this.providerAge; }
/*    */ 
/*    */ 
/*    */   
/* 70 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }
/*    */ 
/*    */ 
/*    */   
/* 74 */   public BigDecimal getTotalAmount() { return this.totalAmount; }
/*    */ 
/*    */ 
/*    */   
/* 78 */   public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
/*    */ 
/*    */ 
/*    */   
/* 82 */   public Integer getIndex() { return this.index; }
/*    */ 
/*    */ 
/*    */   
/* 86 */   public void setIndex(Integer index) { this.index = index; }
/*    */ 
/*    */ 
/*    */   
/* 90 */   public List<String> getHeadsLists() { return this.headsLists; }
/*    */ 
/*    */ 
/*    */   
/* 94 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseForSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
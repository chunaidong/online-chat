/*     */ package com.wangmike.chat.common.response;
/*     */ 
/*     */ import com.wangmike.chat.common.entity.ProviderType;
/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel("服务员列表对象")
/*     */ public class ProviderResponseForList
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -1L;
/*     */   @ApiModelProperty(value = "主键", name = "providerId")
/*     */   private String providerId;
/*     */   @ApiModelProperty(value = "名称", name = "providerNickName")
/*     */   private String providerNickName;
/*     */   @ApiModelProperty(value = "年龄", name = "providerAge")
/*     */   private Integer providerAge;
/*     */   @ApiModelProperty(value = "性别", name = "providerSex")
/*     */   private String providerSex;
/*     */   @ApiModelProperty(value = "等级", name = "providerLevel")
/*     */   private int providerLevel;
/*     */   @ApiModelProperty(value = "简介", name = "providerContent")
/*     */   private String providerContent;
/*     */   @ApiModelProperty(value = "默认距离", name = "distance")
/*     */   private BigDecimal distance;
/*     */   private List<String> headsLists;
/*     */   private List<ProviderType> typeList;
/*     */   
/*  70 */   public List<ProviderType> getTypeList() { return this.typeList; }
/*     */ 
/*     */ 
/*     */   
/*  74 */   public void setTypeList(List<ProviderType> typeList) { this.typeList = typeList; }
/*     */ 
/*     */ 
/*     */   
/*  78 */   public List<String> getHeadsLists() { return this.headsLists; }
/*     */ 
/*     */ 
/*     */   
/*  82 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }
/*     */ 
/*     */ 
/*     */   
/*  86 */   public String getProviderId() { return this.providerId; }
/*     */ 
/*     */ 
/*     */   
/*  90 */   public void setProviderId(String providerId) { this.providerId = providerId; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public String getProviderNickName() { return this.providerNickName; }
/*     */ 
/*     */ 
/*     */   
/*  98 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }
/*     */ 
/*     */ 
/*     */   
/* 102 */   public Integer getProviderAge() { return this.providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 110 */   public String getProviderSex() { return this.providerSex; }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public int getProviderLevel() { return this.providerLevel; }
/*     */ 
/*     */ 
/*     */   
/* 122 */   public void setProviderLevel(int providerLevel) { this.providerLevel = providerLevel; }
/*     */ 
/*     */ 
/*     */   
/* 126 */   public String getProviderContent() { return this.providerContent; }
/*     */ 
/*     */ 
/*     */   
/* 130 */   public void setProviderContent(String providerContent) { this.providerContent = providerContent; }
/*     */ 
/*     */ 
/*     */   
/* 134 */   public BigDecimal getDistance() { return this.distance; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public void setDistance(BigDecimal distance) { this.distance = distance; }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseForList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
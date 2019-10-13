/*     */ package com.wangmike.chat.common.response;
/*     */ 
/*     */ import com.wangmike.chat.common.entity.ProviderType;
/*     */ import com.wangmike.chat.common.utils.ResponseEnumUtils;
/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
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
/*     */ @ApiModel("服务员修改资料实体类")
/*     */ public class ProviderResponseForMy
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -11L;
/*     */   @ApiModelProperty(value = "主键", name = "providerId")
/*     */   private String providerId;
/*     */   @ApiModelProperty(value = "名称", name = "providerNickName")
/*     */   private String providerNickName;
/*     */   @ApiModelProperty(value = "年龄", name = "providerAge")
/*     */   private Integer providerAge;
/*     */   @ApiModelProperty(value = "性别", name = "providerSex")
/*     */   private String providerSex;
/*     */   @ApiModelProperty(value = "简介", name = "providerContent")
/*     */   private String providerContent;
/*     */   @ApiModelProperty(value = "原简介", name = "providerRawContent")
/*     */   private String providerRawContent;
/*     */   @ApiModelProperty(value = "个人说明", name = "providerSignature")
/*     */   private String providerSignature;
/*     */   @ApiModelProperty(value = "出生日期", name = "providerBirthDay")
/*     */   private Date providerBirthDay;
/*     */   @ApiModelProperty(value = "情感状况", name = "providerEmotion")
/*     */   private String providerEmotion;
/*     */   @ApiModelProperty(value = "原微信号", name = "providerRawWechatNo")
/*     */   private String providerRawWechatNo;
/*     */   @ApiModelProperty(value = "微信号", name = "providerWechatNo")
/*     */   private String providerWechatNo;
/*     */   private String providerEmotionName;
/*     */   private List<String> headsLists;
/*     */   private List<ProviderType> typeList;
/*     */   
/*  78 */   public String getProviderWechatNo() { return this.providerWechatNo; }
/*     */ 
/*     */ 
/*     */   
/*  82 */   public void setProviderWechatNo(String providerWechatNo) { this.providerWechatNo = providerWechatNo; }
/*     */ 
/*     */ 
/*     */   
/*  86 */   public List<ProviderType> getTypeList() { return this.typeList; }
/*     */ 
/*     */ 
/*     */   
/*  90 */   public void setTypeList(List<ProviderType> typeList) { this.typeList = typeList; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public String getProviderId() { return this.providerId; }
/*     */ 
/*     */ 
/*     */   
/*  98 */   public void setProviderId(String providerId) { this.providerId = providerId; }
/*     */ 
/*     */ 
/*     */   
/* 102 */   public String getProviderNickName() { return this.providerNickName; }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }
/*     */ 
/*     */ 
/*     */   
/* 110 */   public Integer getProviderAge() { return this.providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public String getProviderSex() { return this.providerSex; }
/*     */ 
/*     */ 
/*     */   
/* 122 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }
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
/* 134 */   public String getProviderSignature() { return this.providerSignature; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public void setProviderSignature(String providerSignature) { this.providerSignature = providerSignature; }
/*     */ 
/*     */ 
/*     */   
/* 142 */   public Date getProviderBirthDay() { return this.providerBirthDay; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public void setProviderBirthDay(Date providerBirthDay) { this.providerBirthDay = providerBirthDay; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public String getProviderEmotion() { return this.providerEmotion; }
/*     */ 
/*     */   
/*     */   public void setProviderEmotion(String providerEmotion) {
/* 154 */     this.providerEmotion = providerEmotion;
/* 155 */     this.providerEmotionName = ResponseEnumUtils.getEmotionStateEnum(this.providerEmotion);
/*     */   }
/*     */ 
/*     */   
/* 159 */   public String getProviderEmotionName() { return this.providerEmotionName; }
/*     */ 
/*     */ 
/*     */   
/* 163 */   public void setProviderEmotionName(String providerEmotionName) { this.providerEmotionName = providerEmotionName; }
/*     */ 
/*     */ 
/*     */   
/* 167 */   public List<String> getHeadsLists() { return this.headsLists; }
/*     */ 
/*     */ 
/*     */   
/* 171 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }
/*     */ 
/*     */ 
/*     */   
/* 175 */   public String getProviderRawWechatNo() { return this.providerRawWechatNo; }
/*     */ 
/*     */ 
/*     */   
/* 179 */   public String getProviderRawContent() { return this.providerRawContent; }
/*     */ 
/*     */ 
/*     */   
/* 183 */   public void setProviderRawContent(String providerRawContent) { this.providerRawContent = providerRawContent; }
/*     */ 
/*     */ 
/*     */   
/* 187 */   public void setProviderRawWechatNo(String providerRawWechatNo) { this.providerRawWechatNo = providerRawWechatNo; }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseForMy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
 package com.wangmike.chat.common.response;

 import com.wangmike.chat.common.entity.ProviderType;
 import com.wangmike.chat.common.utils.ResponseEnumUtils;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.io.Serializable;
 import java.util.List;








































 @ApiModel("服务员详情对象")
 public class ProviderResponseDetail
   implements Serializable
 {
   private static final long serialVersionUID = -11L;
   @ApiModelProperty(value = "主键", name = "providerId")
   private String providerId;
   @ApiModelProperty(value = "名称", name = "providerNickName")
   private String providerNickName;
   @ApiModelProperty(value = "年龄", name = "providerAge")
   private Integer providerAge;
   @ApiModelProperty(value = "性别", name = "providerSex")
   private String providerSex;
   @ApiModelProperty(value = "等级", name = "providerLevel")
   private int providerLevel;
   @ApiModelProperty(value = "简介", name = "providerContent")
   private String providerContent;
   @ApiModelProperty(value = "三围", name = "providerStature")
   private String providerStature;
   @ApiModelProperty(value = "职业", name = "providerProfession")
   private String providerProfession;
   @ApiModelProperty(value = "个人说明", name = "providerSignature")
   private String providerSignature;
   @ApiModelProperty(value = "是否被当前用户收藏", name = "isMarked")
   private boolean isMarked;
     @ApiModelProperty(value = "情感状况", name = "providerEmotion")
     private String providerEmotion;
     private String providerEmotionName;
   private List<String> headsLists;
   private List<ProviderType> typeList;

     public String getProviderEmotion() {
         return providerEmotion;
     }

     public void setProviderEmotion(String providerEmotion) {
         this.providerEmotion = providerEmotion;
         this.providerEmotionName = ResponseEnumUtils.getEmotionStateEnum(this.providerEmotion);
     }

     public String getProviderEmotionName() {
         return providerEmotionName;
     }

     public void setProviderEmotionName(String providerEmotionName) {
         this.providerEmotionName = providerEmotionName;
     }

     /*  76 */   public boolean isMarked() { return this.isMarked; }



/*  80 */   public void setMarked(boolean marked) { this.isMarked = marked; }



/*  84 */   public String getProviderId() { return this.providerId; }



/*  88 */   public void setProviderId(String providerId) { this.providerId = providerId; }



/*  92 */   public String getProviderNickName() { return this.providerNickName; }



/*  96 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }



/* 100 */   public Integer getProviderAge() { return this.providerAge; }



/* 104 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }



/* 108 */   public String getProviderSex() { return this.providerSex; }



/* 112 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }



/* 116 */   public int getProviderLevel() { return this.providerLevel; }



/* 120 */   public void setProviderLevel(int providerLevel) { this.providerLevel = providerLevel; }



/* 124 */   public String getProviderContent() { return this.providerContent; }



/* 128 */   public void setProviderContent(String providerContent) { this.providerContent = providerContent; }



/* 132 */   public String getProviderStature() { return this.providerStature; }



/* 136 */   public void setProviderStature(String providerStature) { this.providerStature = providerStature; }



/* 140 */   public String getProviderProfession() { return this.providerProfession; }



/* 144 */   public void setProviderProfession(String providerProfession) { this.providerProfession = providerProfession; }



/* 148 */   public String getProviderSignature() { return this.providerSignature; }



/* 152 */   public void setProviderSignature(String providerSignature) { this.providerSignature = providerSignature; }



/* 156 */   public List<String> getHeadsLists() { return this.headsLists; }



/* 160 */   public void setHeadsLists(List<String> headsLists) { this.headsLists = headsLists; }



/* 164 */   public List<ProviderType> getTypeList() { return this.typeList; }



/* 168 */   public void setTypeList(List<ProviderType> typeList) { this.typeList = typeList; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderResponseDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.math.BigDecimal;
 import java.util.Date;
 import java.util.List;
 import javax.validation.constraints.NotNull;
 import org.hibernate.validator.constraints.NotBlank;

















 @ApiModel("服务员对象")
 public class ProviderRequest
 {
   @ApiModelProperty(value = "昵称", name = "providerNickName", required = true)
   @NotBlank(message = "昵称不允许为空")
   private String providerNickName;
   @ApiModelProperty(value = "微信号", name = "providerWechatNo", required = true)
   @NotBlank(message = "微信号不允许为空")
   private String providerWechatNo;
   @ApiModelProperty(value = "生日", name = "providerBirthDay", required = true)
   @NotNull(message = "生日不允许为空")
   private Date providerBirthDay;
   @ApiModelProperty(value = "年龄", name = "providerAge", required = true)
   @NotNull(message = "年龄不允许为空")
   private Integer providerAge;
   @ApiModelProperty(value = "性别", name = "providerSex", required = true)
   @NotBlank(message = "性别不允许为空")
   private String providerSex;
   @ApiModelProperty(value = "三围", name = "providerStature", required = true)
   @NotBlank(message = "三围不允许为空")
   private String providerStature;
   @ApiModelProperty(value = "职业", name = "providerProfession", required = true)
   @NotBlank(message = "职业不允许为空")
   private String providerProfession;
   @ApiModelProperty(value = "情感状况", name = "providerEmotion", required = true)
   @NotBlank(message = "情感状况不允许为空")
   private String providerEmotion;
   @ApiModelProperty(value = "简介", name = "providerContent", required = true)
   @NotBlank(message = "简介不允许为空")
   private String providerContent;
   @ApiModelProperty(value = "个人说明", name = "providerSignature", required = true)
   @NotBlank(message = "个人说明不允许为空")
   private String providerSignature;
   @ApiModelProperty(value = "用户所选服务类型", name = "types", required = true)
   private List<String> types;
   @ApiModelProperty(value = "经度", name = "providerLastLoginLat")
   private BigDecimal providerLastLoginLat;
   @ApiModelProperty(value = "纬度", name = "providerLastLoginLng")
   private BigDecimal providerLastLoginLng;

/*  68 */   public String getProviderNickName() { return this.providerNickName; }



/*  72 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }



/*  76 */   public String getProviderWechatNo() { return this.providerWechatNo; }



/*  80 */   public void setProviderWechatNo(String providerWechatNo) { this.providerWechatNo = providerWechatNo; }



/*  84 */   public Date getProviderBirthDay() { return this.providerBirthDay; }



/*  88 */   public void setProviderBirthDay(Date providerBirthDay) { this.providerBirthDay = providerBirthDay; }



/*  92 */   public Integer getProviderAge() { return this.providerAge; }



/*  96 */   public void setProviderAge(Integer providerAge) { this.providerAge = providerAge; }



/* 100 */   public String getProviderSex() { return this.providerSex; }



/* 104 */   public void setProviderSex(String providerSex) { this.providerSex = providerSex; }



/* 108 */   public String getProviderStature() { return this.providerStature; }



/* 112 */   public void setProviderStature(String providerStature) { this.providerStature = providerStature; }



/* 116 */   public String getProviderProfession() { return this.providerProfession; }



/* 120 */   public void setProviderProfession(String providerProfession) { this.providerProfession = providerProfession; }



/* 124 */   public String getProviderEmotion() { return this.providerEmotion; }



/* 128 */   public void setProviderEmotion(String providerEmotion) { this.providerEmotion = providerEmotion; }



/* 132 */   public String getProviderContent() { return this.providerContent; }



/* 136 */   public void setProviderContent(String providerContent) { this.providerContent = providerContent; }



/* 140 */   public String getProviderSignature() { return this.providerSignature; }



/* 144 */   public void setProviderSignature(String providerSignature) { this.providerSignature = providerSignature; }



/* 148 */   public List<String> getTypes() { return this.types; }



/* 152 */   public void setTypes(List<String> types) { this.types = types; }



/* 156 */   public BigDecimal getProviderLastLoginLat() { return this.providerLastLoginLat; }



/* 160 */   public void setProviderLastLoginLat(BigDecimal providerLastLoginLat) { this.providerLastLoginLat = providerLastLoginLat; }



/* 164 */   public BigDecimal getProviderLastLoginLng() { return this.providerLastLoginLng; }



/* 168 */   public void setProviderLastLoginLng(BigDecimal providerLastLoginLng) { this.providerLastLoginLng = providerLastLoginLng; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ProviderRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
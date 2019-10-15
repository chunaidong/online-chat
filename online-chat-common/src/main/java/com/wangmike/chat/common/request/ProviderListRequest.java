 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.math.BigDecimal;
 import javax.validation.constraints.NotNull;
 import org.hibernate.validator.constraints.NotBlank;




























 @ApiModel("服务员列表请求参数")
 public class ProviderListRequest
 {
   @ApiModelProperty(value = "页码", name = "page", required = true)
   @NotNull(message = "页码不允许为空")
   private Integer page;
   @ApiModelProperty(value = "当前页展示内容数量", name = "size", required = true)
   @NotNull(message = "当前页展示内容数量不允许为空")
   private Integer size;
   @ApiModelProperty(value = "性别", name = "sex", required = true)
   @NotBlank(message = "性别不允许为空")
   private String sex;
   @ApiModelProperty(value = "年龄开始", name = "startAge")
   private Integer startAge;
   @ApiModelProperty(value = "年龄结束", name = "endAge")
   private Integer endAge;
   @ApiModelProperty(value = "情感", name = "emotion")
   private String emotion;
   @ApiModelProperty(value = "经度", name = "consumerLoginLat")
   private BigDecimal consumerLoginLat;
   @ApiModelProperty(value = "纬度", name = "consumerLoginLng")
   private BigDecimal consumerLoginLng;

/*  59 */   public BigDecimal getConsumerLoginLat() { return this.consumerLoginLat; }



/*  63 */   public void setConsumerLoginLat(BigDecimal consumerLoginLat) { this.consumerLoginLat = consumerLoginLat; }



/*  67 */   public BigDecimal getConsumerLoginLng() { return this.consumerLoginLng; }



/*  71 */   public void setConsumerLoginLng(BigDecimal consumerLoginLng) { this.consumerLoginLng = consumerLoginLng; }



/*  75 */   public int getPage() { return this.page.intValue(); }



/*  79 */   public void setPage(int page) { this.page = Integer.valueOf(page); }



/*  83 */   public int getSize() { return this.size.intValue(); }



/*  87 */   public void setSize(int size) { this.size = Integer.valueOf(size); }



/*  91 */   public String getSex() { return this.sex; }



/*  95 */   public void setSex(String sex) { this.sex = sex; }



/*  99 */   public Integer getStartAge() { return this.startAge; }



/* 103 */   public void setStartAge(Integer startAge) { this.startAge = startAge; }



/* 107 */   public Integer getEndAge() { return this.endAge; }



/* 111 */   public void setEndAge(Integer endAge) { this.endAge = endAge; }



/* 115 */   public String getEmotion() { return this.emotion; }



/* 119 */   public void setEmotion(String emotion) { this.emotion = emotion; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ProviderListRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
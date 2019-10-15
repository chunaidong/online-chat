 package com.wangmike.chat.common.request;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import org.hibernate.validator.constraints.NotBlank;


 @ApiModel("openId对象")
 public class OpenIdRequest
 {
   @ApiModelProperty(value = "code", name = "code", required = true)
   @NotBlank(message = "code不允许为空")
   private String code;

/* 15 */   public String getCode() { return this.code; }



/* 19 */   public void setCode(String code) { this.code = code; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\OpenIdRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
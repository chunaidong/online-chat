 package com.wangmike.chat.common.constant;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;




 @ApiModel("用户对象")
 public class User
 {
   @ApiModelProperty(value = "用户名", name = "username")
   private String username;
   @ApiModelProperty(value = "密码", name = "password")
   private String password;

/* 17 */   public String getUsername() { return this.username; }



/* 21 */   public void setUsername(String username) { this.username = username; }



/* 25 */   public String getPassword() { return this.password; }



/* 29 */   public void setPassword(String password) { this.password = password; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
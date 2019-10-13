/*    */ package com.wangmike.chat.common.response;
/*    */ 
/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel("用户信息")
/*    */ public class ConsumerForAdmin
/*    */ {
/*    */   @ApiModelProperty(value = "用户名称", name = "consumerNickName")
/*    */   private String consumerNickName;
/*    */   @ApiModelProperty(value = "性别", name = "sex")
/*    */   private String sex;
/*    */   @ApiModelProperty(value = "生日", name = "birthDay")
/*    */   private Date birthDay;
/*    */   @ApiModelProperty(value = "注册日期", name = "registryDay")
/*    */   private Date registryDay;
/*    */   @ApiModelProperty(value = "用户等级", name = "level")
/*    */   private int level;
/*    */   
/* 24 */   public String getConsumerNickName() { return this.consumerNickName; }
/*    */ 
/*    */ 
/*    */   
/* 28 */   public void setConsumerNickName(String consumerNickName) { this.consumerNickName = consumerNickName; }
/*    */ 
/*    */ 
/*    */   
/* 32 */   public String getSex() { return this.sex; }
/*    */ 
/*    */ 
/*    */   
/* 36 */   public void setSex(String sex) { this.sex = sex; }
/*    */ 
/*    */ 
/*    */   
/* 40 */   public Date getBirthDay() { return this.birthDay; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setBirthDay(Date birthDay) { this.birthDay = birthDay; }
/*    */ 
/*    */ 
/*    */   
/* 48 */   public Date getRegistryDay() { return this.registryDay; }
/*    */ 
/*    */ 
/*    */   
/* 52 */   public void setRegistryDay(Date registryDay) { this.registryDay = registryDay; }
/*    */ 
/*    */ 
/*    */   
/* 56 */   public int getLevel() { return this.level; }
/*    */ 
/*    */ 
/*    */   
/* 60 */   public void setLevel(int level) { this.level = level; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ConsumerForAdmin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
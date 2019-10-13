/*    */ package com.wangmike.chat.common.constant;
/*    */ 
/*    */ public  enum AuditStateEnum
/*    */ {
/*  5 */   REGISTRY_WAIT_AUDIT("0", "服务员注册待审核"),
/*  6 */   REGISTRY_DENY("1", "服务员注册审核不通过"),
/*  7 */   REGISTRY_PASS("2", "服务员注册审核通过"),
/*  8 */   WECHAT_NO_WAIT_AUDIT("3", "微信号待审核"),
/*  9 */   WECHAT_NO_DENY("4", "微信号审核不通过"),
/* 10 */   WECHAT_NO_PASS("5", "微信号审核通过"),
/* 11 */   PROVIDER_HEAD_WAIT_AUDIT("2", "服务员头像待审核"),
/* 12 */   PROVIDER_HEAD_DENY("0", "服务员头像审核不过"),
/* 13 */   PROVIDER_HEAD_PASS("1", "服务员头像审核通过");
/*    */   private String code;
/*    */   private String name;
/*    */   
/*    */   AuditStateEnum(String code, String name) {
/* 18 */     this.code = code;
/* 19 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 31 */   public void setCode(String code) { this.code = code; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setName(String name) { this.name = name; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\AuditStateEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
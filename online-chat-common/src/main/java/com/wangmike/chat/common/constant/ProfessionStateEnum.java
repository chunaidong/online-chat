/*    */ package com.wangmike.chat.common.constant;
/*    */ 
/*    */ public  enum ProfessionStateEnum
/*    */ {
/*  5 */   STUDENT("0", "学生"),
/*  6 */   TEACHAR("1", "老师"),
/*  7 */   YISHEN("2", "医生"),
/*  8 */   HUSHI("3", "护士"),
/*  9 */   QITA("4", "其他");
/*    */   private String code;
/*    */   
/*    */   ProfessionStateEnum(String code, String name) {
/* 13 */     this.code = code;
/* 14 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private String name;
/*    */ 
/*    */   
/* 22 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 26 */   public void setCode(String code) { this.code = code; }
/*    */ 
/*    */ 
/*    */   
/* 30 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 34 */   public void setName(String name) { this.name = name; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\ProfessionStateEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
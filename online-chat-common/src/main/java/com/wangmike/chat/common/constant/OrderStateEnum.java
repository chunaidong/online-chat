/*    */ package com.wangmike.chat.common.constant;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public  enum OrderStateEnum
/*    */ {
/*  8 */   WAIT_ACCESS("0", "待接入"),
/*  9 */   WAIT_CHAT("1", "待沟通"),
/* 10 */   WAIT_CONFIRM("2", "待确认"),
/* 11 */   IN_CHATTING("3", "沟通中"),
/* 12 */   CHAT_FINISH("4", "沟通完成"),
/* 13 */   ORDER_CLOSED("5", "已关闭");
/*    */   
/*    */   OrderStateEnum(String code, String name) {
/* 16 */     this.code = code;
/* 17 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   private String code;
/*    */   
/*    */   private String name;
/*    */   
/* 25 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public void setCode(String code) { this.code = code; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setName(String name) { this.name = name; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\OrderStateEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
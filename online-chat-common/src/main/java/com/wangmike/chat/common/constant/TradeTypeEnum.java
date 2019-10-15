 package com.wangmike.chat.common.constant;

 public  enum TradeTypeEnum
 {
/*  5 */   RECHARGE("0", "充值"),
/*  6 */   CONSUMER("1", "消费"),
/*  7 */   REFUND("2", "退款"),
/*  8 */   WITHDRAW("3", "提现"),
/*  9 */   RECEVIE("4", "收入");
   private String code;
   private String name;

   TradeTypeEnum(String code, String name) {
/* 14 */     this.code = code;
/* 15 */     this.name = name;
   }






/* 23 */   public String getCode() { return this.code; }



/* 27 */   public void setCode(String code) { this.code = code; }



/* 31 */   public String getName() { return this.name; }



/* 35 */   public void setName(String name) { this.name = name; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\TradeTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
 package com.wangmike.chat.common.constant;





 public  enum EmotionStateEnum
 {
/*  9 */   SINGEL("0", "单身"),
/* 10 */   MARRIED("1", "已婚"),
/* 11 */   HOMOSEXUAL("2", "同性"),
/* 12 */   DEVOICED("3", "离婚"),
/* 13 */   YOUNG_WOMAN("4", "少妇"),
/* 14 */   SECREATE("5", "保密");
   private String code;
   private String name;

   EmotionStateEnum(String code, String name) {
/* 19 */     this.code = code;
/* 20 */     this.name = name;
   }






/* 28 */   public String getCode() { return this.code; }



/* 32 */   public void setCode(String code) { this.code = code; }



/* 36 */   public String getName() { return this.name; }



/* 40 */   public void setName(String name) { this.name = name; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\EmotionStateEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
 package com.wangmike.chat.common.constant;


 public  enum ErrorCodeEnum
 {
/*  6 */   TEST_CODE("TEST_CODE", "这是测试"),
/*  7 */   NOT_LOGIN("NOT_LOGIN", "请登录"),
/*  8 */   PARAM_IS_BLANK("PARAN_IS_BLANK", "参数不允许为空"),
/*  9 */   DATA_IS_BLANK("DATA_IS_BLANK", "请传入正确的参数"),
/* 10 */   REST_MOENY_NOT_ENOUGH("REST_MOENY_NOT_ENOUGH", "余额不足，请及时充值");
   private String code;
   private String name;

   ErrorCodeEnum(String code, String name) {
/* 15 */     this.code = code;
/* 16 */     this.name = name;
   }






/* 24 */   public String getCode() { return this.code; }



/* 28 */   public void setCode(String code) { this.code = code; }



/* 32 */   public String getName() { return this.name; }



/* 36 */   public void setName(String name) { this.name = name; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\ErrorCodeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
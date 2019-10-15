 package com.wangmike.chat.common.utils;

 import com.wangmike.chat.common.constant.EmotionStateEnum;
 import com.wangmike.chat.common.constant.OrderStateEnum;









 public class ResponseEnumUtils
 {
   public static String getOrderStateEnum(String key) {
/* 17 */     for (OrderStateEnum e : OrderStateEnum.values()) {
/* 18 */       if (e.getCode().equals(key)) {
/* 19 */         return e.getName();
       }
     }
/* 22 */     return "";
   }







   public static String getEmotionStateEnum(String key) {
/* 32 */     for (EmotionStateEnum e : EmotionStateEnum.values()) {
/* 33 */       if (e.getCode().equals(key)) {
/* 34 */         return e.getName();
       }
     }
/* 37 */     return "";
   }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\commo\\utils\ResponseEnumUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
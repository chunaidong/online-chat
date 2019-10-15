 package com.wangmike.chat.server.utils;

 import com.wangmike.chat.common.constant.CommonResponse;





 public class ResponseUtils
 {
/* 11 */   public static CommonResponse buildSuccessResoonse(Object obj) { return new CommonResponse(obj); }



/* 15 */   public static CommonResponse buildErrorResponse(String code, String msg) { return new CommonResponse(code, msg); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\ResponseUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
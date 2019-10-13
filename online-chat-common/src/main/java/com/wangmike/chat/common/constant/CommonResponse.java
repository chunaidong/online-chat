/*    */ package com.wangmike.chat.common.constant;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonInclude;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JsonInclude(JsonInclude.Include.NON_NULL)
/*    */ public class CommonResponse<T>
/*    */   extends Object
/*    */ {
/*    */   private String code;
/*    */   private String msg;
/*    */   private T data;
/*    */   
/* 18 */   public CommonResponse() { this.code = "10000"; }
/*    */ 
/*    */   
/*    */   public CommonResponse(String code, String msg) {
/* 22 */     this.code = code;
/* 23 */     this.msg = msg;
/*    */   }
/*    */ 
/*    */   
/*    */   public CommonResponse(T data) {
/* 28 */     this();
/* 29 */     this.data = data;
/*    */   }
/*    */ 
/*    */   
/* 33 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setCode(String code) { this.code = code; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public String getMsg() { return this.msg; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setMsg(String msg) { this.msg = msg; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public T getData() { return (T)this.data; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setData(T data) { this.data = data; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\constant\CommonResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
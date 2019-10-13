/*    */ package com.wangmike.chat.server.utils;
/*    */ 
/*    */ import com.wangmike.chat.server.config.SpringContextHolder;
/*    */ import com.wangmike.chat.server.utils.FinishedOrderTask;
/*    */ import com.wangmike.chat.service.ConsumerService;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FinishedOrderTask
/*    */   implements Runnable
/*    */ {
/*    */   private String orderId;
/*    */   private Logger logger;
/*    */   private ConsumerService consumerService;
/*    */   
/*    */   public FinishedOrderTask(String orderId) {
/* 19 */     this.logger = LoggerFactory.getLogger(FinishedOrderTask.class);
/*    */     
/* 21 */     this.consumerService = (ConsumerService)SpringContextHolder.getBean(ConsumerService.class);
/*    */     this.orderId = orderId;
/*    */   }
/* 24 */   public void run() { this.consumerService.finishOrder(this.orderId); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\FinishedOrderTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
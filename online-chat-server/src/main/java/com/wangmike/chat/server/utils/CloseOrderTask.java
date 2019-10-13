/*    */ package com.wangmike.chat.server.utils;
/*    */ 
/*    */ import com.wangmike.chat.server.config.SpringContextHolder;
/*    */ import com.wangmike.chat.server.utils.CloseOrderTask;
/*    */ import com.wangmike.chat.service.ConsumerService;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CloseOrderTask
/*    */   implements Runnable
/*    */ {
/*    */   private String orderId;
/*    */   private Logger logger;
/*    */   private ConsumerService consumerService;
/*    */   
/*    */   public CloseOrderTask(String orderId) {
/* 21 */     this.logger = LoggerFactory.getLogger(CloseOrderTask.class);
/*    */     
/* 23 */     this.consumerService = (ConsumerService)SpringContextHolder.getBean(ConsumerService.class);
/*    */     this.orderId = orderId;
/*    */   }
/*    */   public void run() {
/* 27 */     this.logger.info("取消订单开始：{}", this.orderId);
/* 28 */     this.consumerService.cancelOrder(this.orderId);
/*    */   }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\CloseOrderTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
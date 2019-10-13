/*    */ package com.wangmike.chat.server.utils;
/*    */ 
/*    */ import com.wangmike.chat.server.utils.OrderSchedule;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.ScheduledExecutorService;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OrderSchedule
/*    */ {
/* 16 */   private static ScheduledExecutorService Manager = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
/*    */ 
/*    */   
/*    */   private static OrderSchedule orderSchedule;
/*    */ 
/*    */   
/*    */   public static OrderSchedule getInstance() {
/* 23 */     if (orderSchedule == null) {
/* 24 */       orderSchedule = new OrderSchedule();
/*    */     }
/* 26 */     return orderSchedule;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void startTask(Runnable task, long delay, TimeUnit time) { Manager.schedule(task, delay, time); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\OrderSchedule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
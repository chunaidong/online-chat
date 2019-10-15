 package com.wangmike.chat.server.utils;

 import com.wangmike.chat.server.config.SpringContextHolder;
 import com.wangmike.chat.server.utils.CloseOrderTask2;
 import com.wangmike.chat.service.ConsumerService;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;


 public class CloseOrderTask2
   implements Runnable
 {
   private String orderId;
   private Logger logger;
   private ConsumerService consumerService;

   public CloseOrderTask2(String orderId) {
/* 18 */     this.logger = LoggerFactory.getLogger(CloseOrderTask2.class);

/* 20 */     this.consumerService = (ConsumerService)SpringContextHolder.getBean(ConsumerService.class);
     this.orderId = orderId;
   } public void run() {
/* 23 */     this.logger.info("取消订单2开始：{}", this.orderId);
/* 24 */     this.consumerService.cancelOrder2(this.orderId);
   }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\CloseOrderTask2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
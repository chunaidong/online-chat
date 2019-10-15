 package com.wangmike.chat.server.utils;

 import com.wangmike.chat.server.utils.ScheduledTasks;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.scheduling.annotation.Scheduled;
 import org.springframework.stereotype.Component;








 @Component
 public class ScheduledTasks
 {
/* 19 */   private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);




   @Scheduled(cron = "0 0 3 * * ?")
/* 25 */   public void reportCurrent() { logger.info("现在时间：{}", ""); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\ScheduledTasks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
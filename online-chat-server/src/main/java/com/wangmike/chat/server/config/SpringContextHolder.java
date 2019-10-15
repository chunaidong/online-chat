 package com.wangmike.chat.server.config;

 import com.wangmike.chat.server.config.SpringContextHolder;
 import org.springframework.beans.BeansException;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.ApplicationContextAware;
 import org.springframework.context.ApplicationEvent;
 import org.springframework.stereotype.Component;

 @Component
 public class SpringContextHolder
   implements ApplicationContextAware {
   private static ApplicationContext springContext;

/* 15 */   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException { springContext = applicationContext; }








/* 24 */   public static ApplicationContext getSpringContext() { return springContext; }










/* 35 */   public static Object getBean(String name) { return springContext.getBean(name); }









/* 45 */   public static <T> T getBean(Class<T> requiredType) { return (T)springContext.getBean(requiredType); }









/* 55 */   public static void pushEvent(ApplicationEvent event) { springContext.publishEvent(event); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\config\SpringContextHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
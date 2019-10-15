 package com.wangmike.chat.server.config;

 import com.google.common.collect.Lists;
 import com.wangmike.chat.server.filter.OnlineChatFilter;
 import java.util.List;
 import org.springframework.boot.web.servlet.FilterRegistrationBean;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;







 @Configuration
 public class OnlieChatConfig
 {
   @Bean
   public FilterRegistrationBean filterRegistrationBean() {
/* 21 */     FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

/* 23 */     OnlineChatFilter onlineChatFilter = new OnlineChatFilter();
/* 24 */     filterRegistrationBean.setFilter(onlineChatFilter);

/* 26 */     List<String> urls = Lists.newArrayList();
/* 27 */     urls.add("/*");
/* 28 */     filterRegistrationBean.setUrlPatterns(urls);
/* 29 */     return filterRegistrationBean;
   }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\config\OnlieChatConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
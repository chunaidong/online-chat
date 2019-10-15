 package com.wangmike.chat.server;

 import com.cgclecc.bootbase.mvc.config.SpringMVCConfigureAdapter;
 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.scheduling.annotation.EnableScheduling;
 import org.springframework.web.servlet.config.annotation.CorsRegistry;
 import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
 import springfox.documentation.swagger2.annotations.EnableSwagger2;













 @SpringBootApplication
 @EnableSwagger2
 @EnableScheduling
 public class ChatApplication
   extends SpringMVCConfigureAdapter
 {
/* 29 */   public static void main(String[] args) { SpringApplication.run(com.wangmike.chat.server.ChatApplication.class, args); }



   public void addCorsMappings(CorsRegistry registry) {
/* 34 */     String corsDomain = "*";
/* 35 */     if (corsDomain == null || corsDomain.trim().equals("")) {
/* 36 */       corsDomain = "*";
     }
/* 38 */     String[] origins = corsDomain.split(",");
/* 39 */     registry.addMapping("/**").allowedOrigins(origins).allowCredentials(true).allowedMethods(new String[] { "*"
/* 40 */         }).allowedHeaders(new String[] { "*" });
   }


   public void addResourceHandlers(ResourceHandlerRegistry registry) {
/* 45 */     registry.addResourceHandler(new String[] { "/**"
/* 46 */         }).addResourceLocations(new String[] { "classpath:/META-INF/resources/"
/* 47 */         }).addResourceLocations(new String[] { "file:/home/work/file/" });
   }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\ChatApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
package com.wangmike.chat.server;


import com.cgclecc.bootbase.mvc.config.SpringMVCConfigureAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ChatApplication extends SpringMVCConfigureAdapter {


    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String corsDomain = "*";
        if (corsDomain == null || corsDomain.trim().equals("")) {
            corsDomain = "*";
        }
        String[] origins = corsDomain.split(",");
        registry.addMapping("/**").allowedOrigins(origins).allowCredentials(true).allowedMethods("*")
                .allowedHeaders("*");
    }

}

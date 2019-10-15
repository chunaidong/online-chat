 package com.wangmike.chat.server.config;

 import com.wangmike.chat.server.config.Swagger2Config;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.Import;
 import springfox.documentation.builders.ApiInfoBuilder;
 import springfox.documentation.builders.PathSelectors;
 import springfox.documentation.builders.RequestHandlerSelectors;
 import springfox.documentation.service.ApiInfo;
 import springfox.documentation.spi.DocumentationType;
 import springfox.documentation.spring.web.plugins.Docket;





 @Configuration
 @Import({springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class})
 public class Swagger2Config
 {
   @Bean
/* 23 */   public Docket createRestApi() { return (new Docket(DocumentationType.SWAGGER_2))
/* 24 */       .apiInfo(apiInfo())
/* 25 */       .select()
/* 26 */       .apis(RequestHandlerSelectors.basePackage("com.wangmike.chat"))
/* 27 */       .paths(PathSelectors.any())
/* 28 */       .build(); }



/* 32 */   private ApiInfo apiInfo() { return (new ApiInfoBuilder())
/* 33 */       .title("在线交流 v1.0.0")
/* 34 */       .description("在线交流代码接口描述")
/* 35 */       .version("1.0.0")
/* 36 */       .build(); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\config\Swagger2Config.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
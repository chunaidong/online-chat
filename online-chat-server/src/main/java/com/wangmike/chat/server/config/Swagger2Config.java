package com.wangmike.chat.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@Import({BeanValidatorPluginsConfiguration.class})
public class Swagger2Config {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wangmike.chat.server"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("在线交流 v1.0.0")
                .description("在线交流代码接口描述")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("com.wangmike.chat.server", "http://www.baidu.com", "2838138608@qq.com"))
                .version("1.0.0")
                .build();
    }


}

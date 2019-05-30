package com.wangmike.chat.server.config;


import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.wangmike.chat.server.filter.OnlineChatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class OnlieChatConfig {



    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        OnlineChatFilter onlineChatFilter = new OnlineChatFilter();
        filterRegistrationBean.setFilter(onlineChatFilter);

        List<String> urls = Lists.newArrayList();
        urls.add("/*");
        filterRegistrationBean.setUrlPatterns(urls);
        return filterRegistrationBean;
    }

}

package com.wangmike.chat.server.filter;



import com.wangmike.chat.common.entity.ErrorCodeEnum;
import com.wangmike.chat.common.entity.OnlineChatException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OnlineChatFilter implements Filter {

    public static final String[] URLS={"/login","swagger","/json",".js",".css",".ico",".jpg",".png","docs"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 方法 开始");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String path = request.getServletPath();
        boolean flag = true;
        for (String str : URLS) {
            if (path.indexOf(str) != -1) {
                flag =false;
                break;
            }
        }
        if(flag){
            String token = (String)request.getHeader("token");
            if(StringUtils.isBlank(token)){
                response.sendRedirect("/login");
                return;
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);



    }

    @Override
    public void destroy() {
        System.out.println("destroy 方法 开始");
    }
}

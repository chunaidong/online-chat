 package com.wangmike.chat.server.filter;
 
 import com.wangmike.chat.server.filter.OnlineChatFilter;
 import com.wangmike.chat.server.persistence.ConsumerMapper;
 import java.io.IOException;
 import javax.servlet.Filter;
 import javax.servlet.FilterChain;
 import javax.servlet.FilterConfig;
 import javax.servlet.ServletException;
 import javax.servlet.ServletRequest;
 import javax.servlet.ServletResponse;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.commons.lang3.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 
 @Component
 public class OnlineChatFilter implements Filter {
   public static final String[] URLS = { 
/* 21 */       "/login", "/registry", "swagger", "/json", ".js", ".css", "/getUserInfo", "/test", ".ico", ".jpg", ".png", "docs", ".mp3" };
 
   
   @Autowired
   private ConsumerMapper consumerMapper;
 
 
   
/* 29 */   public void init(FilterConfig filterConfig) throws ServletException { System.out.println("init 方法 开始"); }
 
 
   
   public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
/* 34 */     HttpServletRequest request = (HttpServletRequest)servletRequest;
/* 35 */     HttpServletResponse response = (HttpServletResponse)servletResponse;
/* 36 */     String path = request.getServletPath();
/* 37 */     boolean flag = true;
/* 38 */     for (String str : URLS) {
/* 39 */       if (path.indexOf(str) != -1) {
/* 40 */         flag = false;
         break;
       } 
     } 
/* 44 */     if (flag) {
/* 45 */       String token = request.getHeader("openId");
/* 46 */       if (StringUtils.isBlank(token)) {
         
/* 48 */         response.setContentType("application/json;charset=utf-8");
/* 49 */         response.getWriter().println("请先注册");
         
         return;
       } 
/* 53 */       int count = this.consumerMapper.getIsExist(token);
/* 54 */       if (count == 0) {
/* 55 */         response.setContentType("application/json;charset=utf-8");
/* 56 */         response.getWriter().println("请先注册");
         
         return;
       } 
     } 
/* 61 */     filterChain.doFilter(servletRequest, servletResponse);
   }
 
 
 
 
 
   
/* 69 */   public void destroy() { System.out.println("destroy 方法 开始"); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\filter\OnlineChatFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
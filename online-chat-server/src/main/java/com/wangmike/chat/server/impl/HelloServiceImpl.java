 package com.wangmike.chat.server.impl;
 
 import com.wangmike.chat.server.impl.HelloServiceImpl;
 import com.wangmike.chat.server.persistence.HelloMapper;
 import com.wangmike.chat.service.HelloService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 @Service("helloService")
 public class HelloServiceImpl
   implements HelloService
 {
   @Autowired
   private HelloMapper helloMapper;
   
/* 18 */   public String sayHello() { return this.helloMapper.sayHello() + " hahahhaah"; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\HelloServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
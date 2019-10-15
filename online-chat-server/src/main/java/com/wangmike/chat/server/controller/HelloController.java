 package com.wangmike.chat.server.controller;
 import com.wangmike.chat.common.constant.CommonResponse;
 import com.wangmike.chat.server.controller.HelloController;
 import com.wangmike.chat.server.utils.ResponseUtils;
 import com.wangmike.chat.service.HelloService;
 import io.swagger.annotations.*;



 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 @Api(value = "Hello Controller", tags = {"测试时"})
 @RequestMapping({"/hello"})
 public class HelloController {
/* 20 */   private Logger logger = LoggerFactory.getLogger(HelloController.class);
 
   
   @Autowired
   private HelloService helloService;
 
   
   @GetMapping({"/world"})
   @ApiOperation("友好生命接口")
   @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", dataType = "String", required = true), @ApiImplicitParam(name = "password", value = "密码", dataType = "String", required = true)})
   public CommonResponse sayHello(String username, String password) {
/* 31 */     this.logger.info("hello world");
     
/* 33 */     return ResponseUtils.buildSuccessResoonse(this.helloService.sayHello() + "===[" + username + "||||" + password + "]====hello world");
   }
 
 
   
   @ApiOperation("测试异常接口")
   @GetMapping({"/exception"})
   public CommonResponse sayException(@ApiParam(name = "用户名称", value = "username") String username, String password) {
/* 41 */     this.logger.info("hello exception" + username + password);
/* 42 */     return ResponseUtils.buildErrorResponse(username, username);
   }
 
 
   
   @GetMapping({"/test"})
/* 48 */   public String test() { return "hello world"; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\controller\HelloController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
package com.wangmike.chat.server.controller;


import com.wangmike.chat.common.entity.CommonResponse;
import com.wangmike.chat.common.entity.ErrorCodeEnum;
import com.wangmike.chat.common.entity.OnlineChatException;
import com.wangmike.chat.server.utils.ResponseUtils;
import com.wangmike.chat.service.HelloService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api("dddddd")
@RequestMapping("/hello")
public class HelloController {


    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private HelloService helloService;

    @GetMapping("/world")
    public CommonResponse sayHello(HttpServletRequest request, HttpServletResponse response){
        logger.info("hello world");

        return ResponseUtils.buildSuccessResoonse(helloService.sayHello()+"=======hello world");
    }

    @GetMapping("/exception")
    public  String sayException(){
        logger.info("hello world");
        throw new OnlineChatException(ErrorCodeEnum.TEST_CODE);

    }

}




package com.wangmike.chat.server.utils;


import com.wangmike.chat.common.entity.CommonResponse;
import com.wangmike.chat.common.entity.OnlineChatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CommonExceptionHanler {

    private Logger log = LoggerFactory.getLogger(CommonExceptionHanler.class);

    @ExceptionHandler(OnlineChatException.class)
    @ResponseBody
    public CommonResponse handleOnlineChatExcption(HttpServletRequest request, OnlineChatException ex){
        log.error("StudentException code:{},msg:{}",ex.getErrorCodeEnum().getCode(),ex.getErrorCodeEnum().getName());
        return ResponseUtils.buildErrorResponse(ex.getErrorCodeEnum().getCode(),ex.getErrorCodeEnum().getName());
    }


}

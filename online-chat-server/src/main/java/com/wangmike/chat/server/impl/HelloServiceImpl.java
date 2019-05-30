package com.wangmike.chat.server.impl;

import com.wangmike.chat.server.persistence.HelloMapper;
import com.wangmike.chat.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public String sayHello() {
        return helloMapper.sayHello() + " hahahhaah";
    }
}

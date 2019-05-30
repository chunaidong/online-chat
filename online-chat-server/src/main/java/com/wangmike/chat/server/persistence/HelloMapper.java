package com.wangmike.chat.server.persistence;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {

    public int sayHello();

}

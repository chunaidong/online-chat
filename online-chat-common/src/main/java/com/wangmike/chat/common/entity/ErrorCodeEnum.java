package com.wangmike.chat.common.entity;

public enum ErrorCodeEnum {


    TEST_CODE("TEST_CODE","这是测试"),
    NOT_LOGIN("NOT_LOGIN","请登录")
    ;


    ErrorCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

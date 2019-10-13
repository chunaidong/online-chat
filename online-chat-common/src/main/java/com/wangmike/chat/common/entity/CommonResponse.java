package com.wangmike.chat.common.entity;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {


    private String code;

    private String msg;

    private T data;


    public CommonResponse() {
        this.code = CommanContranst.SUCCESS_CODE;
    }

    public CommonResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public CommonResponse(T data) {
        this();
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

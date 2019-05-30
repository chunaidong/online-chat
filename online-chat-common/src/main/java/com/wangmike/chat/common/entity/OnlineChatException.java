package com.wangmike.chat.common.entity;

/**
 * 异常情况
 */
public class OnlineChatException extends RuntimeException {


    private ErrorCodeEnum errorCodeEnum;

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public OnlineChatException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }
}

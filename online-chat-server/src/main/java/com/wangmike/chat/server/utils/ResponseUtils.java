package com.wangmike.chat.server.utils;

import com.wangmike.chat.common.entity.CommanContranst;
import com.wangmike.chat.common.entity.CommonResponse;

public class ResponseUtils {



    public static CommonResponse buildSuccessResoonse(Object obj){
        return new CommonResponse(obj);
    }

    public static CommonResponse buildErrorResponse(String code,String msg){
        return new CommonResponse(code,msg);
    }






}

package com.meetcity.payment.core.common;

import com.sun.org.apache.regexp.internal.RE;

public class ResponseBuilder {

    public static Response success() {
        Response response = new Response();
        response.setCode(ResponseCode.SUCCESS);
        return response;
    }

    public static <T> Response success(T t) {
        Response<T> response = new Response<T>();
        response.setCode(ResponseCode.SUCCESS);
        response.setData(t);
        return response;
    }

    public static Response fail(int code, String msg) {
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }
}

package com.meetcity.payment.channel.endpoint.common.response;

import com.meetcity.payment.channel.endpoint.common.SignatureUtil;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.beans.BeanMap;

@Data
public class SignResponse {
    private Object data;
    private int code;
    private String msg;
    private String sign;

    public static SignResponse success(Object data, String signKey) {
        SignResponse signResponse = new SignResponse();
        signResponse.setCode(Code.SUCCESS);
        signResponse.setMsg("SUCCESS");
        signResponse.setData(data);
        if (data != null) {
            signResponse.setSign(SignatureUtil.getSign(data, signKey));
        }
        return signResponse;
    }

    public static SignResponse success() {
        SignResponse signResponse = new SignResponse();
        signResponse.setCode(Code.SUCCESS);
        signResponse.setMsg("SUCCESS");
        return signResponse;
    }


    public static SignResponse fail() {
        SignResponse signResponse = new SignResponse();
        signResponse.setCode(Code.UNKNOWN_ERROR);
        signResponse.setMsg("UNKNOWN_ERROR");
        return signResponse;
    }

    public static SignResponse fail(int code, String msg) {
        SignResponse signResponse = new SignResponse();
        signResponse.setCode(code);
        signResponse.setMsg(msg);
        return signResponse;
    }

}

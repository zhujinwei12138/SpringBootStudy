package com.example.restful.Exception;

/**
 * FileName:BusinessException
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:17:55
 */
public class BusinessException extends RuntimeException{
    //自定义错误码
    private Integer code;
    //自定义构造器，必须输入错误码及内容
    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

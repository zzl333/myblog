package com.zxl.blog.exception;

import com.zxl.blog.exception.base.ControllerException;

public class UserException extends ControllerException {

    private Integer code;

    public UserException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

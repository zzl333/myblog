package com.zxl.blog.exception;

public class ExceptionResponse {
    private String message;
    private Integer code;

    private ExceptionResponse(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public static ExceptionResponse create(Integer code, String message){
        return new ExceptionResponse(code, message);
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}

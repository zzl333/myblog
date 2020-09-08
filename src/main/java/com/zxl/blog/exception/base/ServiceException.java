package com.zxl.blog.exception.base;

/**
 * 服务层异常
 */
public class ServiceException extends  RuntimeException{

    public ServiceException(String message) {
        super(message);
    }
}

package com.zxl.blog.config;

import com.zxl.blog.exception.ExceptionResponse;
import com.zxl.blog.exception.UserException;
import com.zxl.blog.exception.base.ControllerException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ControllerAdvice
public class ExceptionJsonHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ExceptionResponse handleException(Exception ex){
        if(ex instanceof UserException){
            UserException userException = (UserException) ex;
            return ExceptionResponse.create(userException.getCode(),userException.getMessage());
        }else{
            return ExceptionResponse.create(404, ex.getMessage());
        }
    }


}

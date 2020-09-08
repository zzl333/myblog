package com.zxl.blog.config;

import com.zxl.blog.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    ModelAndView handlerException(Exception ex, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("forward:" + request.getHeader("referer"));
        modelAndView.setStatus(HttpStatus.EXPECTATION_FAILED);
        modelAndView.addObject("msg", ex.getMessage());
        return modelAndView;
    }

}

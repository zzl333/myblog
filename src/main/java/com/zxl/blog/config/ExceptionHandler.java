package com.zxl.blog.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    ModelAndView handlerException(Exception ex, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.setStatus(HttpStatus.EXPECTATION_FAILED);
        modelAndView.addObject("msg", ex.getMessage());
        modelAndView.addObject("info","你可能访问了一个假页面");
        return modelAndView;
    }

}

package com.zxl.blog.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 手动静态资源映射
 */
//@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
   @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        
      registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
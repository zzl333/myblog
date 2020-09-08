package com.zxl.blog.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * session拦截器
 */
@Configuration
public class SessionConfiguration extends WebMvcConfigurationSupport {
    /**
     * 静态资源配置
     */
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("classpath:/imgs/");

        super.addResourceHandlers(registry);
    }*/

    /**
     * 默认首页配置
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/user/index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径为整个项目
//        registry.addInterceptor(new SessionInterceptor());
//                .addPathPatterns("/**")
//                .excludePathPatterns("/asserts/**","/webjars/**");
//                .excludePathPatterns("/user/login*")
//                .excludePathPatterns("/user/index");
        super.addInterceptors(registry);
    }
}

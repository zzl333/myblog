package com.zxl.blog.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * session拦截器 使用webmvccongiguration过期，使用support由于只能存在一个会失效所有配置
 * 推荐是使用webMvcConfigurer
 */
@Configuration
public class SessionConfiguration implements WebMvcConfigurer  {

    /**
     * 默认首页配置
     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:/user/index");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    }
    //由于继承了support只能手动配置静态资源映射

    //自定义资源映射
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
//                .addResourceLocations("classpath:/public/")
//                .addResourceLocations("classpath:/resources/")
//                .addResourceLocations("classpath:/templates/")
//                .addResourceLocations("classpath:/webjars/");
//    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/asserts/**");
    }
}

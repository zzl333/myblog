package com.zxl.blog.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * session拦截器
 */
@Configuration
public class SessionConfiguration extends WebMvcConfigurationSupport {
    /**
     * 静态资源配置
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/img/**")
//                .addResourceLocations("classpath:/imgs/");
//
//        super.addResourceHandlers(registry);
//    }

    /**
     * 默认首页配置
     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:/user/index");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        super.addViewControllers(registry);
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截路径为整个项目,登录页面和登录动作都拦截，为了做自动自动
        //静态资源不需要管，已经做好了资源映射
        registry.addInterceptor(new SessionInterceptor())
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    //由于继承了support只能手动配置静态资源映射

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }
}

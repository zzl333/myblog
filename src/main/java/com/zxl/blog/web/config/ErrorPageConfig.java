package com.zxl.blog.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
    /**
     *自定义错误页面配置类
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return (factory -> {
            ErrorPage errorPage = new ErrorPage( "/error.html");
            factory.addErrorPages(errorPage);
        });
    }
}
 

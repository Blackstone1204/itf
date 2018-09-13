package com.config;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 登录配置 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
//@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    @Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedOrigins("*") 
                .allowCredentials(true)  
                .allowedMethods("POST","GET","OPTIONS") 
                .allowedHeaders("x-requested-with")
                .maxAge(3600);  
    }  
 

}
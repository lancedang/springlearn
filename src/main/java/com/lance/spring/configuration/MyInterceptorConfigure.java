package com.lance.spring.configuration;

import com.lance.spring.interceptor.MyHandlerInterceptor1;
import com.lance.spring.interceptor.MyHandlerInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dangdang on 2018/1/14.
 */
@Configuration
public class MyInterceptorConfigure extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor1());
        registry.addInterceptor(new MyHandlerInterceptor2());
        super.addInterceptors(registry);
    }
}

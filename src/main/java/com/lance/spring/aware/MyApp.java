package com.lance.spring.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by Dangdang on 2018/1/11.
 * 实现Aware接口，Spring会自动注入相应资源，该资源存在上下文中
 *
 */
//@Configuration
@Component
@Slf4j
public class MyApp implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    //注入的方法即为重写Aware接口的setResourceName方法
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        log.info("in aware");
    }

    public static void test() {
        Objects.nonNull(applicationContext);
        String applicationName = applicationContext.getApplicationName();
        System.out.println("applicationName: " + applicationName);
    }
}

package com.lance.spring.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Dangdang on 2018/1/12.
 */
@Component
public class MyApp2 {

    @Autowired
    private ApplicationContext applicationContext;

    public void test() {
        System.out.println("MyApp2");
        System.out.println(applicationContext.getClass().getName());
    }

}

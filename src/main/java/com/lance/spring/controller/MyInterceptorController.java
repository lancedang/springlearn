package com.lance.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dangdang on 2018/1/14.
 */
@RestController
@RequestMapping("/interceptor")
public class MyInterceptorController {

    @RequestMapping("")
    public String testIntercept(String param) {
        System.out.println("param: " + param);
        return param;
    }

}

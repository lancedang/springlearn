package com.lance.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.validator.constraints.Mod11Check;
import org.springframework.stereotype.Component;

/**
 * Created by Dangdang on 2018/1/14.
 */
@Component
@Aspect
@Slf4j
public class TestAspect {

    @Pointcut(("execution(public * com.lance.spring.controller.*.*(..))"))
    public void restPoint() {

    }

    @Before("restPoint()")
    public void before(JoinPoint joinPoint) {
        log.info("aspect before pointcut");
    }

    @After("restPoint()")
    public void after(JoinPoint joinPoint) {
        log.info("aspect after pointcut");
    }

    @Around("restPoint()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("aspect around before target method");
        joinPoint.proceed();
        log.info("aspect around after target method");
    }

    //@AfterReturning(pointcut = "restPoint()", returning = "result")
    public void afterReturning(Object result) throws Throwable {
        log.info("aspect after returning, result = " + result);
    }

}

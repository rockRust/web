package com.wrx.js.web.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jiaosong
 * @desc
 * @date 2020/4/27
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.wrx.js.web.controller.*.*(..))")
    public void controller(){}

    @Before("controller()")
    public void before() {
        log.info("aop test, before controller");
    }

    @After("controller()")
    public void afterController() {
        log.info("after controller");
    }
}

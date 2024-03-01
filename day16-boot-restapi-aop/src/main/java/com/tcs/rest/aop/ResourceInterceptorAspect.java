package com.tcs.rest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ResourceInterceptorAspect {
	@Pointcut("execution(* com.tcs.rest.resources.*.*(..))")//("execution(com.tcs.rest.resources.ProductResource)")
public void loggingPointCut() {
	
}

@Before("loggingPointCut()")
public void before(JoinPoint joinpoint) {
	log.info("Before method invoked:: "+joinpoint.getSignature());
}

@After("loggingPointCut()")
public void after(JoinPoint joinpoint) {
	log.info("Before method invoked:: "+joinpoint.getSignature());
}

}

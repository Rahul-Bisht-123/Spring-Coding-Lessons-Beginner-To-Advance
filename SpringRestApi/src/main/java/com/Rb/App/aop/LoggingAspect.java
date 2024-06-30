package com.Rb.App.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
  
	private static Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	@Before("execution(* com.Rb.App.service.JobService.*(..))")
	public void logMethodCall1(JoinPoint jp) {
		LOGGER.info("Method Called @Before : | " + jp.getSignature());
	}
	
	@After("execution(* com.Rb.App.service.JobService.*(..))")
	public void logMethodCall2(JoinPoint jp) {
		LOGGER.info("Method Called @After : | " + jp.getSignature());
	}
	
	@AfterReturning("execution(* com.Rb.App.service.JobService.*(..))")
	public void logMethodCall3(JoinPoint jp) {
		LOGGER.info("Method Called @AfterReturning| " + jp.getSignature());
	}
}

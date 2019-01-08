package com.sandeep.practice.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Advice will only work with Spring Beans.
 * It will not work with the instances created with new, so use auto-wire.
 * To use advice for any pojo class, it requires to configure with annotation
 * @Configurable and use dependency aspect-weaver and aspectrt.Enable loadt time weaving.
 * 
 * @author Sandeep.Mishra
 *
 */
@Configuration
@Aspect
public class LogAdvice {
	
	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());
	
//	@Before("@annotation(com.sandeep.practice.annotation.Loggable)")
//	public void before(JoinPoint joinPoint) throws Throwable 
//	{
//		logger.info("Entered method(before advice): {}"+ joinPoint);
//		
//	}
	
	
	@Around("@annotation(com.sandeep.practice.annotation.Loggable)")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable 
	{
		logger.info("Entered method(Around): {}"+ joinPoint);
		Long startTime=System.currentTimeMillis();
		logger.info("Started {} ms",startTime);
		
		Object ret=joinPoint.proceed();
		
		Long endTime=System.currentTimeMillis();
		logger.info("Stopped.Total Time Taken {} ms",endTime-startTime);
		
		return ret;
		
	}
	
//	
//	@After("execution(* com.sandeep.practice.model.response.*.*(..))")
//	public void after(JoinPoint joinPoint) throws Throwable 
//	{
//		logger.info("Exited method: {}"+ joinPoint);
//		
//		
//	}
	

}

package kr.co.ch03.sub01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {
	
	//                반환타입                  method 모든 매개변수
	@Pointcut("execution(* kr.co.ch03.sub01.Service.*(..))")
	public void beforePointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.sub01.Service.*(..))")
	public void afterPointcut() {}
	
	@Before("beforePointcut()")
	public void before() {
		System.out.println("횡단관심 - before...");
	}
	
	@After("afterPointcut()")
	public void after() {
		System.out.println("횡단관심 - after...");		
	}
}

package com.cosmostaker.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	// Add all of our related advises for logging
	
	// Start with an @Before advice
	@Before("execution(* add*(com.cosmostaker.aop.Account, ..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on method()");
	}
}

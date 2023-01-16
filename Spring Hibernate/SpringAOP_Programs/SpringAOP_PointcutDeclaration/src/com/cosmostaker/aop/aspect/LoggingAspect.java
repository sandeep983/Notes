package com.cosmostaker.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
//	@Pointcut("execution(* com.cosmostaker.aop.dao.*.*(..))")
//	private void forDaoPackage() {}
//	
	
	// Create Pointcut for getter methods
	@Pointcut("execution(* com.cosmostaker.aop.dao.*.get*(..))")
	private void getter() {}
	
	// Create Pointcut for setter methods
	@Pointcut("execution(* com.cosmostaker.aop.dao.*.set*(..))")
	private void setter() {}
	
	// Create Pointcut include package...exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	
	
	
	
	
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on method()");
	}
}

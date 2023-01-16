package com.cosmostaker.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = ctx.getBean("myCoach", ICoach.class);
		ICoach alphaCoach = ctx.getBean("myCoach", ICoach.class);
		
		// Checking if they are same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location for: " + theCoach);
		System.out.println("Memory location for: " + alphaCoach);
		
		// Close the context
		ctx.close();
	}
}

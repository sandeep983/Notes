package com.cosmostaker.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
	public static void main(String[] args) {
		// Read spring config file
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Get the bean from spring container
		ICoach theCoach = cxt.getBean("tennisCoach", ICoach.class);
		ICoach alphaCoach = cxt.getBean("tennisCoach", ICoach.class);
		
		boolean result = (theCoach == alphaCoach);

		// Call a method on the bean
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory Location for --> theCoach: " + theCoach);
		System.out.println("Memory Location for --> alphaCoach: " + alphaCoach);
		
		// Close the context
		cxt.close();
	}
}

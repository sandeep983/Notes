package com.cosmostaker.annotations.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("scope-applicationContext.xml");
		
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

package com.cosmostaker.annotations.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("ci-applicationContext.xml");
		
		// Get the bean from spring container
		ICoach theCoach = cxt.getBean("tennisCoach", ICoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		cxt.close();
	}
}

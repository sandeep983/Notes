package com.cosmostaker.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
	public static void main(String[] args) {
		// Read spring config file
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Get the bean from spring container
		SwimCoach theCoach = cxt.getBean("swimCoach", SwimCoach.class);

		// Call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		// Close the context
		cxt.close();
	}
}

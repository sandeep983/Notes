package com.cosmostaker.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = ctx.getBean("myCoach", ICoach.class);
		
		System.out.println(theCoach.getDailyWorkout());

		// Close the context
		ctx.close();
	}
}

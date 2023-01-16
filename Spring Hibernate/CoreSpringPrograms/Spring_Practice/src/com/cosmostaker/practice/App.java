package com.cosmostaker.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Load the spring config
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		ICoach theCoach = ctx.getBean("cricketCoach", ICoach.class);
		
		// Calling the methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		ctx.close();
	}
}

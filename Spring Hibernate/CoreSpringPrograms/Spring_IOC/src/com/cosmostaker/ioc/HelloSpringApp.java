package com.cosmostaker.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from spring container
		ICoach theCoach = cxt.getBean("myCoach", ICoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		cxt.close();
	}
}

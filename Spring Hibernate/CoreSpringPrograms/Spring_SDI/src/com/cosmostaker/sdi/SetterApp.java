package com.cosmostaker.sdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the container
		CricketCoach theCoach = cxt.getBean("myCricketCoach", CricketCoach.class);
		
		// Calling methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
	
		// Close the context
		cxt.close();
	}
}

package com.cosmostaker.noxml;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements ICoach {
	@Autowired
	private IFortuneService fs;
	
	// Default Constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Default Contructor");
	}

	// Define Init method
	
	public void doMyStartupStuff() {
		System.out.println("Inside: doMyStartupMethod");
	}
	// Define Destroy method
	public void doMyCleanupStuff() {
		System.out.println("Inside: doMyCleanupMethod");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
}

package com.cosmostaker.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
	@Autowired
	@Qualifier("databaseFortuneService")
	private IFortuneService fs;
	
	// Default Constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Default Constructor");
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

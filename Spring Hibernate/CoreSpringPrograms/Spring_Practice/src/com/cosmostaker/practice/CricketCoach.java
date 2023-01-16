package com.cosmostaker.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {
	@Autowired
	private IFortuneService fs;
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fs.getDailyFortune();
	}
}

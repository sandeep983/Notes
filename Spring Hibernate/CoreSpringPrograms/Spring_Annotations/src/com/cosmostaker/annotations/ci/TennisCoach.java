package com.cosmostaker.annotations.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
	private IFortuneService fs;
	
	@Autowired
	public TennisCoach(IFortuneService fs) {
		this.fs = fs;
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

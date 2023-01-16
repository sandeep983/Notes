package com.cosmostaker.sdi;

public class BaseballCoach implements ICoach{
	private IFortuneService fs;
	
	// Constructor
	public BaseballCoach(IFortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fs.getFortune();
	}
}

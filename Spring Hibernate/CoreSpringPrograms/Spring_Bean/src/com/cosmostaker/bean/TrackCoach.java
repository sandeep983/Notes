package com.cosmostaker.bean;

public class TrackCoach implements ICoach {
	private IFortuneService fs;
	
	// Constructor
	public TrackCoach() {}
	public TrackCoach(IFortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run hard for 5Kms";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fs.getFortune();
	}
	
	// Init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside doMyStartupStuff");
	}
	
	// Destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside doMyCleanupStuff");
	}
}

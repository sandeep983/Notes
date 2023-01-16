package com.cosmostaker.sdi;

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
}

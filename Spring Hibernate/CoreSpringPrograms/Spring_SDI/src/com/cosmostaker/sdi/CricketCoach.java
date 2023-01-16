package com.cosmostaker.sdi;

public class CricketCoach implements ICoach {
	private IFortuneService fs;
	
	// Fields for email address and team
	private String emailAddress;
	private String team;
	
	// No-argument constructor
	public CricketCoach() {
		System.out.println("CircketCoach: No-arg Constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method -  setTeam");
		this.team = team;
	}

	// Setter
	public void setFs(IFortuneService fs) {
		System.out.println("CricketCoach: Inside setter method");
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
}

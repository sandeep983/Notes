package com.cosmostaker.bean;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {
    private IFortuneService fs;

    // Injecting the values
    @Value("${swim.email}")
    private String email;

    @Value("${swim.team}")
    private String team;

    // Getters
    public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

    // Constructor
    public SwimCoach(IFortuneService tfs) {
        fs = tfs;
    }

    // Implementation for the methods
    @Override
    public String getDailyWorkout() {
        return "Swim 500 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fs.getFortune();
    }  
}

package com.cosmostaker.annotations.mi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {
	@Autowired
	private IFortuneService fs;
	
	// Default Constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Default Contructor");
	}
	
	/*
	// Method
	@Autowired
	public void doSomething(IFortuneService tfs) {
		System.out.println("TennisCoach: doSomething()");
		fs = tfs;
	}*/
	
	/*
	@Autowired
	public TennisCoach(IFortuneService fs) {
		this.fs = fs;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
}
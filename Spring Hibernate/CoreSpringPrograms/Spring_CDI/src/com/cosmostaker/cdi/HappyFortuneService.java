package com.cosmostaker.cdi;

public class HappyFortuneService implements IFortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}

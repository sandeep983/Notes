package com.cosmostaker.annotations.fi;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}

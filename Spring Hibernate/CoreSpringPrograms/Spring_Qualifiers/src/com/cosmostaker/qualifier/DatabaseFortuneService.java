package com.cosmostaker.qualifier;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {
	@Override
	public String getFortune() {
		return "Database Fortune Service";
	}
}

package com.cosmostaker.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addMembership() {
		System.out.println(getClass() + " --> ADDING A MEMBERSHIP");
	}
	public void gotoSleep() {
		System.out.println(getClass() + " --> GOING TO SLEEP");
	}
}

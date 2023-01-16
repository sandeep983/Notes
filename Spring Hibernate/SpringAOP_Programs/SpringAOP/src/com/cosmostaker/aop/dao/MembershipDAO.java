package com.cosmostaker.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addMembership() {
		System.out.println(getClass() + " --> DOING STUFF: ADDING A MEMBERSHIP");
	}
}

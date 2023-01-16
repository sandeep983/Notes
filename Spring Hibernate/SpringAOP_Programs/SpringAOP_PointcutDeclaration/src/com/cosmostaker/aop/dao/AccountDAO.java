package com.cosmostaker.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount() {
		System.out.println(getClass() + " --> ADDING AN ACCOUNT");
	}
	public void doWork() {
		System.out.println(getClass() + " --> ACCOUNT DO-WORK");
	}

	// Getter & Setter methods
	public String getName() {
		System.out.println(getClass() + " :in getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println(getClass() + " :in setName()");
		this.name = name;
	}
	public String getServiceCode() {
		System.out.println(getClass() + " :in getServiceCode()");
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {	
		System.out.println(getClass() + " :in setServiceCode()");
		this.serviceCode = serviceCode;
	}
}

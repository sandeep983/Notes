package com.cosmostaker.aop.dao;

import org.springframework.stereotype.Component;

import com.cosmostaker.aop.Account;

@Component
public class AccountDAO {
	public void addAccountWP() {
		System.out.println(getClass() + " --> DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addAccount(Account theAccount, boolean val) {
		System.out.println(getClass() + " --> DOING MY DB WORK: ADDING ACCOUNT OBJECT");
	}
}

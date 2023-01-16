package com.cosmostaker.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cosmostaker.aop.dao.AccountDAO;
import com.cosmostaker.aop.dao.MembershipDAO;

public class MainApp {
	public static void main(String[] args) {
		// Read spring config java class
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
		
		// Get the account bean from spring container
		AccountDAO theAccountDAO = ctx.getBean("accountDAO", AccountDAO.class);
		
		// Get the membership bean from spring container
		MembershipDAO theMembershipDAO = ctx.getBean("membershipDAO", MembershipDAO.class);
		
		
		Account myAccount = new Account();
		// Calling the account business method
		theAccountDAO.addAccount(myAccount, false);
		theAccountDAO.addAccountWP();
		
		// Calling the membership business method
		theMembershipDAO.addMembership();
		
		
		// Close the context
		ctx.close();
	}
}

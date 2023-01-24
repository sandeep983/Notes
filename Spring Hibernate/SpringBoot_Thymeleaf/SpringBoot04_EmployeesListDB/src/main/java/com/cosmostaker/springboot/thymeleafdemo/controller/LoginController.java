package com.cosmostaker.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showLoginPage")
	public String showMyLoginPage() {
		
		return "login";	
	}
	

	// add request mapping for /accessDenied
	@GetMapping("/accessDenied")
	public String showAccessDenied() {
		
		return "accessDenied";	
	}	
}
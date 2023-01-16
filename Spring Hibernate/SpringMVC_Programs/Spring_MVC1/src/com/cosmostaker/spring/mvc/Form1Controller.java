package com.cosmostaker.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form1Controller {
	// To show Html form
	@RequestMapping("/showForm1")
	public String showForm() {
		return "inputForm1";
	}
	
	
	// To process the html form
	@RequestMapping("/processForm1")
	public String processForm() {
		return "processForm1";
	}
}

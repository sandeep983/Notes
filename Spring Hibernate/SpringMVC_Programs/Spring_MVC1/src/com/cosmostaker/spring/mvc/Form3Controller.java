package com.cosmostaker.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form3Controller {
	// To show Html form
	@RequestMapping("/showForm3")
	public String showForm() {
		return "inputForm3";
	}
		
	
	// To read form data and add data to model
	@RequestMapping("/processForm3")
	public String readData(@RequestParam("name") String theName, Model model) {		
		// Convert data to all capital
		theName = theName.toUpperCase();
		
		// Create the message
		String greetMsg = "Hello, " + theName;
		
		// Add the message to the model
		model.addAttribute("message", greetMsg);
		
		return "processForm3";
	}
}

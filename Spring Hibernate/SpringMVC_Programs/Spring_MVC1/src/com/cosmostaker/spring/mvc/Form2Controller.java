package com.cosmostaker.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form2Controller {
	// To show Html form
	@RequestMapping("/showForm2")
	public String showForm() {
		return "inputForm2";
	}
		
	
	// To read form data and add data to model
	@RequestMapping("/processForm2")
	public String readData(HttpServletRequest request, Model model) {
		// Read request parameter from html form
		String theName = request.getParameter("name");
		
		// Convert data to all capital
		theName = theName.toUpperCase();
		
		// Create the message
		String greetMsg = "Hello, " + theName;
		
		// Add the message to the model
		model.addAttribute("message", greetMsg);
		
		return "processForm2";
	}
}

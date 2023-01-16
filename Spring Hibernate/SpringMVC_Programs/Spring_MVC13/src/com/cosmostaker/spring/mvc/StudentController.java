package com.cosmostaker.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// Create a student object
		Student theStudent = new Student();
		
		// Add object to the model
		theModel.addAttribute("student", theStudent);
		
		return "studentForm";
	}
	
	@RequestMapping("/processForm") 
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// Will print in console 
		System.out.println("Student Details:\n"+"FullName: "+theStudent.getFirstName()+" "+theStudent.getLastName());
		return "studentConfirmation";
	}
}
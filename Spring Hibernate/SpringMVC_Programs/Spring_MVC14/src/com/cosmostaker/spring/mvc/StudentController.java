package com.cosmostaker.spring.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
    @Value("#{countryList}") 
    private Map<String, String> countryList;
    
    @RequestMapping("/showForm") 
    public String showForm(Model theModel) { 
        // create a student object Student 
        Student theStudent = new Student();
     
        // add student object to the model 
        theModel.addAttribute("student", theStudent);
    
        // add the country options to the model 
        theModel.addAttribute("theCountryList", countryList); 
    
        return "studentForm";
    }
    
    
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// Will print in console 
		System.out.println("Student Details:\n"+"FullName: "+theStudent.getFirstName()+" "+theStudent.getLastName());
		return "studentConfirmation";
	}
}
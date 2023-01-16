package com.cosmostaker.springboot.mySpringApp.rest;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppRestController {
	
	// Expose "/" end-point which returns "Hello World"
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World! Time on the server is: " + LocalDateTime.now();
	}
	
	// Expose new end-point for work-out
	@GetMapping("/workout")
	public String getWorkout() {
		return "Daily work-out for 30mins";
	}
	
	
	//Expose new end-point for fortune
	@GetMapping("/fortune")
	public String getFortune() {
		return "Today is your lucky day!";
	}
}

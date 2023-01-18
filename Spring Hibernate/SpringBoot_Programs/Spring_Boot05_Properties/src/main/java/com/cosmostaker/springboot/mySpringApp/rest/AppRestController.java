package com.cosmostaker.springboot.mySpringApp.rest;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppRestController {
	
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;


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

	//Expose new end-point for team info
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team Name: " + teamName;
	}
}

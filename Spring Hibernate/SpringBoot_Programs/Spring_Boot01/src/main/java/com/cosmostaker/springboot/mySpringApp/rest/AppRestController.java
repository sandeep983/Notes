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
}

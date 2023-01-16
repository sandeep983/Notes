package com.cosmostaker.cdi;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		ICoach theCoach = new TrackCoach();
		
		// Use the 0object
		System.out.println(theCoach.getDailyWorkout());
	}
}

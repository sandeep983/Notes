package com.cosmostaker.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryList;

	// Default Constructor
	public Student() {
		countryList = new LinkedHashMap<>();
		countryList.put("IN", "India");
		countryList.put("FR", "France");
		countryList.put("DE", "Germany");
		countryList.put("JP", "Japan");
		countryList.put("US", "United States of America");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
}

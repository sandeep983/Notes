package com.cosmostaker.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false;
		
		if(theCode != null) {
			// Looping thru course prefixes and finding the match
			for(String s: coursePrefix) {
				result = theCode.startsWith(s);
				if(result) {
					break;
				}
			}
		}
		else {
			result = true;
		}
		
		return result;
	}
}

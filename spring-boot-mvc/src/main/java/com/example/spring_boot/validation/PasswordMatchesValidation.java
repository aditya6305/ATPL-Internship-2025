package com.example.spring_boot.validation;

import com.example.spring_boot.Model.UserRegistration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidation implements ConstraintValidator<PasswordMatches, UserRegistration>{
	@Override
	
	public boolean isValid(UserRegistration value, ConstraintValidatorContext context) {
		if(value.getPassword()== null || value.getConfirmPassword() == null) {
			return false;
		}
		return value.getPassword().equals(value.getConfirmPassword());
	}
	
}

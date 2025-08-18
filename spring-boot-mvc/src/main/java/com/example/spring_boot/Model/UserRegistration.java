package com.example.spring_boot.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UserRegistration {
	
	@NotBlank(message = "username is required")
	private String username;
	@NotBlank(message = "password is required")
	private String password;
	@NotBlank(message = "confirm password is required")
	private String confirmPassword;
	@Min(value = 18, message = "user has atleast 18 years old")
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

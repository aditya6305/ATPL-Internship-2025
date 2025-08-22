package com.aaslin.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/api")
public class HelloController {
	// No login is needed for this one because we are permitting into it.
	@GetMapping("/hello")
	public String hello() {
		return "this is an end point";
	}
	//It is intercepted by filters and it required authentication and if not logged in it shows the login page and it will throw 401 unauthorized error.
	@GetMapping("/secure")
	public String source() {
		return "Hello this a security source";
	}
	
	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "Admin Dashboard";
	}
	
	@GetMapping("/user/profile")
	public String userProfile() {
		return "User profile";
	}
	
}

package com.example.spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CodeController {
	
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("Controller method is executed");
		return "welcome to spring mvc";
	}

   
}

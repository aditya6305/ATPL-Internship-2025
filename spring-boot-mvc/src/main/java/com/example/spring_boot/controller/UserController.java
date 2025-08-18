package com.example.spring_boot.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot.Model.UserRegistration;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegistration user) {
	    return user.getPassword().equals(user.getConfirmPassword())? ResponseEntity.ok("User registered successfully"): 
	    	ResponseEntity.badRequest().body(Map.of("error", "Passwords do not match"));
	}
}

package com.aaslin.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.aaslin.spring_security.model.AuthRequest;
import com.aaslin.spring_security.repository.UserRepository;

@RestController
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest user) {
 
        if (userRepository.findByusername(user.getUsername()).isPresent()) {
            return "User already exists!";
        }


        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRoles() == null || user.getRoles().isEmpty()) {
            user.setRoles("USER");
        }

        userRepository.save(user);
        return "User registered successfully!";
    }
}
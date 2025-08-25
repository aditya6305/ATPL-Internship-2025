package com.aaslin.spring_security.controller;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import com.aaslin.spring_security.model.AuthRequest;
import com.aaslin.spring_security.service.JwtUtil;

@RestController
public class AuthenticationController {

    private final JwtUtil jwtUtil;

    public AuthenticationController(AuthenticationManager authManager, JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        return jwtUtil.generateToken(request.getUsername());
    }
}
package com.aaslin.spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello User! You are authenticated.";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello Admin! You have admin access.";
    }
}
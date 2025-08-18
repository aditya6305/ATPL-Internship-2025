package com.aaslin.assignment.controller;

import com.aaslin.assignment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    @Autowired
    private GreetingService greetingService;
    
    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }
}

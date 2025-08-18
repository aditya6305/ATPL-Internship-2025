package com.aaslin.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot!..This is aditya");
        return "greeting";
    }
}

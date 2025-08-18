// src/main/java/com/aaslin/springboot_assignment/controller/TestController.java
package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String home() {
        return "test-api";
    }

    @GetMapping("/test")
    public String test() {
        return "test-api";
    }
}
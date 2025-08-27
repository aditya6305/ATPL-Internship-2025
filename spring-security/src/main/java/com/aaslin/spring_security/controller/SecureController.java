//package com.aaslin.spring_security.controller;
//
//import org.springframework.web.bind.annotation.*;
//
//import com.aaslin.spring_security.service.UserService;
//
//@RestController
//@RequestMapping("/secure")
//public class SecureController {
//
//    private final UserService userService;
//
//    public SecureController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        return userService.deleteUser(id);
//    }
//
//    @GetMapping("/profile/{username}")
//    public String viewProfile(@PathVariable String username) {
//        return userService.viewProfile(username);
//    }
//}
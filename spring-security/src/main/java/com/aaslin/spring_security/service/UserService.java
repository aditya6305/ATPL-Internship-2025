package com.aaslin.spring_security.service;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @PreAuthorize("hasRole('ADMIN')")
    public String deleteUser(Long id) {
        return "User with id " + id + " deleted!";
    }

    @PreAuthorize("hasRole('USER')")
    public String viewProfile(String username) {
        return "Profile data for user: " + username;
    }
}
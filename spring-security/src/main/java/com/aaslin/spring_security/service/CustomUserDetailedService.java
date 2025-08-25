package com.aaslin.spring_security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailedService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if ("admin".equals(username)) {
            return User.withUsername("admin")
                    .password("{noop}admin123") 
                    .roles("ADMIN")
                    .build();
            /*After giving username and password of admin a token is generated like this 
      eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTc1NjEyNDcyNCwiZXhwIjoxNzU2MTI4MzI0fQ.KHL4qeTDc4LhCqgG6RGkGyKyxaZ_pEV8_OF0GdHMSR8.
      using that token goto the authorization tab in postman and select Authtype as Bearer token and give the token that was generated while login with user creds 
      then it will redriected to admin controller and prints a message "Hello Admin! You have admin access".
      */ 
        } else if ("user".equals(username)) {
            return User.withUsername("user")
                    .password("{noop}user123")
                    .roles("USER")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found: " + username);
        }
    }
}
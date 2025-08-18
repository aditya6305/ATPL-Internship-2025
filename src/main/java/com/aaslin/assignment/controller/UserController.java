package com.aaslin.assignment.controller;

import com.aaslin.assignment.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private List<User> users = new ArrayList<>();
    
    public UserController() {
        users.add(new User(1,"Aditya","aditya@gmail.com"));
        users.add(new User(2,"Chappati","chappati@gmail.com"));
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}

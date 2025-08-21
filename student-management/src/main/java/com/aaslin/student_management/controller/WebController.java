package com.aaslin.student_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.aaslin.student_management.service.StudentService;
import com.aaslin.student_management.model.Student;
import com.aaslin.student_management.model.Admin;

@Controller
public class WebController {
    
    @Autowired
    private StudentService studentService;
    
    // Home page - show login
    @GetMapping("/")
    public String home() {
        return "login";
    }
    
    // Login page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    // Handle login form submission
    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, @RequestParam String userType, Model model) {
        
        if ("admin".equals(userType)) {
            // Check if admin user exists first
            Admin admin = studentService.getAdminByUsername(username);
            if (admin == null) {
                model.addAttribute("error", "Username is incorrect");
                return "login";
            }
            
            // If user exists, check password
            if (!password.equals(admin.getPassword())) {
                model.addAttribute("error", "Wrong password");
                return "login";
            }

            // If both username and password are correct
            model.addAttribute("admin", admin);
            model.addAttribute("students", studentService.getAllActiveStudents());
            return "admin";

        } else if ("student".equals(userType)) {
            // Check if student exists first
            Student student = studentService.getStudentByRollNo(username);
            if (student == null) {
                model.addAttribute("error", "Username is incorrect");
                return "login";
            }

            // If student exists, check password
            if (!password.equals(student.getPassword())) {
                model.addAttribute("error", "Wrong password");
                return "login";
            }

            // If both roll number and password are correct
            model.addAttribute("student", student);
            return "student";
        }
        model.addAttribute("error", "Invalid user type");
        return "login";
    }
    
    // Admin dashboard
    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("students", studentService.getAllActiveStudents());
        return "admin";
    }
    
    // Student profile
    @GetMapping("/student")
    public String studentProfile(@RequestParam String rollNo, Model model) {
        Student student = studentService.getStudentByRollNo(rollNo);
        model.addAttribute("student", student);
        return "student";
    }
    
    // Logout
    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
}

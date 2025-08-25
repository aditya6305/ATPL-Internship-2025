package com.aaslin.student_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.aaslin.student_management.model.Student;
import com.aaslin.student_management.service.StudentService;

import java.util.List;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private StudentService studentService;
    
    // It displays add-student form in the admin portal.
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }
    
    // Add new student
    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") @Valid Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            
            model.addAttribute("students", studentService.getAllActiveStudents());
            return "add-student";
        }
        
        try {
            student.setCreatedBy("admin");
            studentService.saveStudent(student);
            model.addAttribute("message", "Student added successfully");
        } catch (Exception e) {
            model.addAttribute("error", "Error adding student: " + e.getMessage());
        }
        
        model.addAttribute("students", studentService.getAllActiveStudents());
        return "admin";
    }
    
    // Show edit student form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "edit-student";
    }
    
    // Update student
    @PostMapping("/edit")
    public String updateStudent(@ModelAttribute Student student, Model model) {
        try {
            student.setUpdatedBy("admin");
            studentService.updateStudent(student);
            model.addAttribute("message", "Student updated successfully");
        } catch (Exception e) {
            model.addAttribute("error", "Error updating student: " + e.getMessage());
        }
        model.addAttribute("students", studentService.getAllActiveStudents());
        return "admin";
    }
    
    // Delete student (soft delete)
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id, Model model) {
        try {
            studentService.deleteStudent(id);
            model.addAttribute("message", "Student deleted successfully");
        } catch (Exception e) {
            model.addAttribute("error", "Error deleting student: " + e.getMessage());
        }
        model.addAttribute("students", studentService.getAllActiveStudents());
        return "admin";
    }
    
    // Search students
    @PostMapping("/search")
    public String searchStudents(@RequestParam String rollNo, Model model) {
        List<Student> students = studentService.searchStudentsByRollNo(rollNo);
        model.addAttribute("students", students);
        return "admin";
    }
    //To change the status of the student either active or inactive.
    
    @PostMapping("/toggle-status/{id}")
    public String toggleStudentStatus(@PathVariable String id, Model model) {
        try {
            studentService.toggleStudentStatus(id);
            model.addAttribute("message", "Student status updated successfully");
        } catch (Exception e) {
            model.addAttribute("error", "Error updating student status: " + e.getMessage());
        }
        model.addAttribute("students", studentService.getAllActiveStudents());
        return "admin";
    }
    // To update the changed status into the db.
    @PostMapping("/update-status")
    @ResponseBody
    public ResponseEntity<String> updateStudentStatus(@RequestParam String id, @RequestParam boolean isActive) {
        try {
            studentService.updateStudentStatus(id, isActive);
            return ResponseEntity.ok("Status updated successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error updating status: " + e.getMessage());
        }
    }
}

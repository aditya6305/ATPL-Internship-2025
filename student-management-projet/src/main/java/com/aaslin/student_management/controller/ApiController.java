package com.aaslin.student_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aaslin.student_management.service.StudentService;
import com.aaslin.student_management.model.Student;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Autowired
    private StudentService studentService;
    
    // Get all active students
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllActiveStudents();
        return ResponseEntity.ok(students);
    }
    
    // Get student by ID
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
        /*.build() method is the final step in this chain. It takes all the configurations applied through the preceding builder methods and 
         * constructs the immutable ResponseEntity object, which is then returned.
         */
    
    }
    
    // Add new student
    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        student.setCreatedBy("api");
        Student savedStudent = studentService.saveStudent(student);
        return ResponseEntity.ok(savedStudent);
    }
    
    // Update student
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student student) {
        student.setId(id);
        student.setUpdatedBy("api");
        Student updatedStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }
    
    // Delete student (soft delete)
    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
    
    // Search students by roll number
    @GetMapping("/students/search")
    public ResponseEntity<List<Student>> searchStudents(@RequestParam String rollNo) {
        List<Student> students = studentService.searchStudentsByRollNo(rollNo);
        return ResponseEntity.ok(students);
    }
    
    @PatchMapping("/students/{id}/status")
    public ResponseEntity<String> updateStudentStatus(@PathVariable String id, @RequestParam boolean isActive) {
        try {
            studentService.updateStudentStatus(id, isActive);
            return ResponseEntity.ok("Student status updated successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error updating status: " + e.getMessage());
        }
    }
    
    @PostMapping("/students/{id}/toggle-status")
    public ResponseEntity<String> toggleStudentStatus(@PathVariable String id) {
        try {
            studentService.toggleStudentStatus(id);
            return ResponseEntity.ok("Student status changing successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error changing status: " + e.getMessage());
        }
    }
}

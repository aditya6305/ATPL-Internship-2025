package com.aaslin.student_management.service;

import com.aaslin.student_management.model.Admin;
import com.aaslin.student_management.model.Student;
import java.util.List;

public interface StudentService {
    
    Admin loginAdmin(String username, String password);
    
    Student loginStudent(String rollNo, String password);
    
    Admin getAdminByUsername(String username);
    
    Student getStudentByRollNo(String rollNo);
    
    List<Student> getAllActiveStudents();
    
    Student saveStudent(Student student);
    
    Student updateStudent(Student student);
    
    Student getStudentById(String id);
    
    void deleteStudent(String id);
    
    List<Student> searchStudentsByRollNo(String rollNo);
    
    void toggleStudentStatus(String id);
    
    void updateStudentStatus(String id, boolean isActive);
}

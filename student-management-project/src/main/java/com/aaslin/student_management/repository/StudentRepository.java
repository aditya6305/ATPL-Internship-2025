package com.aaslin.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.aaslin.student_management.model.Student;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    
    // Find all active students
    @Query("SELECT s FROM Student s WHERE s.isActive = true")
    List<Student> findAllActiveStudents();
    
    // Find active student by roll number
    @Query("SELECT s FROM Student s WHERE s.rollNo = ?1 AND s.isActive = true")
    Optional<Student> findByRollNo(String rollNo);
    
    // Find active student by roll number and password for login
    @Query("SELECT s FROM Student s WHERE s.rollNo = ?1 AND s.password = ?2 AND s.isActive = true")
    Optional<Student> findByRollNoAndPassword(String rollNo, String password);
    
    
    // Search all students by roll number containing
    @Query("SELECT s FROM Student s WHERE s.rollNo LIKE %?1%")
    List<Student> searchByRollNo(String rollNo);
    // findTopByOrderByRollNoDesc- this query will returns the the last added student rollno.
    Optional<Student> findTopByOrderByRollNoDesc();
}

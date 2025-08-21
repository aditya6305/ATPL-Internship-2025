package com.aaslin.student_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaslin.student_management.model.Student;
import com.aaslin.student_management.model.Admin;
import com.aaslin.student_management.repository.StudentRepository;
import com.aaslin.student_management.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.logging.Level;

@Service
public class StudentServiceImpl implements StudentService {
    
    private static final Logger LOGGER = Logger.getLogger(StudentServiceImpl.class.getName());
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private AdminRepository adminRepository;
    
    @Override
    public Admin loginAdmin(String username, String password) {
        Optional<Admin> admin = adminRepository.findByUsernameAndPassword(username, password);
        return admin.orElse(null);
    }
    
    @Override
    public Student loginStudent(String rollNo, String password) {
        Optional<Student> student = studentRepository.findByRollNoAndPassword(rollNo, password);
        return student.orElse(null);
    }

    @Override
    public Admin getAdminByUsername(String username) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        return admin.orElse(null);
    }

    @Override
    public Student getStudentByRollNo(String rollNo) {
        Optional<Student> student = studentRepository.findByRollNo(rollNo);
        return student.orElse(null);
    }

    @Override
    public List<Student> getAllActiveStudents() {
        return studentRepository.findAllActiveStudents();
    }
    
    @Override
    public Student saveStudent(Student student) {
        LOGGER.log(Level.INFO, "Saving a new student...");
        
        String newRollNo;
        // It gets the rollno from the studentrepository and add 1 to it to create the id and rollno of the next added student.
        Optional<Student> lastStudent = studentRepository.findTopByOrderByRollNoDesc();
        if (lastStudent.isPresent()) {
            try {
                int lastRollNo = Integer.parseInt(lastStudent.get().getRollNo());
                newRollNo = String.format("%03d", lastRollNo + 1);
            } catch (NumberFormatException e) {
                LOGGER.log(Level.SEVERE, "Could not parse roll number ", e);
                newRollNo = "001";
            }
        } else {
            newRollNo = "001";
        }
        
        String newStudentId = "ATPL" + newRollNo;
        
        student.setId(newStudentId);
        student.setRollNo(newRollNo);

        return studentRepository.save(student);
    }
    
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public Student getStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    @Override
    public void deleteStudent(String id) {
        Optional<Student> studentOpt = studentRepository.findById(id);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setActive(false);
            student.setUpdatedBy("admin");
            studentRepository.save(student);
        }
    }
    
    @Override
    public List<Student> searchStudentsByRollNo(String rollNo) {
        return studentRepository.searchByRollNo(rollNo);
    }

    @Override
    public void toggleStudentStatus(String id) {
        Optional<Student> studentOpt = studentRepository.findById(id);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setActive(!student.isActive()); 
            student.setUpdatedBy("admin");
            studentRepository.save(student);
        }
    }
    
    @Override
    public void updateStudentStatus(String id, boolean isActive) {
        Optional<Student> studentOpt = studentRepository.findById(id);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setActive(isActive);
            student.setUpdatedBy("admin");
            studentRepository.save(student);
        }
    }
}

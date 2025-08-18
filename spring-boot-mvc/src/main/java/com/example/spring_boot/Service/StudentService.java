package com.example.spring_boot.Service;

import org.springframework.stereotype.Service;

import com.example.spring_boot.Model.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Aditya", "aditya@gmail.com", 20));
        students.add(new Student(2, "Shyam", "shyam@gmail.com", 22));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void saveStudent(Student student) {
        Student existingStudent = getStudentById(student.getId());
        if (existingStudent == null) {
            students.add(student);
        } else {
            updateStudent(student);
        }
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}

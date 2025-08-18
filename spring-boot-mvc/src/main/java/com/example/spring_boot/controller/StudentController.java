package com.example.spring_boot.controller;

import com.example.spring_boot.Model.Student;
import com.example.spring_boot.Service.StudentService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/add";
    }

    @PostMapping
    public String addStudent(@Valid @ModelAttribute Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "students/add";
        }
        studentService.saveStudent(student);
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    @GetMapping("/{id}")
    public String viewStudent(@PathVariable int id, Model model) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return "error/notfound";
        }
        model.addAttribute("student", student);
        return "students/view";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return "error/notfound";
        }
        model.addAttribute("student", student);
        return "students/edit";
    }

    @PostMapping("/{id}")
    public String updateStudent(@PathVariable int id, @Valid @ModelAttribute Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "students/edit";
        }
        student.setId(id);
        studentService.updateStudent(student);
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    @PostMapping("/{id}/delete")
    public String deleteStudent(@PathVariable int id, Model model) {
        studentService.deleteStudent(id);
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        model.addAttribute("error", "Student not found");
        return "error/notfound";
    }
}

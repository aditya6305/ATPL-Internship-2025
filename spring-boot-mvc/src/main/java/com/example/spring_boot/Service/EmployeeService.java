package com.example.spring_boot.Service;

import org.springframework.stereotype.Service;

import com.example.spring_boot.Model.Employee;

import java.util.*;

@Service
public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public EmployeeService() {
        employees.put(1, new Employee(1, "Aditya", "aditya@email.com", 50000));
        employees.put(2, new Employee(2, "Shyam", "shyam@email.com", 60000));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    public Employee saveEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    public boolean existsById(Integer id) {
        return employees.containsKey(id);
    }
}
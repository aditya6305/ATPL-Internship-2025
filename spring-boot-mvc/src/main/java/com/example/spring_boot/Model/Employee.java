package com.example.spring_boot.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Employee {
    private Integer id;
    
    @NotBlank(message = "Name is required")
    private String name;
    
    @Email(message = "Email is invalid")
    @NotBlank(message = "Email is required")
    private String email;
    
    @Min(value = 1, message = "Salary must be greater than 0")
    private Integer salary;

    public Employee() {}
    
    public Employee(Integer id, String name, String email, Integer salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

    
}
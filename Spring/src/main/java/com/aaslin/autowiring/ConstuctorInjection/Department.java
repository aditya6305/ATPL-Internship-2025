package com.aaslin.autowiring.ConstuctorInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {

	public Employee employee;
	private String deptName;
	
	
	@Autowired 
	public Department(Employee employee) {
		super();
		this.employee = employee;
	}	
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return  employee + ", deptName=" + deptName;
	}
	

	
}

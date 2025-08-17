package com.aaslin.BeanInjections;

public class Department {

	public Employee employee;
	private String deptName;
	
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

package com.aaslin.autowiring.SetterInjection;

public class Employee {

	public String empID;
	public String empName;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	@Override
	public String toString() {
		return "Employee empID=" + empID + ", empName=" + empName ;
	}
	

}

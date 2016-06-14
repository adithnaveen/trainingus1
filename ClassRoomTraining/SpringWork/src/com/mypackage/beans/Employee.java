package com.mypackage.beans;

public class Employee {
	private int empId;
	private Name name;

	
	public Employee(){
		System.out.println("Employee constructor called... ");
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	
	public void init(){
		System.out.println("init of Employee called... ");
	}

	public void destroy(){
		System.out.println("Destroy of Employee called... ");
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
}

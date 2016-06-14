package com.naveen.beans;

public class Employee {
	private Integer empId;
	private String empName;
	private Integer age;
	
	
	
	public Employee(){
		this.empId= 222;
		this.empName="No Name";
		this.age=0;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	


}

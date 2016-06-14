package com.naveen;

public class EmployeeBean {
	private static int count;
	private String empName;

	EmployeeBean() {
		System.out.println("Bean object created ");
	}

	public static int getCount() {
		return ++count;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName + ", " + getCount();
	}

	public void init() {
		System.out.println("init method called ");
	}

	public void destory() {
		System.out.println("Destory method called ");
	}
}

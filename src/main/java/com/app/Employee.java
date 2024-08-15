package com.app;

public class Employee {
	private Integer employeeId;
	private String employeeCode;
	private String employeeName;
	private Integer age;
	private String designation;
	
	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String employeeCode, String employeeName, Integer age, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.age = age;
		this.designation = designation;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeCode=" + employeeCode + ", employeeName="
				+ employeeName + ", age=" + age + ", designation=" + designation + "]";
	}
	
}

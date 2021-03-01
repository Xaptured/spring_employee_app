package com.jagdeesh.spring.employee;

import com.jagdeesh.spring.address.AddressImpl;

public class EmployeeDetails {

	private int empId;
	private String empName;
	private double empSalary;
	private AddressImpl address;

	public EmployeeDetails(AddressImpl address) {
		super();
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public AddressImpl getAddress() {
		return address;
	}

	public void setAddress(AddressImpl address) {
		this.address = address;
	}
}

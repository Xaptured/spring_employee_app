package com.jagdeesh.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails {

	@Value("123")
	private int empId;
	@Value("Jack")
	private String empName;
	@Value("25000")
	private double empSalary;
	@Autowired
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

package com.jagdeesh.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Autowired
	private EmployeeDetails employeeDetails;

	public Manager(EmployeeDetails employeeDetails) {
		super();
		this.employeeDetails = employeeDetails;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Manager Details...");
		System.out.println("Your Name : " + employeeDetails.getEmpName());
		System.out.println("Your Id : " + employeeDetails.getEmpId());
		System.out.println("Your Salary : " + employeeDetails.getEmpSalary());
		System.out.println(employeeDetails.getAddress().showAddress());
	}

}

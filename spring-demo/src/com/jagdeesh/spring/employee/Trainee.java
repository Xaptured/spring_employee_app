package com.jagdeesh.spring.employee;

public class Trainee implements Employee {

	private EmployeeDetails employeeDetails;

	public Trainee(EmployeeDetails employeeDetails) {
		super();
		this.employeeDetails = employeeDetails;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Trainee Details...");
		System.out.println("Your Name : " + employeeDetails.getEmpName());
		System.out.println("Your Id : " + employeeDetails.getEmpId());
		System.out.println("Your Salary : " + employeeDetails.getEmpSalary());
		System.out.println(employeeDetails.getAddress().showAddress());
	}

}

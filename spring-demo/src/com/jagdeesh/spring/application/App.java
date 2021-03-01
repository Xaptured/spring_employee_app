package com.jagdeesh.spring.application;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jagdeesh.spring.employee.Employee;
import com.jagdeesh.spring.employee.Manager;
import com.jagdeesh.spring.employee.EmployeeDetails;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee=null;
		System.out.println("1.Manager\n2.Developer\n3.Trainee");
		int choice = scanner.nextInt();
		scanner.nextLine();
		if(choice==1)
		{
			employee = (Employee)context.getBean("manager");
		}
		else if(choice==2)
		{
			employee = (Employee)context.getBean("developer");	
		}
		else if(choice==3)
		{
			employee = (Employee)context.getBean("trainee");	
		}
		EmployeeDetails employeeDetails = (EmployeeDetails)context.getBean("employeeDetails");
		System.out.printf("Enter Employee Name : ");
		employeeDetails.setEmpName(scanner.nextLine());
		System.out.printf("Enter Employee Id : ");
		employeeDetails.setEmpId(scanner.nextInt());
		System.out.printf("Enter Employee Salary : ");
		employeeDetails.setEmpSalary(scanner.nextDouble());
		scanner.nextLine();
		System.out.printf("Enter Employee House No. : ");
		employeeDetails.getAddress().setHouseNumber(scanner.nextLine());
		System.out.printf("Enter Employee locality : ");
		employeeDetails.getAddress().setLocality(scanner.nextLine());
		System.out.printf("Enter Employee state : ");
		employeeDetails.getAddress().setState(scanner.nextLine());
		System.out.printf("Enter Employee country : ");
		employeeDetails.getAddress().setCountry(scanner.nextLine());
		employee.showInfo();
	}

}

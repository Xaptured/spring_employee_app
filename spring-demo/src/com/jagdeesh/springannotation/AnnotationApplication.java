package com.jagdeesh.springannotation;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee=null;
		System.out.println("1.Manager\n2.Developer\n3.Tester");
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
			employee = (Employee)context.getBean("tester");	
		}
		/*
		EmployeeDetails employeeDetails = (EmployeeDetails) context.getBean("employeeDetails");
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
		*/
		employee.showInfo();
	}

}

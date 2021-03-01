package com.jagdeesh.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jagdeesh.springannotation")
public class AppConfig {

	/*
	@Bean
	public Employee manager()
	{
		return new Manager(employeeDetails());
	}
	@Bean
	public EmployeeDetails employeeDetails()
	{
		return new EmployeeDetails(address());
	}
	@Bean
	public AddressImpl address()
	{
		return new AddressImpl();
	}
	*/
}

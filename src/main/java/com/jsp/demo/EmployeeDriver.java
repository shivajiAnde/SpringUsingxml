package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//		Employee employee = applicationContext.getBean("employee",Employee.class);
//		System.out.println(employee);
		
		Employee employee2 = applicationContext.getBean("employee1",Employee.class);
		System.out.println(employee2);
	}
}

package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("xyz.xml");
		Car car = applicationContext.getBean("car",Car.class);
		System.out.println(car);		
	}
}

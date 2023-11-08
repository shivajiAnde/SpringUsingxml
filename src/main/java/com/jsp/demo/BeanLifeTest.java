package com.jsp.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("xyz.xml");
		  BeanLife bean = applicationContext.getBean("life",BeanLife.class);
		  applicationContext.registerShutdownHook();
		System.out.println(bean);
	}
}

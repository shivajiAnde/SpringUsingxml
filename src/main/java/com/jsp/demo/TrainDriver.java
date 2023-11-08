package com.jsp.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TrainDriver {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Train train = ac.getBean("train",Train.class);
	System.out.println(train);
	
//	using BeanFactory to create Objects 
	ClassPathResource classPathResource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	Train train2 = beanFactory.getBean("train",Train.class);
	System.out.println(train2);
	
// upcasting context
	BeanFactory beanFactory1=new ClassPathXmlApplicationContext("spring.xml");
	Train train3 = beanFactory1.getBean("train",Train.class);
	System.out.println(train3);
	}
}

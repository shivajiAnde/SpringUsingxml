package com.jsp.demo;

public class BeanLife {
	
	static {
		System.out.println("class loading");
	}
	
	{
		System.out.println("instanciation");
	}
	
	public void myInit() {
		System.out.println("initialisation");
	}
	public void myDestroy() {
		System.out.println("object destroyed");
	}
}

package com.jsp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	
	{
		System.out.println("car non-static is executing");
	}
	
	private MusicSystem musicSystem;
}

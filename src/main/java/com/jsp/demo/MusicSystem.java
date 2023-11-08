package com.jsp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicSystem {
	
	{
		System.out.println("MusicSystem non-static block is executing");
	}
	
	private String brand;
}

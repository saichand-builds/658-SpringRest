package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller("MyDB")
public class MyDBConnection {
	
	//@Value this Annotation is used to provide data to our variables in our class
		
	@Value("Postgresql Driver")
	private String Driver;
	
	@Value("Jdbc:postgresql")
	private String Url;
	
	public void showData() {
		
		System.out.println("Data is  -> "+Driver +" and" + Url);
	}
	

}

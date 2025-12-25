package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyDBConnection;

@SpringBootApplication
public class SpringBootValueAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext ac=SpringApplication.run(SpringBootValueAnnotationApplication.class, args);
	
	MyDBConnection DB=ac.getBean("MyDB", MyDBConnection.class);
	DB.showData();
	}

}

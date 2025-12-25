package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyDBConnection;

@SpringBootApplication
public class SpringBootValueAnnotation2Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootValueAnnotation2Application.class, args);

		MyDBConnection DB = ac.getBean("MyDb", MyDBConnection.class);

		DB.DBMessage();

	}

}

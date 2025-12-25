package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyMessage;


@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBoot1Application.class, args);
		ApplicationContext ac = SpringApplication.run(SpringBoot1Application.class, args);
		MyMessage mob = ac.getBean("Msg", MyMessage.class);

		mob.message();
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.Product;

@SpringBootApplication
public class SpringBootAutowiredApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootAutowiredApplication.class, args);

		Product pd = ac.getBean("Prod", Product.class);
		pd.getProduct();

	}

}

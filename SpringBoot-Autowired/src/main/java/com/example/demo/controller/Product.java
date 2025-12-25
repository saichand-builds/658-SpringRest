package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Prod")
public class Product {

	private Integer Id;

	@Value("Apple")
	private String ProdName;
	@Value("78437358.4")
	private Double ProdPrice;
	
	@Autowired
	private Model model;
	
	
	public void getProduct() {
		System.out.println("Product Name is "+ProdName+  "  "+ProdPrice);
		model.getModel();
		
	}

}

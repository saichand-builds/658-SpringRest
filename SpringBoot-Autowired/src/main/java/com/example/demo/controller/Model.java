package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component("Model")
public class Model {

	private Integer Id;

	@org.springframework.beans.factory.annotation.Value("Saichand")
	private String Name;

	@org.springframework.beans.factory.annotation.Value("23")
	private String Value;

	public void getModel() {

		System.out.println("Name  is   " + Name + " - " + Value);

	}

}

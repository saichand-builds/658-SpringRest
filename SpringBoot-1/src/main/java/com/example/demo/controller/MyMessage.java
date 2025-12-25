package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller("Msg")
public class MyMessage {
	
	public void message () {
		
		System.out.println("Welcome to the Message");
	}

}

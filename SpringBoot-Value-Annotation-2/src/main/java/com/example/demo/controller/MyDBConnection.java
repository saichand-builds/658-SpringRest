package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller("	")
public class MyDBConnection {

	@Value("${Db.Name}")
	private String DbName;

	@Value("${DB.Url}")
	private String DBUrl;

	public void DBMessage() {

		System.out.println("DB Message  Properties file" + DbName + " --" + DBUrl);
		System.out.println("DB Acces");

	}
}

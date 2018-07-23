package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
///@Controller

public class MyserviceApplication {
	/*
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "PAF test project...";
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(MyserviceApplication.class, args);
	}
}

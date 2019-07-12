package com.demisco.fod4;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Configuration

@ComponentScan
@Controller

public class Fod4Application {

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot App";
	}
	public static void main(String[] args) {
		SpringApplication.run(Fod4Application.class, args);
	}
}

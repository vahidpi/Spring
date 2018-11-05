package com.techprimers.kafka.springbootkafkaproducerexample;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.stereotype.Component;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan

public class SpringBootKafkaProducerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);
	}
}

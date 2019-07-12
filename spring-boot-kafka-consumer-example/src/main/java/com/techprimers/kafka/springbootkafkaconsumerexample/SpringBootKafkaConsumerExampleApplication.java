package com.techprimers.kafka.springbootkafkaconsumerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class SpringBootKafkaConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerExampleApplication.class, args);
	}
}

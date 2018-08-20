package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @SpringBootApplication
// Same with
@Configuration
@EnableAutoConfiguration
@ComponentScan({"demo","controller"})
//@Controller
public class VpTest1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(VpTest1Application.class, args);
	}
}

package mainpkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"mainpkg","controllers","domain"})
public class Crud2Application {

	public static void main(String[] args) {
		SpringApplication.run(Crud2Application.class, args);
	}
}

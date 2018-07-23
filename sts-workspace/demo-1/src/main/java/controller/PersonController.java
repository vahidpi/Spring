package controller;


import model.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class PersonController {
	@RequestMapping("/person")
	public String person(Model model) {
		Person p=new Person();
		p.setFirstName("Joe");
		p.setLastName("Clarke");
		p.setAge(30);
		model.addAttribute("person", p);
		return "personview";
	}
	
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot App";
	}
	
}

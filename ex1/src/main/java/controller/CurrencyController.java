package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@RequestMapping("/balance")
	public String calculateBalance(@RequestParam String username) {
		String output=username.substring(0, 1);
		return output;
	}
}

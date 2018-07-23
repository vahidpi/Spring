package controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.Balance;

@RestController
@RequestMapping("/myservice1")
public class BalanceController {

	
	@RequestMapping("/balance")
	public Balance calculateBalaaOut(@RequestParam String id,@RequestParam String username) {
		Balance b = new Balance(id,username);		
		return b;
	}
}

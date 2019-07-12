package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.Balance;
import service.BalanceService;

@RestController
@RequestMapping("/balances")
public class BalanceController {
	@Autowired
	BalanceService bs;
	/***
	@RequestMapping("/all")
	public Hashtable<String, Balance> getAll(){
		return bs.getAll();
	}
	
	@RequestMapping("{id}")
	public Balance getBalance(@PathVariable("id") String id) {
		return bs.getBalance(id);
	}
	
	@RequestMapping("/balan")
	public String calculateBalance(@RequestParam String id,@RequestParam String username) {
		String output=username.substring(0, 1)+" - "+id;
		return output;
	}
	
	
	@RequestMapping("/bala")
	public Hashtable<String, Balance> calculateBalanceOut(@RequestParam String id,@RequestParam String username) {
		
		Hashtable<String, Balance> balances = new Hashtable<String, Balance>();
		Balance b = new Balance();
		b.setId(id);
		b.setUserName(username);
		b.setBalance(Integer.toString(Integer.parseInt(id)*Integer.parseInt(id)));
		b.setCurrency(username.substring(0, 1));
		balances.put("1",b);
		
		//String output=username.substring(0, 1)+" - "+id;
		return balances;
	}
	***/
	@RequestMapping("/balaa")
	public Balance calculateBalaaOut(@RequestParam String id,@RequestParam String username) {
		
		
		Balance b = new Balance(id,username);
		///b.setId(id);
		///b.setUserName(username);
		///b.setBalance(Integer.toString(Integer.parseInt(id)*Integer.parseInt(id)));
		///b.setCurrency(username.substring(0, 1));
		
		
		//String output=username.substring(0, 1)+" - "+id;
		return b;
	}
}

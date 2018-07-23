package service;


import org.springframework.stereotype.Service;
//import model.Balance;

@Service

public class BalanceService {
	/***
	Hashtable<String, Balance> balances = new Hashtable<String, Balance>();
	public BalanceService() {
		
		
		Balance b = new Balance();
		b.setId("1");
		b.setUserName("Steve");
		b.setBalance("S");
		b.setCurrency("11");
		balances.put("1",b);
		
		/*
		 * Balance b = new Balance();
		b.setBalance(id);
		b.setUserName(uname);
		b.setCurrency(uname);
		b.setId(id);
		balances.put("1",b);
		 * */
		
	/***
		b = new Balance();
		b.setId("2");
		b.setUserName("Steve");
		b.setBalance("S");
		b.setCurrency("22");
		balances.put("2",b);
	}
	
	public Balance getBalance(String id) {
		if(balances.containsKey(id))
			return balances.get(id);
		else
			return null;
	}
	public Hashtable<String, Balance> getAll(){
		return balances;
	}
	
	///public Balance getBala(){
		//return b;
	///}
	 ***/ 
	 
	 
}

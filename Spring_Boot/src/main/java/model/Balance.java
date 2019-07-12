package model;

public class Balance {
	//String id;
	//String userName;
	String balance; // Balance = id * id
	String currency; // Currency = 1st character of the user name
	
	public Balance(String uid, String uname){
			//this.id=uid;
			//this.userName=uname;
			this.balance=Integer.toString(Integer.parseInt(uid)*Integer.parseInt(uid));
			this.currency=uname.substring(0, 1);		
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}

package model;

/*
 *
int id;
	String userName;
	int balance; // Balance = id * id
	String currency; // Currency = 1st character of the user name
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int id) {
		this.balance = id*id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String userName) {
		this.currency = userName.substring(0, 1);
	}
 
 * */


public class Balance {
	String id;
	String userName;
	String balance; // Balance = id * id
	String currency; // Currency = 1st character of the user name
	
	
	
	 public Balance(String uid, String uname){
		this.id=uid;
		this.userName=uname;
		this.balance=Integer.toString(Integer.parseInt(uid)*Integer.parseInt(uid));
		this.currency=uname.substring(0, 1);
		
	}
	 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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

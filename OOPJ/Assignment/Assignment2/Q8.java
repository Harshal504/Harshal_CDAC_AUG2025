//Bank Account Initialization
//Scenario: A bank wants to initialize the interest rate for all accounts once when the system starts. Each account has account holder name, balance, and interest rate. Students should practice static blocks for initialization and setters/getters to modify and access account details.
//Tasks:
//1. Create a BankAccount class.
//2. Use a static block to initialize interest rate to 4%.
//3. Create instance variables: name (String) and balance (double).
//4. Create setters and getters for name and balance.
//5. Print account details including interest rate.
import java.util.*;

class BankAccount{
	String name;
	double balance;
	static float roi;
	static{
		roi = 4;
	}
	
	BankAccount(){
		
	}
	
	void setname(String name){
		this.name=name;
	}
	void setbalance(double balance){
		this.balance = balance;
	}
	
	String getname(){
		return name;
	}
	double getbalance(){
		return balance;
	}
	
	
	
	
}

class Q8{
	public static void main(String args[]){
		
		BankAccount b1= new BankAccount();
		b1.setname("Harshal");
		b1.setbalance(1550000);
		
		BankAccount b2 = new BankAccount();
		b2.setname("Rohit");
		b2.setbalance(2098000);
		
		System.out.println("Account name: "+b1.getname()+" Balance: "+b1.getbalance()+" Interest rate: "+b1.roi+"%");
		System.out.println("Account name: "+b2.getname()+" Balance: "+b2.getbalance()+" Interest rate: "+b2.roi+"%");

	}
}
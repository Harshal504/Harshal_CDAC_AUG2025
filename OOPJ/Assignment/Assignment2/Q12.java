//Bank Account Basic Info
//Scenario: Create BankAccount class with accountHolder and balance.
//● Use parameterized constructor to initialize account.
//● Create getter and setter for balance.
//● In main, create one account and display details.
import java.util.*;

class BankAccount{
	String accountHolder;
	float balance=0;
	
	BankAccount(String accountHolder, float balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	void setbalance(float balance){
		this.balance = balance;
	}
	
	float getbalance(){
		return balance;
	}
	

	
}

class Q12{
	public static void main(String args[]){
		BankAccount ba= new BankAccount("Harshal Tarmale", 15000);
		System.out.println("Account Holder: "+ba.accountHolder+" Bank Balance: "+ba.getbalance());
		
		ba.setbalance(100000);
		System.out.println("Account Holder: "+ba.accountHolder+" Bank Balance: "+ba.getbalance());
		
		
		

	}
}
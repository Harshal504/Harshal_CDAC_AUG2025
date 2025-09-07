//Bank Account Protection
//Scenario: You are creating a simple banking system. A user should not be able to directly change their balance.
//Problem Statement: Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
//Class/Fields:
//● private double balance
//Methods:
//● deposit(double amount) → add to balance
//● withdraw(double amount) → subtract from balance if sufficient
//● getBalance() → returns current balance
import java.util.*;

class BankAccount{
	private double balance;
	
	BankAccount(){
		this.balance = 0;
	}
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	void deposit(double amount){
		
		balance += amount;
		System.out.println("Balance after depositing "+amount+": "+ balance);
		
	}
	
	void withdraw(double amount){
		if(amount<=balance){
			balance -= amount;
			System.out.println("Balance after withdrawing "+amount+": "+balance);
		}else{
			System.out.println(" Not enough Balance ");
		}
			
	}
	
	double getBalance(){
		return balance;
	}
}




class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		ba.deposit(20000);
		
		ba.withdraw(8000);

		ba.withdraw(13000);

		System.out.println("Current Balance: "+ba.getBalance());
		
	}
}
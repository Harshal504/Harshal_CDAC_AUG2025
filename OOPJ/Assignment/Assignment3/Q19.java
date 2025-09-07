//Bank Account Types
//Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account details, but Savings accounts have interest and Current accounts have overdraft limit.
//Problem Statement: Create a superclass BankAccount with:
//● Fields: accountNumber, accountHolder, balance
//● Method: displayBalance()
//Create subclasses:
//● SavingsAccount → field: interestRate, method: calculateInterest()
//● CurrentAccount → field: overdraftLimit, method: checkOverdraft()
//Sample Input: SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5% CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000
//Sample Output: Ramesh → Balance=5000, Interest=250 Anita → Balance=2000, Overdraft Limit=1000


import java.util.*;

abstract class Account{
	protected int accountNo;
	protected double balance;
	
	Account(int accountNo, double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	abstract void getDetails();

}

class SavingAccount extends Account{
	private double interestRate;
	
	SavingAccount(int accountNo, double balance, double interestRate){
		super(accountNo,balance);
		this.interestRate=interestRate;
		}
	
	void setROI(double interestRate){
		this.interestRate=interestRate;
	}
	@Override
	void getDetails(){
		System.out.println("Saving → "+accountNo+", Balance="+balance+", Interest="+(balance*interestRate/100));
	}
	
}


class CurrentAccount extends Account{
	private double overdraftLimit;
	CurrentAccount(int accountNo, double balance, double overdraftLimit){
		super(accountNo,balance);
		this.overdraftLimit=overdraftLimit;
		}	
	void setODL(double overdraftLimit){
		this.overdraftLimit=overdraftLimit;
	}
	@Override
	void getDetails(){
		System.out.println("Current → "+accountNo+", Balance="+balance+", Overdraft="+overdraftLimit);
	}
	
}



class Q19{
	public static void main(String[] args){
		
		Account a1 =new SavingAccount(101, 50000, 5);
		Account a2 = new CurrentAccount(102, 20000, 2000);
		
		a1.getDetails();
		a2.getDetails();

		

	}
}
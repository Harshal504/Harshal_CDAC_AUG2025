//Bank Account Types
//Scenario: Bank provides different account types. Problem Statement: Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass CurrentAccount → overdraftLimit. Display account details.
//Classes/Fields:
//● Account → accountNo, balance
//● SavingAccount → interestRate
//● CurrentAccount → overdraftLimit
//Sample Input: Saving → accountNo=101, balance=5000, interestRate=5% Current → accountNo=102, balance=10000, overdraftLimit=2000
//Sample Output: Saving → 101, Balance=5000, Interest=5% Current → 102, Balance=10000, Overdraft=2000


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
		System.out.println("Saving → "+accountNo+", Balance="+balance+", Interest="+interestRate+"%");
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



class Q11{
	public static void main(String[] args){
		
		Account a1 =new SavingAccount(101, 50000, 5);
		Account a2 = new CurrentAccount(102, 20000, 2000);
		
		a1.getDetails();
		a2.getDetails();

		

	}
}
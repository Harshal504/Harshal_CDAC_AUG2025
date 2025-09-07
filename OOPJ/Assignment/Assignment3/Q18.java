//Payment Process
//Scenario: Company wants to process payments differently depending on mode of payment, but handle all payments through a single reference.
//Problem Statement: Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment implement pay().
//Usage:
//● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
//● Call p.pay() for runtime polymorphic behavior
//Sample Input: Credit Card → cardNumber=1234567890123456, amount=5000 UPI → upiId=rahul@upi, amount=2000
//Sample Output: Payment via Credit Card 1234567890123456 → Rs. 5000 Paid Payment via UPI rahul@upi → Rs. 2000 Paid


import java.util.*;

abstract class Payment{
	
	abstract void pay();

}

class CreditCardPayment extends Payment{
	private long cardNumber;
	private double amount;
	
	CreditCardPayment(long cardNumber, double amount){
		this.cardNumber=cardNumber;
		this.amount=amount;
	}
	@Override
	void pay(){
		System.out.println("Payment via Credit Card "+cardNumber+"→ Rs. "+amount+" Paid");
	}
	
}

class UPIPayment extends Payment{
	private String upiId;
	private double amount;
	UPIPayment(String upiId, double amount){
		this.upiId=upiId;
		this.amount=amount;
	}
	
	void pay(){
		System.out.println("Payment via UPI "+upiId+" → Rs. "+amount+" Paid");
	}

}
class Q18{
	public static void main(String[] args){
		
		Payment p1 = new CreditCardPayment(1234567890123456L, 5000);
		Payment p2 = new UPIPayment("abc@ybl", 4000);
		
		p1.pay();
		p2.pay();
		

	}
}
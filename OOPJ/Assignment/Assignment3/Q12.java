//Payment System
//Scenario: A company accepts different payment modes. Problem Statement: Create an abstract class Payment with abstract method pay(). Create subclasses CreditCardPayment and UPIPayment that implement pay().
//Classes/Fields:
//● Payment → pay() (abstract)
//● CreditCardPayment → cardNumber, amount
//● UPIPayment → upiId, amount
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
class Q12{
	public static void main(String[] args){
		
		Payment p1 = new CreditCardPayment(1234567890123456L, 5000);
		Payment p2 = new UPIPayment("abc@ybl", 4000);
		
		p1.pay();
		p2.pay();
		

	}
}
//Payment Gateway
//Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All payments must implement a pay() method.
//Problem Statement:
//● Create an interface Payment → method pay(double amount)
//● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay() implementation
//● In main(), take payment amount and process payment using both methods
//Sample Input: CreditCardPayment → amount=2500 PayPalPayment → amount=1500
//Sample Output: Processing Credit Card Payment of 2500 Processing PayPal Payment of 1500


import java.util.*;

interface Payment{
	
 	public void pay(double amount);

}

class CreditCardPayment implements Payment{
	private long cardNumber;
//	private double amount;
	
	CreditCardPayment(long cardNumber){
		this.cardNumber=cardNumber;

	}

	public void pay(double amount){
		System.out.println("Payment via Credit Card "+cardNumber+"→ Rs. "+amount+" Paid");
	}
	
}

class UPIPayment implements Payment{
	private String upiId;
//	private double amount;
	UPIPayment(String upiId){
		this.upiId=upiId;
//		this.amount=amount;
	}
	
	public void pay(double amount){
		System.out.println("Payment via UPI "+upiId+" → Rs. "+amount+" Paid");
	}

}
class Q24{
	public static void main(String[] args){
		
		Payment p1 = new CreditCardPayment(1234567890123456L);
		Payment p2 = new UPIPayment("abc@ybl");
		
		p1.pay(50000D);
		p2.pay(32000D);
		

	}
}
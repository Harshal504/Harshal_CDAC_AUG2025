//Indian Movie Ticket Booking
//Scenario: A cinema hall offers Normal and Premium tickets. A customer can book just name or name with ticket type. Keep track of total tickets sold using a static counter.
//Tasks:
//1. Create a Customer class.
//2. Implement two constructors:
//Constructor 1 → Customer(String name)
//Constructor 2 → Customer(String name, String ticketType)
//3. Static counter to track tickets sold.
//4. Print customer details and total tickets sold.
import java.util.*;

class Customer{
	String name;
	String ticketType = "Silver";
	static int ttsold = 0;
	
	Customer(String name){
		this.name = name;
		ttsold++;
	}
	
	Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		ttsold++;
	}
	
	static void Totalsold(){
		System.out.println("Total ticket sold:" + ttsold);
	}
	
	
	
}

class Q7{
	public static void main(String args[]){
		
		Customer c1 = new Customer("Harshal");
		;
		System.out.println("Custome1: Name: "+c1.name+" Ticket type:"+c1.ticketType);
		
		Customer c2 = new Customer("Rohit", "Gold");
		System.out.println("Custome2: Name: "+c2.name+" Ticket type:"+c2.ticketType);
				
		
		Customer c3 = new Customer("amar", "platinium");
		System.out.println("Custome3: Name: "+c3.name+" Ticket type:"+c3.ticketType);
		
		Customer.Totalsold();


	}
}
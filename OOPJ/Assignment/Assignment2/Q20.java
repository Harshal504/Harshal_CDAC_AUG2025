//Ticket Booking System
//Question: Create a class Ticket with:
//● passengerName (instance)
//● ticketNo (instance, auto-generated using a static counter starting from 5001)
//● Constructor to accept passengerName
//● Method displayTicket() to show ticket details
import java.util.*;
class Ticket{
	String passengerName;
	int ticketNo;
	static int counter = 5001;
	
	Ticket(String passengerName){
		this.passengerName=passengerName;
		this.ticketNo = counter;
		counter++;
	}
	
	void displayTicket(){
		System.out.println("Ticket No: "+ticketNo+" Passenger Name: "+passengerName);
	}
}


class Q20{
	public static void main(String args[]){
		
		Ticket t1 = new Ticket("Harshal");
		Ticket t2 = new Ticket("Rohit");
		Ticket t3 = new Ticket("Milan");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();

		
		
		
}
}
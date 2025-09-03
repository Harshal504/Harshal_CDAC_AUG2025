//Indian Railway Ticket Booking
//Scenario: You are building a mini ticket booking system. A passenger can book a ticket either by giving name and age or name, age, and seat type. The system should also count the total tickets booked using a static counter.
//Tasks:
//1. Create a Passenger class.
//2. Implement two constructors (constructor overloading):
//Constructor 1 → Passenger(String name, int age)
//Constructor 2 → Passenger(String name, int age, String seatType)
//3. Use a static counter to keep track of total passengers booked.
//4. Print passenger details and total passengers.
import java.util.*;

class Passenger{
	String name;
	int age;
	String seatType = "General";
	static int totalpassengers = 0;

	Passenger(String name, int age){
		this.name = name;
		this.age = age;
		totalpassengers++;
	}
	
	Passenger(String name, int age, String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalpassengers++;
	}
	
	static void TotalPassengers(){
		System.out.println("Total Passengers: "+ totalpassengers);
	}

	
}

class Q6{
	public static void main(String args[]){
		
		Passenger p1 = new Passenger("Harshal", 27);
		System.out.println(p1.name+" "+ p1.age+" "+ p1.seatType);
		
		Passenger p = new Passenger("vilas", 60, "Lower berth");
		System.out.println(p.name+" "+ p.age+" "+ p.seatType);	
		
		Passenger p2 = new Passenger("Rohit", 23);
		System.out.println(p2.name+" "+ p2.age+" "+ p2.seatType);		
		
		Passenger p3 = new Passenger("Milan", 55, "Lower berth");
		System.out.println(p3.name+" "+ p3.age+" "+ p3.seatType);		
		
		Passenger.TotalPassengers();



	}
}
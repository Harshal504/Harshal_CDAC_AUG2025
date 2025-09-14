//Problem 22: Ticket Booking Queue
//Use Case: Manage customer service in a ticket booking system.
//Requirements:
//● Queue customers for service
//● Serve customers in FIFO order
//● Display current queue status
//Sample Input:
//Queue: "Amit", "Priya", "Rohan"
//Serve: 1 customer
//Expected Output:
//Serving: Amit, Queue: Priya, Rohan

import java.util.*;
import java.util.Map.Entry;


class Q22{
	
	static void serve(Queue<String> customers){
		System.out.println("Serving: "+ customers.poll());
		System.out.print("Queue: ");
		for(String s : customers){
			System.out.print(s+ " ");
		}
	}
	


	public static void main(String[] args){
		
		Queue<String> customers = new ArrayDeque<>();
		
		customers.offer("Amit");
		customers.offer("Priya");
		customers.offer("Rohan");
		
		
		Q22.serve(customers);
		
	
	}

}
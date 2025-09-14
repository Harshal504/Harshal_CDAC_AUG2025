//Problem 8: Payment Processing
//Scenario: A payment gateway system processes transactions and needs to clean up database connections (just a scenario, database knowledge not required) regardless of whether the payment succeeds or fails.
//Task: Create a payment processing method that uses finally block for cleanup operations.
//Sample Input: (No input required)
//Expected Output:
//Exception occurred: Payment failed
//Cleanup done


import java.io.*;
import java.util.*;

class Payfailed extends Exception{
	Payfailed(String transactionNo){
		super(transactionNo+" Exception occurred: Payment failed");
	}
}

class Q8{
	
	static void payprocess(String transactionNo, int Amount, int paid){
		try{
			if(paid<Amount){
				throw new Payfailed(transactionNo);
			}
			System.out.println(transactionNo+" Payment Done");
		}catch(Payfailed e){
			System.out.println(e.getMessage());
		}finally{
				System.out.println("Cleanup done");
		}
	}
		
	

	public static void main(String[] args) throws Payfailed{
		payprocess("t1", 2000, 3000);
		payprocess("t2", 2000, 1000);
		

	}
}


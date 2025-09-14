//Problem 23: Employee Age Management
//Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int values to Integer objects for database storage and collection operations.
//Task: Demonstrate autoboxing by converting primitive int to Integer object.
//Sample Input:
//30
//Expected Output:
//Integer object: 30


import java.io.*;
import java.util.*;



class Q23{	
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		System.out.println("Int value: "+ i);
		Integer ii =Integer.valueOf(i);// Boxing
		
		Integer ai = i; //Autoboxing
		
		System.out.println("Integer object: "+ai +" "+ai.getClass().getName());
		
		

	}
}


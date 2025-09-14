//Problem 26: Salary Storage
//Scenario: A financial system needs to convert primitive double salary values to Double objects for storage in collections and database operations.
//Task: Use valueOf method to convert primitives to wrapper objects.
//Sample Input:
//45000.5
//Expected Output:
//Double object: 45000.5


import java.io.*;
import java.util.*;



class Q26{	
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		
		Double dd = Double.valueOf(d);//Boxing
		
	
		System.out.println("Double object "+dd+" "+dd.getClass().getName());
		

	}
}


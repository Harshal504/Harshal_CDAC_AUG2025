//Problem 20: Bank Account Security
//Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be changed for security and audit purposes.
//Task: Demonstrate the use of final variables in a banking context.
//Sample Input:
//Account ID: 101
//Expected Output:
//Account ID = 101 (cannot be changed)


import java.io.*;
import java.util.*;

class Finalvarchange extends Exception{
	Finalvarchange(int i){
		super("Account Id = "+i+" (cannot be changed)");
	}
}

class Q20{	
	
		
	public static void main(String[] args) throws Finalvarchange{
		Scanner sc = new Scanner(System.in);
		
		final int i = sc.nextInt();
		try{
//			i=103;
			throw new Finalvarchange(i);
		}catch(Finalvarchange e){
			System.out.println(e.getMessage());
		}
		
//		System.out.println("Account ID = "+i);
		

	}
}


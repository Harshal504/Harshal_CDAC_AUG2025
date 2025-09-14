//Problem 24: Salary Calculation
//Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs primitive int values for mathematical calculations.
//Task: Demonstrate unboxing by extracting primitive values from wrapper objects.
//Sample Input:
//25
//Expected Output:
//int value: 25


import java.io.*;
import java.util.*;



class Q24{	
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer ai = sc.nextInt();
		System.out.println("Integer object: "+ai +" "+ai.getClass().getName());
		
		int i = ai.intValue();//unboxing
		System.out.println("Int Value" +i);

		
		int ii = ai;//Autounboxing
		System.out.println("unboxing Int Value" +ii);
		

	}
}


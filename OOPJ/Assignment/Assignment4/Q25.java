//Problem 25: Payment Processing
//Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to convert them to integers for financial calculations.
//Task: Parse string input to integer and perform calculations.
//Sample Input:
//Amount as string: 1000
//Additional amount to add: 500
//Expected Output:
//1000 + 500 = 1500


import java.io.*;
import java.util.*;



class Q25{	
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		int i = Integer.valueOf(s);
		
	
		System.out.println(i+"+"+n+"="+(i+n));
		

	}
}


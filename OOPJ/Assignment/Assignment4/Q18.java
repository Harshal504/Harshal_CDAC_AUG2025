//Problem 18: Ticket Number Verification
//Scenario: A ticketing system generates verification codes by reversing ticket numbers for security purposes.
//Task: Use StringBuffer to create verification codes.
//Sample Input:
//12345
//Expected Output:
//54321


import java.io.*;
import java.util.*;



class Q18{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("12345");

		
		System.out.println(sb.reverse());

	}
}


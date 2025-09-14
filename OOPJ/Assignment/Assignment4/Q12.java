//Problem 12: Remove Extra Text
//Scenario: An automated message system sometimes adds extra text that needs to be removed before sending messages to students.
//Task: Use StringBuilder to clean up message content.
//Sample Input:
//Original Text: Please read - Do not disturb
//Exact substring to delete: - Do not disturb
//Expected Output:
//Please read


import java.io.*;
import java.util.*;



class Q12{	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Please read - Do not disturb");
		int end = sb.indexOf("- Do not disturb");
		
//		sb.substring(0,end);
		System.out.println(sb.substring(0,end));

	}
}


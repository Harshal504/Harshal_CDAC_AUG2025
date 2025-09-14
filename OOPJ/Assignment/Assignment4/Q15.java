//Problem 15: Meeting Notification
//Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time and location details to basic meeting announcements.
//Task: Use StringBuffer to create detailed meeting notifications.
//Sample Input:
//Base text: Meeting:
//Text to append: Friday at 5 PM
//Expected Output:
//Meeting: Friday at 5 PM


import java.io.*;
import java.util.*;



class Q15{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Meeting:");
//		String s = sc.nextLine();
//		sb.insert(7,s+" ");
		
		
		sb.append(" "+"Friday at 5 PM");
		
		System.out.println(sb);

	}
}


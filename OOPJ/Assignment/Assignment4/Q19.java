//Problem 19: Message Update System
//Scenario: A communication system needs to update message status from "Old Notice" to "Updated Notice" when information is refreshed.
//Task: Use StringBuffer to update message status.
//Sample Input:
//Original text: Old Notice
//Text to find: Old
//Replacement text: Updated
//Expected Output:
//Updated Notice


import java.io.*;
import java.util.*;



class Q19{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("Old Notice");
		
		int start = sb.indexOf("Old");
//		System.out.println(start);
		int end = start + "Old".length();
		
		sb.replace(start, end, "Updated");
		
		System.out.println(sb);

	}
}


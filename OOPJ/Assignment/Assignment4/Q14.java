//Problem 14: Report Title
//Scenario: A report generation system needs to modify document titles by adding department names and updating formatting.
//Task: Use StringBuilder method chaining to efficiently modify report titles.
//Sample Input:
//Original title: Annual Report
//Department Name: CDAC
//Expected Output:
//Annual CDAC Report


import java.io.*;
import java.util.*;



class Q14{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Annual Report");
		String s = sc.nextLine();
		sb.insert(7,s+" ");
		System.out.println(sb);

	}
}


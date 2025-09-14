//Problem 13: Order Number Display
//Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order for verification purposes.
//Task: Use StringBuilder to reverse order numbers.
//Sample Input:
//INV2025
//Expected Output:
//5202VNI


import java.io.*;
import java.util.*;



class Q13{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s=sc.nextLine();
		sb.append(s);
		System.out.println(sb.reverse());


	}
}


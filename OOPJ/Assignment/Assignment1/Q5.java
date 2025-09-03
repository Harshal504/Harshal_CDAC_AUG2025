//Square or Rectangle Garden
//Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a square garden or rectangular.

import java.util.*;


class Q5{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length ");
		int l = sc.nextInt();
		System.out.println("Enter Breadth ");
		int b = sc.nextInt();
		
		System.out.println( l == b ? "Square Garden" : "Rectangle Garden");
	}


}
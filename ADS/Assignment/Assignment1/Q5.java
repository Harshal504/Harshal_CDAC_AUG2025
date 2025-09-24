//Find GCD
//Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two
//numbers.
//Test Cases:
//Input: a = 54, b = 24
//Output: 6
//Input: a = 17, b = 13
//Output: 1

import java.util.*;
import java.lang.Math.*;




class Q5{
	
	public static int gcd(int a, int b){
		if(a==0) return b;
		if(b==0) return a;
		
		return gcd(b, a%b);
		
	}


		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Q5.gcd(a,b));

	}

}



////By iteration Method
//class Q5{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//
//		
//		
//	}
//
//}
//Fibonacci Series
//Problem: Write a Java program to print the first n numbers in the Fibonacci series.
//Test Cases:
//Input: n = 5
//Output: [0, 1, 1, 2, 3]
//Input: n = 8
//Output: [0, 1, 1, 2, 3, 5, 8, 13]

import java.util.*;
import java.lang.Math.*;




class Q4{
	
	public static void fib(int n, int a, int b){
	if(n==0) return;
	int c = a+b;
	System.out.print(c + " ");
	fib(n-1, b, c);
	
	}

		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n>=0) System.out.print(0+ " ");
		if(n>=1) System.out.print(1+ " ");
		
		fib(n-2, 0,1);
	}

}



////By iteration Method
//class Q4{
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
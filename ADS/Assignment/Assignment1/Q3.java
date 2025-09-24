//Factorial
//Problem: Write a Java program to compute the factorial of a given number.
//Test Cases:
//Input: 5
//Output: 120
//Input: 0
//Output: 1

import java.util.*;
import java.lang.Math.*;




class Q3{
	
	public static int fact(int n){
		if(n==0){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}

		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println(Q3.fact(n));

	}

}



////By iteration Method
//class Q3{
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
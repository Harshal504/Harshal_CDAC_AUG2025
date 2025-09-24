//Prime Number
//Problem: Write a Java program to check if a given number is prime.
//Test Cases:
//Input: 29
//Output: true
//Input: 15
//Output: false

import java.util.*;
import java.lang.Math.*;




class Q2{

	public static boolean isPrime(int n, int div){
		if (n <= 1) return false;
		if(div>n/2){
			return true;
		}else if(n%div==0){
			return false;
		}else{
			return isPrime(n, ++div);
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println(Q2.isPrime(n, 2));

	}

}



////By iteration Method
//class Q2{
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
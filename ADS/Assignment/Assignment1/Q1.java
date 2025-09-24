//1. Armstrong Number
//Problem: Write a Java program to check if a given number is an Armstrong
//number.
//Test Cases:
//Input: 153
//Output: true
//Input: 123
//Output: false

import java.util.*;
import java.lang.Math.*;




class Q1{

//	public static int arm(int n, int power, int sum){
//		if(n==0){
//			return sum;
//		}else{
//			sum += Math.pow(n%10, power);
//			n /=10;
//			return Q1.arm(n,power,sum);
//			
//		}
//		
//
//	}


	public static int arm(int n, int power){
		if(n==0){
			return 0;
		}else{
			return (int)Math.pow(n%10,power) + arm(n/10, power);
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int power = String.valueOf(n).length();
//		int sum = 0;
//		System.out.println(Q1.arm(n,power,sum) == n);
//		System.out.println(Q1.arm(n,power,sum));
//		System.out.println(n);
//		
		System.out.println(Q1.arm(n,power) == n);
	}

}



////By iteration Method
//class Q1{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		
//		int power = String.valueOf(n).length();
//		
//		int temp = n;
//		int sum = 0;
//		while(temp>0){
//			sum += Math.pow(temp%10, power);
//			
//			temp /= 10;
//		}
//		
//			System.out.println(n==sum);
//		
//		
//	}
//
//}
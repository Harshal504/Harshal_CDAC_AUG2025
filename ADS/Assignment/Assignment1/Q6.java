//Find Square Root
//Problem: Write a Java program to find the square root of a given number (using
//integer approximation).
//Test Cases:
//Input: x = 16
//Output: 4
//Input: x = 27
//Output: 5

import java.util.*;
import java.lang.Math.*;




//class Q6{
//	
//	public static int sqrt(int n, int t){
//		if(n==1){
//			return 1;
//		}else{
//			if(n-(t*t)<t){
//				System.out.println()
//			}
//		}
//	}
//
//
//		
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int n = sc.nextInt();
//		
//		Q6.sqrt(n, n/2);
//
//	}
//
//}



//By iteration Method
class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for(int i = n/2; i>1; i--){
			if(i*i == n){
				System.out.println(i);
				break;
			}
		}
		
	}

}
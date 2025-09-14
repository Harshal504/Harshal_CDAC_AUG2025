//Palindrome number

import java.util.Scanner;
import java.lang.Math;

class Q13{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int temp = num;
		 String reverse="";
		
		while(temp>0){
			reverse += Integer.toString(temp%10);
			temp /=10;
		}
		
		System.out.println(num == Integer.parseInt(reverse) ? "it is a palindrome": "i is not a palindrome");
	
		


		
	}

}
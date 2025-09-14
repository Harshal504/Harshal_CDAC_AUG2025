//Positive or Negative number

import java.util.Scanner;

class Q1{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		System.out.println( num<0 ? "The number is negative" : num>0 ? "The number is positive" : "The number is Zero");
		
	}

}
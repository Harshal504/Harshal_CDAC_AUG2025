//Factorial of a number

import java.util.Scanner;
import java.lang.Math;

class Q18{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();		
		int temp=1;
		for(int i=1; i<=num; i++){
			temp *= i;
		}		
		System.out.println(temp);
	}

}
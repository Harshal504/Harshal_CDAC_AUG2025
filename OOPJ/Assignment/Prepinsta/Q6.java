//Greatest of two numbers

import java.util.Scanner;

class Q6{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(num1>num2 ? num1+" is the greatest number of both": num2+" is the greatest number of both");
	}

}
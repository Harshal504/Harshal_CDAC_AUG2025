//Greatest of the Three numbers

import java.util.Scanner;

class Q7{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();


		System.out.println((num1>num2 && num1>num3) ? num1+" is the greatest number of both": (num1<num2 && num2>num3) ?num2+" is the greatest number of both": num3+" is the greatest number of both");
	}

}
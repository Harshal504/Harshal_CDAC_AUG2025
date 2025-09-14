//Sum of digits of a number

import java.util.Scanner;
import java.lang.Math;

class Q11{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		
		while(temp>0){
			sum += temp%10;
			temp /=10;
		}
		
		System.out.println(sum);
	
		


		
	}

}
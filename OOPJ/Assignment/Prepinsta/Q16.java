//Fibonacci Series upto nth term

import java.util.Scanner;
import java.lang.Math;

class Q16{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();		
		int temp = 0;
		int first = 0;
		int second =1;
		
		System.out.println(first);
		System.out.println(second);

		for(int i=2; i<=num; i++){
				temp=first+second;
				System.out.println(temp);
				first=second;
				second=temp;
				
		}
		
	}

}
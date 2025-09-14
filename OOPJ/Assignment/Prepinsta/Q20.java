//Factor of a number

import java.util.Scanner;
import java.lang.Math;

class Q20{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	

		int temp=1;
		for(int i=1; i<=num/2; i++ ){
			if(num%i==0){
				System.out.println(i);			}
		}
		System.out.println(num);

	}

}
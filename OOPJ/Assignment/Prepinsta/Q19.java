//Power of a number

import java.util.Scanner;
import java.lang.Math;

class Q19{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and exponent");
		
		int num = sc.nextInt();	
		int ex = sc.nextInt();	
		int temp=1;
		for(int i=0; i<ex; i++ ){
			temp *= num;
		}
		System.out.println(temp);

	}

}
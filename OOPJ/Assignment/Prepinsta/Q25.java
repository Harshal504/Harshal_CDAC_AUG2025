//Automorphic number


import java.util.Scanner;
import java.lang.Math;

class Q25{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	
		int temp = num*num;
		int len = Integer.toString(num).length();
//		System.out.println(temp);
		temp %= Math.pow(10,len);
//		System.out.println(temp);
		if(num==temp){
			System.out.println("it is Automorphic number");
		}
		


		
	}

}
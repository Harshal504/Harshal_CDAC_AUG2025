//Harshad number A Harshad number (or Niven number) is an integer that is completely divisible by the sum of its own digits in a given number base. For example, 21 is a Harshad number because its digits 2 and 1 add up to 3, and 21 is perfectly divisible by 3.


import java.util.Scanner;
import java.lang.Math;

class Q26{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	
		int temp = num;
		int sum =0;
		while(temp>0){
			sum += temp%10;
//			System.out.println(sum);
			temp /=10;
		}
//		System.out.println(sum);
		if(num%sum==0){
			System.out.println("it is Harshad number");
		}
		


		
	}

}
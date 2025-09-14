//Armstrong numb  153= 

import java.util.Scanner;
import java.lang.Math;

class Q14{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int temp = num;
		int len = Integer.toString(num).length();
		int sum=0;
		
		while(temp>0){
			sum += Math.pow(temp%10,len);
			temp /= 10;
			
		}
	
		System.out.println(sum==num? " It is Armstrong number": "it is not an armstrong number");

		
	}

}
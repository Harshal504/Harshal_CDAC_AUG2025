//Octal to Decimal to conversion Follow the steps given below:

//Step 1: Multiply each digit of the Octal number with the place value of that digit, starting from right to left i.e. from LSB to MSB.
//Step 2: Add the result of this multiplication and the decimal number will be formed.


import java.util.Scanner;
import java.lang.Math;

class Q33{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		int num = sc.nextInt();
//		System.out.println(num);
		int len = Integer.toString(num).length();
		int temp=num;
		int dec =0;
		for(int i=0; i<len; i++){
			dec += (temp%10)*Math.pow(8,i);
			temp /=10;
			

		}
		System.out.println(dec);
	
	
	
	
	}

}
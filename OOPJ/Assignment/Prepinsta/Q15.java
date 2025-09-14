//Armstrong number in a given range  abcd… = an + bn + cn + dn + …

import java.util.Scanner;
import java.lang.Math;

class Q15{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		
		int num = sc.nextInt();
		int num1 =sc.nextInt();
		
		for(int i = num; i<=num1; i++){
			int temp = i;
			int len = Integer.toString(i).length();
			int sum=0;
		
			while(temp>0){
				sum += Math.pow(temp%10,len);
				temp /= 10;
			
			}
		
	
			if (sum == i) {
    			System.out.println(i);
			}
		}
	}

}
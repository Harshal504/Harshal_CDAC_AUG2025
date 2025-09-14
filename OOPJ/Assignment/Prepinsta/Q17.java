//Find the Nth Term of the Fibonacci Series

import java.util.Scanner;
import java.lang.Math;

class Q17{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();		
		int temp = 0;
		int first = 0;
		int second =1;
		if(num==0){
			System.out.println(first);
		}else if(num==1){
			System.out.println(second);
		}else{
			for(int i=2; i<=num; i++){
					temp=first+second;
	
					first=second;
					second=temp;
					if(i==num){
						System.out.println(temp);
					}
				
			}
		}
		
	}

}
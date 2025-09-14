//Finding Prime Factors of a number

import java.util.Scanner;
import java.lang.Math;

class Q21{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	

		int temp=1;
		for(int i=2; i<=num/2; i++ ){
			if(num%i==0){
				if(i==2){
					System.out.println(i);	
				}else{
					int count=0;
					for(int j=2; j<=i/2; j++){
						if(i%j==0){
							count++;
						}
						
					}
					if(count==0){
							System.out.println(i);		
						}
				}
		
				}
		}
//		System.out.println(num);
		int count=0;
		for(int j=2; j<=num/2; j++){
						if(num%j==0){
							count++;
						}
						
					}
		if(count==0){
							System.out.println(num);		
						}

	}

}
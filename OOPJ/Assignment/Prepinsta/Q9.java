//Prime number

import java.util.Scanner;
import java.lang.Math;

class Q9{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
	
		if(num<2){
			System.out.println("not a prime number");
		}else{
			for(int i=2; i<=Math.sqrt(num); i++){
				if(num%i==0){
					System.out.println("not a prime number");
				}else{
					System.out.println("Is a prime number");
					break;

				}
			}
		}


		
	}

}
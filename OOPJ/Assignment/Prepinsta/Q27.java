//Abundant number  An abundant number is a positive integer where the sum of its proper divisors (all divisors except the number itself) is greater than the number itself. For example, the number 12 is abundant because its proper divisors are 1, 2, 3, 4, and 6, which sum to 16, and 16 is greater than 12. The difference between the sum of the proper divisors and the number is called its "abundance". 


import java.util.Scanner;
import java.lang.Math;

class Q27{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	
		int temp = num;
		int sum =0;
		
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				sum +=i;
			}
		}
		

//		System.out.println(sum);
		if(sum>num){
			System.out.println("it is Abundant number");
		}
		


		
	}

}
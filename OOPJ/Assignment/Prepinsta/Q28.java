//In number theory, a "friendly pair" refers to two different natural numbers that share the same abundancy index. The abundancy index of a number is defined as the ratio of the sum of its divisors (including the number itself) to the number itself.                More formally, for a number \(n\), let \(\sigma (n)\) denote the sum of its divisors. Then the abundancy index of \(n\) is \(\frac{\sigma (n)}{n}\). Two numbers, \(n\) and \(m\), are a friendly pair if \(\frac{\sigma (n)}{n}=\frac{\sigma (m)}{m}\) 


import java.util.Scanner;
import java.lang.Math;

class Q28{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num = sc.nextInt();
		int num1= sc.nextInt();	
		int sum1 = 0 ;
		int sum =0;
		
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				sum +=i;
			}
		}
		for(int i=1; i<=num1/2; i++){
			if(num1%i==0){
				sum1 +=i;
			}
		}
		

//		System.out.println(sum);
		if(sum/num==sum1/num1){
			System.out.println("They are friendly pair");
		}
		


		
	}

}
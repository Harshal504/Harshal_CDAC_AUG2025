//Addition of two fractions
//Divide the larger number (a) by the smaller number (b) to get a remainder (r).
//If the remainder (r) is 0, then the previous divisor (b) is the GCD.
//If the remainder is not 0, replace 'a' with 'b' and 'b' with 'r', and repeat the division. 


import java.util.Scanner;
import java.lang.Math;

class Q43{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numerator and dinominator of both numbers");
		
		int n1 = sc.nextInt();
		int d1 = sc.nextInt();
		int n2 = sc.nextInt();
		int d2 = sc.nextInt();

		int dive = (n1*d2)+(n2*d1);
		int div = d1*d2;
		int temp = 1;
		int gcd =0;
		if(dive>div){
			while(dive>0){
				if(dive%div ==0){
					gcd=div;
				}else{
					temp = dive%div;
					dive = div;
					div = temp;
				}
		}
			
		}else{
			while(div>0){
			
				if(div%dive ==0){
					gcd=div;
				}else{
					temp = div%dive;
					div = dive;
					dive = temp;
				}	
		}	
		}
		

		System.out.println((((n1*d2)+(n2*d1))/gcd)+"/"+((d1*d2)/gcd));
	}

}
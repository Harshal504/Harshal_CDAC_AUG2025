//Greatest Common Divisor Long Division Method:
//This method is useful for larger numbers. 
//Divide the larger number by the smaller number. 
//If the remainder is not zero, use the previous divisor as the new dividend and the remainder as the new divisor. 
//Repeat the process until the remainder is zero. 
//The last non-zero divisor is the HCF. 


import java.util.Scanner;
import java.lang.Math;

class Q30{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num = sc.nextInt();
		int num1= sc.nextInt();	
		
		if(num<num1){
			for(int i=1; i<=num*num1; i++){
				if((num1*i)%num==0){
					System.out.println("LCM is "+ (num1*i));
					break;
				}
			}
		}else{
			for(int i=1; i<=num*num1; i++){
				if((num*i)%num1==0){
					System.out.println("LCM is "+ (num*i));
					break;
				}
			}
		}}

}
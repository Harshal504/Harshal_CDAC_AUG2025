//IHighest Common Factor (HCF) Long Division Method:
//This method is useful for larger numbers. 
//Divide the larger number by the smaller number. 
//If the remainder is not zero, use the previous divisor as the new dividend and the remainder as the new divisor. 
//Repeat the process until the remainder is zero. 
//The last non-zero divisor is the HCF. 


import java.util.Scanner;
import java.lang.Math;

class Q29{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num = sc.nextInt();
		int num1= sc.nextInt();	
		int temp =1;
		
		if(num>num1){
			int dive =num;
			int div = num1;
			
			while(div>0){
				if(dive%div==0){
					System.out.println("HCF is"+ div);
					break;
				}else{
					temp=div;
					div = dive%div;
					dive =temp;
				}
			}
		}else{
			int dive =num1;
			int div = num;
			
			while(div>0){
				if(dive%div==0){
					System.out.println("HCF is"+ div);
					break;
				}else{
					temp=div;
					div = dive%div;
					dive =temp;
				}
			}	
			}



		
	}

}
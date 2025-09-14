//Strong number


import java.util.Scanner;
import java.lang.Math;

class Q22{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	
		int temp = num;
		int n=0;
		int sum=0;
		while(temp>0){
			n=temp%10;
			
			int fact=1;
		    for(int i=1; i<=n; i++){
				fact *= i;
			}	
			sum +=fact;	
			temp /=10;
		}
		if(sum==num){
			System.out.println("it is strong number");
		}else{
			System.out.println("it is not strong number");		}	
		
	}

}
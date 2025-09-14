//Sum of N natural numbers

import java.util.Scanner;

class Q4{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		int temp=0;
		for(int i=0; i<=num; i++){
			temp +=i;
		}
		System.out.println(temp);
	}

}
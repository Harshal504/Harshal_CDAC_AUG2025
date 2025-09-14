//Sum of numbers in a given range

import java.util.Scanner;

class Q5{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp=0;
		for(int i=num1; i<=num2; i++){
			temp +=i;
		}
		System.out.println(temp);
	}

}
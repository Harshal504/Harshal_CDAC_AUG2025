//Sum of First N Natural numbers

import java.util.Scanner;

class Q3{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		int temp=0;
		while(temp<=num){
			System.out.print(temp+"\t");
			temp++;
		}
		
	}

}
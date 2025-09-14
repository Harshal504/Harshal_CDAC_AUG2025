//Even or Odd number

import java.util.Scanner;

class Q2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		System.out.println( num%2==0 ? "The number is even" : "The number is odd");
		
	}

}
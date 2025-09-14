//Leap year or not

import java.util.Scanner;

class Q8{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		
		int year = sc.nextInt();



		System.out.println(((year%4==0 && year%100!=0) || (year%400==0)) ? year+" is the a leapyear":  year+" is not a leap year");
	}

}
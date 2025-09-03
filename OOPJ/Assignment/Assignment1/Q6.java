//Leap Year Check for a Birthday
//Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input and check if it’s a leap year

import java.util.*;


class Q6{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year ");
		int y = sc.nextInt();
		
		if(y%400 == 0){
			System.out.println(y + "is a Leap year");
		}else if(y%4==0 && y%100 == 0){
			System.out.println(y + " is not a leap year");
		
		}else if(y%4 == 0){
			System.out.println(y + " is a leap year");
		}else {
			System.out.println(y + "is not a leap year");
		}
		
		
	}


}
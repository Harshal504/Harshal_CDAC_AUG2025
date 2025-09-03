// Even or Odd Locker Number
//Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is even or odd.

import java.util.*;


class Q4{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Locker Number ");
		int loc = sc.nextInt();
		
		System.out.println( loc == 0 ? "No Locker" : loc%2 == 0 ? "Even Locker Number" : "Odd Locker Number");
	}


}
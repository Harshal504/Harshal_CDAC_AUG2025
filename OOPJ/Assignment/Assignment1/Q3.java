// Bank Transaction Check

import java.util.*;


class Q3{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Transaction Amount: ");
		int amt = sc.nextInt();
		
		System.out.println(amt > 0 ? "Deposit Transaction" : amt < 0 ? "Withdrawl Transaction" : "No Transaction");
	}


}
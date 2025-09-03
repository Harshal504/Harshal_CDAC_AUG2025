//Shop Discount Calculation
//Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount as input and calculate final cost.
import java.util.*;


class Q8{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total purchase Amount ");
		float amt = sc.nextFloat();
		
		System.out.println( amt > 1000 ? "Final cost after Discount" + (amt-(amt*0.1)) : "Final cost after Discount" + amt);
		
		
	}


}
//Employee Bonus Eligibility
//Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and years of service as input and print bonus amount.
import java.util.*;


class Q9{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary: ");
		float salary = sc.nextFloat();
		System.out.println("Enter years of service: ");
		int years = sc.nextInt();
		
		System.out.println( years >5 ? "Bonus amount" + (salary*0.5) : "Bonus amount is Zero");
		
		
	}


}
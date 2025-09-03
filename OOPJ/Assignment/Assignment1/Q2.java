//Highest Salary Among Three Offers
//Scenario: You have three job offers. Take the offered salaries as input and print which company is offering the highest salary.



import java.util.*;

class Q2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary for Company1 : ");
		int c1 = sc.nextInt();
		System.out.println("Enter the salary for Company2 : ");
		int c2 = sc.nextInt();
		System.out.println("Enter the salary for Company3 : ");
		int c3 = sc.nextInt();
		
				
		System.out.println(c1 > c2 && c1 >c3 ? "Company1 offers the higest salary" : c2 > c1 && c2 >c3 ? "Company2 offers the higest salary" : "Company3 offers the higest salary" );
		
	}

}

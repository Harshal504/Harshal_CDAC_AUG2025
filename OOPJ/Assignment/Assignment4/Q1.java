//Problem 1: Salary Split
//Scenario: You are developing a payroll system for a company. The HR department wants to distribute a bonus equally among employees in a department. However, sometimes a department might have zero employees due to restructuring.
//Task: Create a method that divides a bonus amount among employees and handles the case when the number of employees is zero.
//Sample Input:
//10000
//0
//Expected Output:
//Error: Division by zero not allowed


class Q1{

	static void divBonus(String dept, double bonus, int noOfEmployees){

		try{
			if(noOfEmployees == 0){
				throw new ArithmeticException(dept+"has 0 employees so no bonus");
			}
			double bonusAmt = bonus/noOfEmployees;
			System.out.println(dept+" Employees got discount of"+ bonusAmt);
		}catch(ArithmeticException e){
//			System.out.println("Error: has 0 employees so no bonus");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		
		divBonus("CS", 10000, 10);
		divBonus("Admin", 15000, 0);
		
	
	}
}
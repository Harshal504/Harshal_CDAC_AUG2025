//Problem 4: Employee Data
//Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working hours. The system must handle both invalid employee indices and division by zero.
//Task: Create a method with nested try-catch blocks to handle multiple exception scenarios.
//Sample Input:
//2
//5000 6000
//0
//5
//Expected Output:
//Division by zero
//or
//Invalid index


	
	

class Q4{
	
	
	
	static void hourlyWage(int noOfEmployees, double[] salary, int whours, int employeeno){
		try{
			if(whours==0){
				throw new ArithmeticException("Division by Zero");
			}
//			double empHWage= salary[employeeno-1]/whours;
			System.out.println("the salary"+(salary[employeeno-1]/whours));
		}catch(ArithmeticException e){
			System.out.println("Error: Division by zero");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index");
		}
		
	}

	
	
	public static void main(String[] args) {
		
		hourlyWage(2,new double[]{5000, 6000}, 5, 1);
		hourlyWage(3,new double[]{2000, 5000, 4000}, 0, 5);
		hourlyWage(3,new double[]{2000, 5000, 4000}, 6, 5);
	
	}
}
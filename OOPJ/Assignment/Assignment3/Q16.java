//Employee Salary Display
//Scenario: Company wants to display employee salary with different bonus calculations based on employee type.
//Problem Statement: Create class Employee with method displaySalary(). Subclass Manager and Developer override displaySalary() to include bonus.
//Classes/Fields:
//● Employee → name, salary, displaySalary() prints salary
//● Manager → overrides displaySalary() → adds 20% bonus
//● Developer → overrides displaySalary() → adds 10% bonus
//Sample Input: Manager → name=Anita, salary=50000 Developer → name=Rohit, salary=40000
//Sample Output: Anita Total Salary = 60000 Rohit Total Salary = 44000


import java.util.*;
import java.lang.Math;

class Employee{
	protected String name;
	protected double salary;
	
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
		
	}
	
	void displaySalary(){
		System.out.println(name+" Total Salary = "+salary);
	}

}

class Manager extends Employee{

	Manager(String name, double salary){
		super(name, salary);
	}

	void displaySalary(){
		System.out.println(name+" Total Salary = "+(salary*1.2));
	}	

}	

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}

	void displaySalary(){
		System.out.println(name+" Total Salary = "+(salary*1.1));
	}	}
	
class Q16{
	public static void main(String[] args){
		Employee e1 = new Manager("HArshal", 20000);
		Employee e2 = new Developer("Rohit", 14000);
		Employee e3 = new Employee("Amit", 10000);
		
		e1.displaySalary();
		e2.displaySalary();
		e3.displaySalary();
	}
}
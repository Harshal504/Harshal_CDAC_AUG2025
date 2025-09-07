//Employee Bonus Calculation
//Scenario: A company has different types of employees with specific bonus calculation rules.
//Problem Statement: Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager → bonus=20% of salary, Subclass Developer → bonus=10% of salary.
//Classes/Fields:
//● Employee → name, salary, calculateBonus() (abstract)
//● Manager → bonus=20% of salary
//● Developer → bonus=10% of salary
//Sample Input: Manager → name=Anita, salary=50000 Developer → name=Rohit, salary=40000


import java.util.*;

abstract class Employee{
	protected String name;
	protected double salary;
	
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	abstract void calculateBonus();

}	

class Manager extends Employee{

	Manager(String name, double salary){
		super(name, salary);
	}
	void calculateBonus(){
		System.out.println(name+ "Bonus ="+ (salary*0.20));
	}
}

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	void calculateBonus(){
		System.out.println(name+ "Bonus ="+ (salary*0.10));
	}}	
	
class Q14{
	public static void main(String[] args){
		
		Employee e1 = new Manager("HArshal", 2000000);
		Employee e2 = new Developer("Rohit", 300000);
		
		e1.calculateBonus();
		e2.calculateBonus();
		
		
	}
}
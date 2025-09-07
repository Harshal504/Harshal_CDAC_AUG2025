//Employee Management System
//Scenario: Manage employee details, calculate salaries, and differentiate employee types.
//Problem Statement:
//● Abstract Class Employee → instance variables: name, id
//○ Abstract method calculateSalary() → different calculation for each type
//● Class PermanentEmployee extends Employee → include basicSalary and hra → implement calculateSalary()
//● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked → implement calculateSalary()
//● Interface BonusEligible → method calculateBonus() → applies only to permanent employees
//● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible
//Sample Input: PermanentEmployee → name="Amit", basicSalary=50000, hra=5000 ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100
//Sample Output: Amit Salary = 55000, Bonus = 5500 Neha Salary = 30000


import java.util.*;

interface BonusEligible{
	
	public double CalculateBonus(double salary, int hra);
}

abstract class Employee implements BonusEligible{
	protected String name;
	protected int id=0;
	
	Employee(String name){
		this.name=name;
		this.id=++id;
	}
	
	abstract void CalculateSalary();
	
	public double CalculateBonus(double salary, int hra){
		double bonus;
		bonus=(salary+hra)*0.1;
		return bonus;
	}
	
}

class PermanentEmployee extends Employee{
	private double basicSalary;
	private int hra;
	
	PermanentEmployee(String name, double basicSalary, int hra){
		super(name);
		this.basicSalary=basicSalary;
		this.hra=hra;
	}
	
	void CalculateSalary(){
		System.out.println(name+" Salary = "+(basicSalary+hra) +" , Bonus = "+ CalculateBonus(basicSalary, hra));
	}
	
}

class ContractEmployee extends Employee{
	private int hourlyRate;
	private int hoursWorked;
	
	ContractEmployee(String name, int hourlyRate, int hoursWorked){
		super(name);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	void CalculateSalary(){
		System.out.println(name+" Salary = "+(hourlyRate*hoursWorked));
	}

}




class Q29{
	public static void main(String[] args){
		
		Employee e1 = new PermanentEmployee("Harshal", 50000, 5000);
		
		Employee e2 = new ContractEmployee("Rohit", 20, 80);
		
		e1.CalculateSalary();
		e2.CalculateSalary();
		

	}
}

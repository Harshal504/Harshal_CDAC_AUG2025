//Employee Hierarchy
//Scenario: A company has regular and contractual employees with different pay structures.
//Problem Statement: Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%, Subclass ContractEmployee adds allowance 5%. Display net salary.
//Classes/Fields:
//● Employee → name, basicSalary
//● RegularEmployee → HRA 10%
//● ContractEmployee → allowance 5%

import java.util.*;

abstract class Employee{
	protected String name;
	protected double basicSalary;
	
	Employee(String name, double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
	}
	abstract double getSalary();
	
	
}
class RegularEmployee extends Employee{
	double netSalary;
	RegularEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	@Override
	public double getSalary(){
		this.netSalary = basicSalary*1.1;
		System.out.println(name +" NetSalary is "+ netSalary);
		return netSalary;
		
	}
	
}
class ContractEmployee extends Employee{
	double netSalary;
	ContractEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	@Override
	public double getSalary(){
		this.netSalary = basicSalary*1.05;
		System.out.println(name +" NetSalary is "+ netSalary);
		return netSalary;
		
	}	

}





class Q7{
	public static void main(String[] args){
		Employee e1 = new RegularEmployee("Harshal", 20000);
		
		e1.getSalary();
		
		Employee e2 = new ContractEmployee("Rohit", 10000);
		
		e2.getSalary();
		


		

	}
}
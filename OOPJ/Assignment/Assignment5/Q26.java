//Problem 26: Employee Management System
//Use Case: Manage employee information including name and salary.
//Requirements:
//● Create Employee objects with name and salary
//● Store employees in a collection
//● Display employee information
//Sample Input:
//Employees: Employee("Amit", 50000), Employee("Priya", 60000)
//Expected Output:
//Employee List: Amit:50000, Priya:60000

import java.util.*;
import java.util.Map.Entry;

class Employee{
	private String name;
	private int salary;
	
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString(){
		return name+":"+salary;
	}
	
}


class Q26{



	public static void main(String[] args){
		List<Employee> e = new ArrayList<Employee>();
		
		e.add(new Employee("Amit", 50000));
		e.add(new Employee("Priya", 60000));
		
		System.out.print("Employee List: ");
		e.forEach(n -> System.out.print(n+"\t"));

	}

}
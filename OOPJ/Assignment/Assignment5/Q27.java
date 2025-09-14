//Problem 27: Employee Salary Sorting
//Use Case: Sort employees by salary for payroll processing.
//Requirements:
//● Store employee objects
//● Sort by salary in ascending order
//● Display sorted employee list
//Sample Input:
//Employees: ("Amit", 50000), ("Priya", 60000), ("Rohan", 45000)
//Expected Output:
//Sorted by salary: Rohan:45000, Amit:50000, Priya:60000

import java.util.*;
import java.util.Map.Entry;

class Employee implements Comparable<Employee>{
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
	
	@Override
	public int compareTo(Employee o){
		return this.salary - o.salary;
	}
	
}


class Q27{



	public static void main(String[] args){
		Set<Employee> e = new TreeSet<Employee>();
		
		e.add(new Employee("Amit", 50000));
		e.add(new Employee("Priya", 60000));
		e.add(new Employee("Rohan", 45000));
//		Collections.sort(e);
		System.out.print("Employee List: ");
		e.forEach(n -> System.out.print(n+"\t"));

	}

}
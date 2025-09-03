//Employee Auto-ID Generator
//Scenario: Create Employee class with id, name, basicSalary.
//● Add static counter starting from 1001 for IDs.
//● Default constructor → name = "Unknown", salary = 20000
//● Parameterized constructor → accept name and salary
//● Getter for all variables
//● Create 2 employees and display their IDs, names, salary
//Extend  Employee Net Salary
//Scenario: Extend previous problem. Add method calculateNetSalary():
//● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
//● Print net salary for 2 employees
import java.util.*;

class Employee{
	int id;
	String name;
	float basicSalary;
	static int count =1001;
	
	Employee(){
		this.name="Unknown";
		this.basicSalary=20000;
		this.id = count;
		count++;
	}
	
	Employee(String name, float basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
		this.id = count;
		count++;
	}		
	
	String getname(){
		return name;
	}
	
	float getsalary(){
		return basicSalary;
	}
	
	double calculatenetsalary(){
		return ((this.basicSalary*1.15)*0.98);
	}

	
}

class Q16{
	public static void main(String args[]){
		Employee e1 = new Employee();
		
		Employee e2 = new Employee("Harshal", 50000);
		
		System.out.println("ID: "+e1.id+" Employee name: "+e1.name+" Base Salary: "+e1.basicSalary+ " Net Salary: "+e1.calculatenetsalary());
		System.out.println("ID: "+e2.id+" Employee name: "+e2.name+" Base Salary: "+e2.basicSalary+ " Net Salary: "+e2.calculatenetsalary());	
		}
}
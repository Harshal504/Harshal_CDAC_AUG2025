//College Staff Hierarchy
//Scenario: A college has employees who can be Teaching or Non-Teaching. Teaching staff can be Professors or Lecturers.
//Problem Statement: Create classes:
//● Employee → name, salary, displaySalary()
//● TeachingStaff → subject, overrides displaySalary()
//● Professor → specialization, overrides displaySalary()
//● Lecturer → department, overrides displaySalary()
//Sample Input: Professor → name=Dr. Sharma, salary=80000, subject=Math, specialization=Algebra Lecturer → name=Ms. Mehta, salary=50000, subject=Physics, department=Science
//Sample Output: Dr. Sharma → Subject=Math, Specialization=Algebra, Salary=80000 Ms. Mehta → Subject=Physics, Department=Science, Salary=50000


import java.util.*;



class Employee {
	protected String name;
	protected double salary;
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}	
	
	void displaySalary(){
		System.out.println(name+" -> Salary= "+ salary);
	}

}

class TeachingStaff extends Employee  {
	protected String subject;
	TeachingStaff(String name, double salary, String subject){
		super(name, salary);
		this.subject=subject;
	}	
	void displaySalary(){
		System.out.println(name+" -> Subject = "+subject+", Salary= "+ salary);
	}
	
	
}

//class NonTeachingStaff extends Employee {
//
//}

class Professor extends TeachingStaff{
	private String specialization;
	Professor(String name, double salary, String subject, String specilization){
		super(name, salary,subject);
		this.specialization=specialization;
	}	
	void displaySalary(){
		System.out.println(name+" -> Subject = "+subject+", Specialization = "+specialization+", Salary= "+ salary);
	}}

class Lecturer extends TeachingStaff{
	private String department;
	
	Lecturer(String name, double salary, String subject, String department){
		super(name, salary,subject);
		this.department=department;
	}

	void displaySalary(){
		System.out.println(name+" -> Subject = "+subject+", Department= "+department+" , Salary= "+ salary);
	}
}
class Q20{
	public static void main(String[] args){
		
		Employee e1 = new Professor("HArshal", 50000, "DBMS","Software Engineering");
		
		Employee e2 = new Lecturer("Rohit", 20000, " linux", "CS");
		
		e1.displaySalary();
		e2.displaySalary();
		

		

	}
}
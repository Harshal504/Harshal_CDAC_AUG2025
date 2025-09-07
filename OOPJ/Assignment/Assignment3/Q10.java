//Academic Staff
//Scenario: University has teaching and non-teaching staff.
//Problem Statement: Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff adds department. Display staff info.
//Classes/Fields:
//● Staff → name, salary
//● TeachingStaff → subject
//● NonTeachingStaff → department
//Sample Input: Teaching → name=Anita, salary=50000, subject=Math NonTeaching → name=Ramesh, salary=40000, department=Admin


import java.util.*;

abstract class Staff{
	protected String name;
	protected double salary;
	
	Staff(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
//	abstract void setDetails();
	abstract void getDetails();
	

}

class TeachingStaff extends Staff{
	String subject;
	TeachingStaff(String name, double salary){
		super(name,salary);
	}
//	@Override
//	void setDetails(String data){
//		this.subject=data;
//	}


	void setSubject(String subject){
		this.subject=subject;
	}
	@Override
	void getDetails(){
		System.out.println("Teaching Staff => Name: "+name+" Salary: "+salary+", Subject: "+subject);
	}

}
class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String name, double salary){
		super(name,salary);
	}
//	@Override
//	void setDetails(String data){
//		this.department=data;
//	}
//	
	
	void setDepartment(String department){
		this.department=department;
	}
	@Override
	void getDetails(){
		System.out.println("Non Teaching Staff => Name: "+name+" Salary: "+salary+", Department: "+department);
	}
}

class Q10{
	public static void main(String[] args){
//		Staff s1 = new TeachingStaff("Harshal", 20000);
//		Staff s2 = new NonTeachingStaff("Rohit", 12000);
//		
		TeachingStaff s1 = new TeachingStaff("Harshal", 20000);
		NonTeachingStaff s2 = new NonTeachingStaff("Rohit", 12000);
		
		s1.setSubject("Marathi");
		s2.setDepartment("admin");

//		s1.setDetails("Marathi");
//		s2.setDetails("Department");
		
		s1.getDetails();
		s2.getDetails();
		

	}
}
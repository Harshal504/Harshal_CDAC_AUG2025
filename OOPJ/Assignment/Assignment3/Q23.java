//School Members
//Scenario: School has members: Teachers, Students, and Staff. All share common info.
//Problem Statement:
//● Member → name, id, displayInfo()
//● Teacher → subject, overrides displayInfo()
//● Student → grade, overrides displayInfo()
//● Staff → department, overrides displayInfo()
//Sample Input: Teacher → name=Mr. Kumar, id=101, subject=English Student → name=Riya, id=201, grade=10 Staff → name=Mr. Das, id=301, department=Maintenance
//Sample Output: Mr. Kumar → ID=101, Subject=English Riya → ID=201, Grade=10 Mr. Das → ID=301, Department=Maintenance


import java.util.*;

class Member{
	protected String name;
	protected int id;
	
	Member(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	void displayInfo(){
		System.out.println(name+" -> ID="+id);
	}
}

class Teacher extends Member{
	private String subject;
	
	Teacher(String name, int id, String subject){
		super(name,id);
		this.subject=subject;
	}
	
	void displayInfo(){
		System.out.println(name+" -> ID="+id+", Subject="+subject);
	}
	
	

}

class Student extends Member{
	private int grade;
	
	Student(String name, int id, int grade){
		super(name,id);
		this.grade=grade;
	}
	
	void displayInfo(){
		System.out.println(name+" -> ID="+id+", Grade="+grade);
	}
}

class Staff extends Member{
	private String department;
	
	Staff(String name, int id, String department){
		super(name,id);
		this.department=department;
	}
	
	void displayInfo(){
		System.out.println(name+" -> ID="+id+", Department="+department);
	}
}

class Q23{
	public static void main(String[] args){
		
		Member m1= new Teacher("HArshal", 1101, "History");
		Member m2 =new Student("Rohit", 101, 9);
		Member m3= new Staff("hina",2101, " Admin");
		
		m1.displayInfo();
		m2.displayInfo();
		m3.displayInfo();

	}
}
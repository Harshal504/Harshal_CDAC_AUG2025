//Student Marks Checker
//Scenario: Create a Student class with rollNo, name, and marks.
//● Use a parameterized constructor to initialize all fields.
//● Create a getter and setter for marks.
//● In main, create one student, update marks using setter, and print student details.
import java.util.*;

class Student{
	int rollno;
	String name;
	int marks;
	
	Student(int rollno, String name, int marks){
		this.rollno = rollno;
		this.name=name;
		this.marks=marks;
		
	}
	
	void setname(String name){
		this.name = name;
	}

	
	String getname(){
		return name;
	}
	void setmarks(int marks){
		this.marks = marks;
	}
	
	
	

	
	
	
	
}

class Q10{
	public static void main(String args[]){
		
		Student s1 = new Student(11, "Harshal", 75);

		System.out.println("Student: " +s1.getname()+" marks: "+s1.marks+ " rollno: " +s1.rollno);

//		s1.setname("abhishek");
		s1.setmarks(60);
		System.out.println("Student: " +s1.getname()+" marks: "+s1.marks+ " rollno: " +s1.rollno);


	}
}
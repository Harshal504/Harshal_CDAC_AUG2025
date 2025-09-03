//Student Marks Calculator
//Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in the class.
//Requirements:
//1. Create a class Student with instance variables: name (String), marks (int).
//2. Create static variable totalStudents to count total number of students.
//3. Constructor to initialize student details and increment totalStudents.
//4. Getter and Setter for marks.
//5. Method isPassed() returns true if marks >= 35, false otherwise.
//6. Static method showTotalStudents() prints total students.
//7. In main class, create 3 students, check if they passed, and show total students
import java.util.*;

class Student{
	String name;
	int marks;
	static int totalStudents=0;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	
	void setmarks(int marks){
		this.marks = marks;
	}
	
	int getmarks(){
		return marks;
	}
	
	boolean isPassed(){
		if(marks>=35){
			return true;
		}else{
			return false;
		}
	}
	
	static void showTotalStudents(){
		System.out.println("Total Students: "+totalStudents);
	}
	
	
}

class Q5{
	public static void main(String args[]){
		
		Student s1 = new Student("Harshal", 45);
		System.out.println(s1.isPassed() == true? "Student1 is passed": "Student1 is failed");
		
		Student s2 = new Student("Rohit", 90);
		System.out.println(s2.isPassed() == true? "Student2 is passed": "Student2 is failed");
		
		Student s3 = new Student("Vilas", 32);
		System.out.println(s3.isPassed() == true? "Student3 is passed": "Student3 is failed");
		
		Student.showTotalStudents();


	}
}
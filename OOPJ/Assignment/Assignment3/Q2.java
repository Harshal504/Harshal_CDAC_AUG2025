//Student Marks
//Scenario: A teacher wants to update student marks but must ensure marks are valid.
//Problem Statement: Create a class Student with private marks. Create getter and setter with validation (0–100).
//Fields:
//● private int marks
//Methods:
//● setMarks(int marks) → validate and set
//● getMarks() → return marks
import java.util.*;

class Student{
	private int marks;
	
//	Student(){
//		this.marks = 0;
//	}
	
	void setMarks(int marks){
		if(marks<0 || marks>100){
			System.out.println("Invalid Marks");
		}else{
			this.marks = marks;
			System.out.println("marks updated successfully");
		}
	}
	
	int getMarks(){
		return marks;
	}


}






class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		s1.setMarks(90);
		
		Student s2 = new Student();
		s2.setMarks(110);
		
		System.out.println("student 1 marks: "+s1.getMarks());
		System.out.println("student 2 marks: "+s2.getMarks());
				
	}
}
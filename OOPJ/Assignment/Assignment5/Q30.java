//Problem 30: Grade-Based Student Filter
//Use Case: Filter students based on minimum grade requirements.
//Requirements:
//● Store student objects with grades
//● Remove students below grade B
//● Display filtered results
//Sample Input:
//Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B")
//Filter: Grade >= B
//Expected Output:
//Qualified Students: Amit:A, Rohan:B

import java.util.*;
import java.util.Map.Entry;

class Student{
	private String name;
	private String grade;
	
	Student(String name, String grade){
		super();
		this.name=name;
		this.grade=grade;
	}
	
	public String getGrade(){
		return grade;
	}
	
	@Override
	public String toString(){
		return name+":"+grade;
	}
	
	
}


class Q30{

	public static void main(String[] args){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Amit","A"));
		students.add(new Student("Priya","B"));
		students.add(new Student("Pritam","C"));
		
		List<Student> filteredStudents = new ArrayList<Student>();
		
		for(Student s: students){
			if(s.getGrade() == "A" || s.getGrade()=="B"){
				filteredStudents.add(s);
			}
		}
		System.out.println("Qualified Students: ");
		for(Student s : filteredStudents){
			System.out.println(s);
		}
		
		

		
		
	}

}
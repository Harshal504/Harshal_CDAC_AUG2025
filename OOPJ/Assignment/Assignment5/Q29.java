//Problem 29: Student Record System
//Use Case: Maintain student records with name and grade information.
//Requirements:
//● Create Student objects with name and grade
//● Store in a collection
//● Display student records
//Sample Input:
//Students: Student("Amit", "A"), Student("Priya", "B")
//Expected Output:
//Student Records: Amit:A, Priya:B

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
	
	@Override
	public String toString(){
		return name+":"+grade;
	}
	
	
}


class Q29{

	public static void main(String[] args){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Amit","A"));
		students.add(new Student("Priya","B"));
		
		
		Iterator<Student> i = students.iterator();
		System.out.println("Student Records: ");
		while(i.hasNext()){
			System.out.println(i.next());
		}

		
		
	}

}
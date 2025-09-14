//Problem 1: Student Names Management System
//Use Case: A school administrator needs to maintain a list of student names for a class roster.
//Requirements:
//● Add student names to the roster
//● Display all students
//● Remove a student from the roster
//Sample Input:
//Add students: "Amit", "Priya", "Rohan"
//Remove student: "Priya"
//Expected Output:
//Students: Amit, Rohan

import java.util.*;


class Q1{

	public static void main(String[] args){
		List<String> student = new ArrayList<String>();
		
		student.add("Amit");
		student.add("Priya");
		student.add("Rohan");
		
		student.remove("Priya");
		
		for(String s : student){
			System.out.println(s);
		}
	}

}
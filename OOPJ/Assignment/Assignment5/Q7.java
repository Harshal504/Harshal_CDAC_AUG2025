//Problem 7: Alphabetical Student Directory
//Use Case: A school wants to maintain student names in alphabetical order.
//Requirements:
//● Add student names
//● Automatically maintain alphabetical sorting
//● Display sorted name
//Sample Input:
//Students: "Rohan", "Amit", "Priya"
//Expected Output:
//Students: Amit, Priya, Rohan

import java.util.*;


class Q7{
	


	public static void main(String[] args){
		Set<String> student = new TreeSet<String>();
		
		student.add("Rohan");
		student.add("Amit");
		student.add("Priya");
		
		for(String s : student){
			System.out.println(s);
		}
		
		
		
	}

}
//Problem 11: Student Grade Management
//Use Case: A teacher needs to map student names to their exam marks.
//Requirements:
//● Store student name and marks pairs
//● Retrieve marks by student name
//● Display all student-marks mappings
//Sample Input:
//Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78
//Expected Output:
//Grade Report: Amit:85, Priya:92, Rohan:78

import java.util.*;


class Q11{
	


	public static void main(String[] args){

		Map<String, Integer> marks = new HashMap<>();
		
		marks.put("Amit", 85);
		marks.put("Priya", 92);
		marks.put("Rohan", 78);
		
		
		Set<String> names = marks.keySet();
		for(String name : names){
			System.out.println(name+":"+marks.get(name));
		}
	
	
	
	}

}
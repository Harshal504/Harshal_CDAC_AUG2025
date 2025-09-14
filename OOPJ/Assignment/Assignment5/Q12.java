//Problem 12: Attendance Tracking System
//Use Case: Track student attendance percentages in alphabetical order.
//Requirements:
//● Map student names to attendance percentages
//● Maintain alphabetical order of students
//● Display sorted attendance report
//Sample Input:
//Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95
//Expected Output:
//Attendance Report: Amit:90, Priya:95, Rohan:85

import java.util.*;


class Q12{
	


	public static void main(String[] args){

		Map<String, Integer> marks = new TreeMap<>();
		
		marks.put("Amit", 90);
		marks.put("Rohan", 85);
		marks.put("Priya", 95);
		
		
		Set<String> names = marks.keySet();
		for(String name : names){
			System.out.println(name+":"+marks.get(name));
		}
	
	
	
	}

}
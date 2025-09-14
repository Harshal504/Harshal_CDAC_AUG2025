//Problem 13: Student Registration Order Tracker
//Use Case: Maintain the order in which students registered for a course.
//Requirements:
//● Record registration order
//● Map student names to roll numbers
//● Preserve insertion order
//Sample Input:
//Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103
//Expected Output:
//Registration Order: Amit:101, Rohan:102, Priya:103

import java.util.*;


class Q13{
	


	public static void main(String[] args){

		Map<String, Integer> marks = new LinkedHashMap<>();
		
		marks.put("Amit", 101);
		marks.put("Rohan", 102);
		marks.put("Priya", 103);
		
		
		Set<String> names = marks.keySet();
		for(String name : names){
			System.out.println(name+":"+marks.get(name));
		}
	
	
	
	}

}
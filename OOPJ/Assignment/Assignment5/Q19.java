//Problem 19: Grade Report Generator
//Use Case: Display all student grades using proper iteration techniques.
//Requirements:
//● Iterate through student-grade mappings
//● Display formatted grade report
//● Use Iterator pattern
//Sample Input:
//Student grades: "Amit" → 85, "Priya" → 92
//Expected Output:
//Grade Report: Amit:85, Priya:92

import java.util.*;
import java.util.Map.Entry;


class Q19{
	
	


	public static void main(String[] args){

		Map<String,Integer> grades = new HashMap<>();
		
		grades.put("Amit", 85);
		grades.put("Priya", 92);
		
		for(Entry<String,Integer> e : grades.entrySet()){
			System.out.println(e);
		}
		
		Iterator<Entry<String,Integer>> it = grades.entrySet().iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

		
	
	}

}
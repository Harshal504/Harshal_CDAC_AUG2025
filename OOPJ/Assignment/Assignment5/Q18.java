//Problem 18: Batch Merger System
//Use Case: Merge student lists from morning and evening batches, removing duplicates.
//Requirements:
//● Combine two student lists
//● Remove duplicate students
//● Maintain unique student list
//Sample Input:
//Morning batch: "Amit", "Priya"
//Evening batch: "Rohan", "Priya"
//Expected Output:
//Combined batches: Amit, Priya, Rohan

import java.util.*;
import java.util.Map.Entry;


class Q18{
	
	


	public static void main(String[] args){

		Set<String> morning = new LinkedHashSet<>();
		
		morning.add("Amit");
		morning.add("Priya");
		
		Set<String> evening = new LinkedHashSet<>();
		
		evening.add("Rohan");
		evening.add("Priya");
		
		morning.addAll(evening);
		
		for(String s:morning){
			System.out.println(s);
		}
		
	
	}

}
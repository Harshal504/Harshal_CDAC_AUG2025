//Problem 16: Grade-Based Student Filter
//Use Case: Remove students with failing grades from the honor roll.
//Requirements:
//● Store student grades in a map
//● Remove students with marks below 60
//● Display remaining student
//Sample Input:
//Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78
//Filter threshold: 60
//Expected Output:
//Honor Roll: Amit:85, Rohan:78

import java.util.*;
import java.util.Map.Entry;


class Q16{
	



	public static void main(String[] args){

		Map<String, Integer> students = new HashMap<>();
		
		students.put("Amit",85);
		students.put("Priya", 52);
		students.put("Rohan", 78);
		
//		Set<Entry<String,Integer>> s = students.entrySet();
//		
//		for(Entry<String,Integer> m : s){
//			if(m.getValue()<60){
//				students.remove(m.getKey());
//			}
//		}
//		
//		for(Entry<String,Integer> m : students.entrySet()){
//			System.out.println(m);
//		}
		// Remove directly using removeIf
        students.entrySet().removeIf(m -> m.getValue() < 60);

        for (Map.Entry<String, Integer> m : students.entrySet()) {
            System.out.println(m);
        }
		
	
	}

}
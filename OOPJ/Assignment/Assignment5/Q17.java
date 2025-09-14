//Problem 17: Grade Distribution Counter
//Use Case: Analyze the distribution of grades in a class.
//Requirements:
//● Count frequency of each grade
//● Display grade distribution
//● Handle multiple occurrences
//Sample Input:
//Grades: ["A", "B", "A", "C", "B", "A"]
//Expected Output:
//Grade Distribution: A=3, B=2, C=1

import java.util.*;
import java.util.Map.Entry;


class Q17{
	
	


	public static void main(String[] args){

		Map<String, Integer> grades = new HashMap<>();
		
		String[] grade={"A", "B", "A", "C", "B", "A"};
		
		for(String g: grade){
//			if(grades.containsKey(g)){
//				grades.replace(g, grades.get(g)+1);
//			}else{
//				grades.put(g, 1);
//			}
			grades.put(g, grades.getOrDefault(g, 0)+1);
		}
		
		for(Entry<String,Integer> e : grades.entrySet()){
			System.out.println(e);
		}
		
	
	}

}
//Problem 14: Grade Update System
//Use Case: Update a student's marks in the grading system.
//Requirements:
//● Store student grades
//● Update existing student's marks
//● Display updated information
//Sample Input:
//Initial: "Rohan" → 78
//Update: "Rohan" → 88
//Expected Output:
//Updated Grade: Rohan:88

import java.util.*;


class Q14{
	


	public static void main(String[] args){

		Map<String, Integer> marks = new HashMap<>();
		
		marks.put("Amit", 85);
		marks.put("Rohan", 78);
		marks.put("Priya", 90);
		
		
		Set<String> names = marks.keySet();
		try{
			if(names.contains("Rohan")){
				marks.replace("Rohan",88);
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("No such name in register");
		}
		
		
		for(String name : names){
			System.out.println(name+":"+marks.get(name));
		}
	
	
	
	}

}
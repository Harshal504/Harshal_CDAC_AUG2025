//Problem 3: Daily Task Tracker
//Use Case: A student wants to track their daily tasks and mark completed ones.
//Requirements:
//● Add tasks to the list
//● Mark tasks as completed (remove them)
//● Display remaining tasks
//Sample Input:
//Add tasks: "Study Java", "Complete Assignment", "Exercise"
//Complete task: "Exercise"
//Expected Output:
//Remaining tasks: Study Java, Complete Assignment

import java.util.*;


class Q3{

	public static void main(String[] args){
		Set<String> task = new HashSet<String>();
		
		task.add("Study Java");
		task.add("Complete Assignment");
		task.add("Exercise");
		
		task.remove("Exercise");
		
		for(String t: task){
			System.out.println(t);
		}
	}

}
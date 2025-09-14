//Problem 2: Lab Access Queue System
//Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served system.
//Requirements:
//● Students join the queue for lab access
//● Process students in FIFO order
//● Display remaining queue
//Sample Input:
//Enqueue: "Amit", "Priya", "Rohan"
//Dequeue: 1 student
//Expected Output:
//Queue: Priya, Rohan

import java.util.*;


class Q2{

	public static void main(String[] args){
		Queue<String> student = new PriorityQueue<String>();
		
		student.add("Amit");
		student.add("Priya");
		student.add("Rohan");
		
		student.poll();
		
		for(String s : student){
			System.out.println(s);
		}
	}

}
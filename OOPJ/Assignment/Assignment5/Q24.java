//Problem 24: Print Job Queue Manager
//Use Case: Manage print jobs in a shared printer system.
//Requirements:
//● Queue print jobs
//● Process jobs in order
//● Display job status
//Sample Input:
//Jobs: "Doc1", "Doc2", "Doc3"
//Process: 1 job
//Expected Output:
//Printing Doc1, Queue: Doc2, Doc3

import java.util.*;
import java.util.Map.Entry;


class Q24{

	static <T> void process(Queue<T> jobs){
		System.out.println("Printing: "+ jobs.poll());
		System.out.println("Queue: ");
		jobs.forEach(job -> System.out.println(job));
	}

	public static void main(String[] args){
		Queue<String> jobs =new ArrayDeque<>();
		
		jobs.offer("Doc1");
		jobs.offer("Doc2");
		jobs.offer("Doc3");
		
		
		Q24.process(jobs);
		
		
	
	}

}
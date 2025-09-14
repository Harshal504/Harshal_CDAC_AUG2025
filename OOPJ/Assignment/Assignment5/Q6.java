//Problem 6: Unique Roll Number Validator
//Use Case: A registration system must ensure no duplicate roll numbers are assigned.
//Requirements:
//● Accept roll numbers for registration
//● Automatically remove duplicates
//● Display unique roll numbers
//Sample Input:
//Roll numbers: 101, 102, 101, 103
//Expected Output:
//Unique Roll Numbers: 101, 102, 103

import java.util.*;


class Q6{
	


	public static void main(String[] args){
		Set<Integer> rollno = new TreeSet<Integer>();
		
		rollno.add(101);
		rollno.add(102);
		rollno.add(101);
		rollno.add(103);
		
		for(Integer r : rollno){
			System.out.println(r);
		}
		
		
	}

}
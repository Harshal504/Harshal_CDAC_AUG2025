//Problem 8: Course Registration System
//Use Case: A student registers for courses, ensuring no duplicate course codes.
//Requirements:
//● Register for courses using course codes
//● Prevent duplicate registrations
//● Display registered courses
//Sample Input:
//Course codes: "CS101", "MA101", "CS101"
//Expected Output:
//Registered Courses: CS101, MA101

import java.util.*;


class Q8{
	


	public static void main(String[] args){
		Set<String> courses = new HashSet<String>();
		
		courses.add("CS101");
		courses.add("MA101");
		courses.add("CS101");
		
		for(String course : courses){
			System.out.println(course);
		}
		

		
		
		
	}

}
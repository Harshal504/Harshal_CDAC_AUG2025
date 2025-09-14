//Problem 9: Event Attendance Counter
//Use Case: Count unique attendees at an event, handling duplicate check-ins.
//Requirements:
//● Record attendee names
//● Count only unique attendees
//● Handle duplicate entries
//Sample Input:
//Attendees: "Amit", "Rohan", "Amit", "Priya"
//Expected Output:
//Total unique attendees: 3

import java.util.*;


class Q9{
	
	public static void addAttendees(List<String> attendees, String name){
		attendees.add(name);
		
	}
	
	public static int getuniqueAttendees(List<String> attendees){
		Set<String> u = new HashSet<String>(attendees);
		return u.size();
	}

	public static void main(String[] args){
		List<String> attendees = new ArrayList<String>();
		
		
		Q9.addAttendees(attendees, "Amit");
		Q9.addAttendees(attendees, "Rohan");
		Q9.addAttendees(attendees, "Amit");
		Q9.addAttendees(attendees, "Priya");
		
		
		System.out.println(Q9.getuniqueAttendees(attendees));
		
	
	
	
	
	
	}

}
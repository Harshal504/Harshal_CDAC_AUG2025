//Problem 11: Notification Update
//Scenario: A university notification system needs to update announcements when exam schedules change. The system should efficiently replace old information with new information.
//Task: Use StringBuilder to update notification messages.
//Sample Input:
//Original text: Exam postponed
//Text to find: postponed
//Replacement Text: rescheduled
//Expected Output:
//Exam rescheduled


import java.io.*;
import java.util.*;



class Q11{	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Exam postponed");
		int start = sb.indexOf("postponed");
        int end = start + "postponed".length();
		sb.replace(start, end, "rescheduled");

		System.out.println(sb);


	}
}


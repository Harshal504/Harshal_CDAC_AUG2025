//Exam Attendance Eligibility
//Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as input, print allowance

import java.util.*;


class Q10{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total clases held ");
		int t = sc.nextInt();
		System.out.println("Enter classes attended ");
		int c = sc.nextInt();
		
		System.out.println(c >= (t*0.75) ? "Student is allowed to sit for exam" : "Student is not allowed to sit for exam");
		
		
	}


}
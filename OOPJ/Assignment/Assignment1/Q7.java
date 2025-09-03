//Exam Pass or Fail
//Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed (>=35) or failed
import java.util.*;


class Q7{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks ");
		int marks = sc.nextInt();
		
		System.out.println( marks < 35 ? "Student has failed": "Student has Passed");
		
		
	}


}
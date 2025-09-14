//Problem 9: Marks Validation
//Scenario: An online examination system needs to validate that marks entered by teachers are within valid range (0-100). Negative marks should not be allowed.
//Task: Create a marks validation method that throws an exception for invalid marks.
//Sample Input:
//-5
//Expected Output:
//Invalid marks


import java.io.*;
import java.util.*;

class InvalidMarks extends Exception{
	InvalidMarks(String name){
		super(name+" Invalid marks");
	}
}

class Q9{

	static void validation(String name, int marks){
		try{
			if(marks<0 || marks>100){
				throw new InvalidMarks(name);
			}
			System.out.println("Name: "+name+" Marks: "+marks);
		}catch(InvalidMarks e){
			System.out.println(e.getMessage());
		}
		
	}

	

	public static void main(String[] args) throws Payfailed{
		validation("Harshal", 90);
		validation("rohit", 110);
		validation("milan",40);
	}
}


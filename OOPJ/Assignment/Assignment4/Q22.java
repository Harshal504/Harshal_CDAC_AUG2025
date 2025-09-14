//Problem 22: Student Object Cleanup
//Scenario: A student management system creates student objects during registration. When these objects are no longer needed, the system should clean up resources before garbage collection.
//Task: Override finalize method to demonstrate cleanup during garbage collection.
//Sample Input:
//Student Name: Amit
//Expected Output:
//Student object for Amit is being garbage collected


import java.io.*;
import java.util.*;

class Student{
	public String name;
	Student(String name){
		this.name=name;
	}

	@Override 
	protected void finalize(){
		System.out.println("Student object for "+name+" is being garbage collected");
	}
	
}

class Q22{	

	public static void main(String[] args) throws InterruptedException {
		Student s1=new Student("Harshal");
		
		s1=null;
		
		System.gc();
		 Thread.sleep(1000);
		
		System.out.println("hi");
	}
	
	
}


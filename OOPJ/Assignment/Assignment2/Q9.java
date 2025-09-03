//School Fee System
//Scenario: A school wants to initialize the tuition fee for all students once at program start. Each student has name and class. Use static blocks to set the fee and setters/getters to update/access student information.
//Tasks:
//1. Create a Student class.
//2. Use a static block to initialize tuitionFee to 30000.
//3. Create instance variables: name (String) and className (String).
//4. Create setters and getters for name and className.
//5. Print student details including tuition fee.
import java.util.*;

class Student{
	static int tutionfee;

	static{
		tutionfee = 30000;
	}
	
	String name;
	String className;
	
	Student(){
		
	}
	
	void setname(String name){
		this.name = name;
	}
	void setclassName(String className){
		this.className = className;
	}
	
	String getname(){
		return name;
	}
	
	String getclassName(){
		return className;
	}
	
	

	
	
	
	
}

class Q9{
	public static void main(String args[]){
		
		Student s1 = new Student();
		s1.setname("Harshal");
		s1.setclassName("highersecondary");
		
		
		Student s2 = new Student();
		s2.setname("rohit");
		s2.setclassName("secondary");
		
		System.out.println("School Tuition Fee Initialized: "+ Student.tutionfee);
		System.out.println("Student: " +s1.getname()+" class Name: "+s1.getclassName()+ " Tutionfee: " +s1.tutionfee);


	}
}
//Employee Age Validation
//Scenario: HR wants to ensure employees entered in the system are adults.
//Problem Statement: Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
//Fields:
//● private int age
//Methods:
//● setAge(int age) → if age >=18, set; else show error
//● getAge() → returns age
import java.util.*;

class Employee{
	private int age;
	
	void setAge(int age){
		if(age >= 18){
			this.age = age;
			System.out.println("age updated Successfully");
		}else{
			System.out.println("Error: not valid age");
		}
	}
	
	int getAge(){
		if(age>=18){
			return age;
		}else{
			System.out.print("Age has not been set");
			return 0;
		}
	}


}






class Q3{
	public static void main(String[] args){
		
		Employee e1 = new Employee();
		e1.setAge(21);
		
		Employee e2 = new Employee();
		e2.setAge(17);
		
		Employee e3 = new Employee();
		Employee e5 = new Employee();		
		e3.setAge(18);
		e5.setAge(12);
		
		System.out.println("Employee 1 age :"+ e1.getAge());
		System.out.println("Employee 5 age :"+ e5.getAge());
	

	}
}
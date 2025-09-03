//Employee Salary Manager
//Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees who have worked more than 5 years.
//Requirements:
//1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService (int).
//2. Create static variable totalEmployees to store the number of employees created.
//3. Constructor should initialize all instance variables and increment totalEmployees.
//4. Create getters and setters for all instance variables.
//5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0.
//6. Create a static method showTotalEmployees() to print total employees created.
//7. Write a main class to create 3 employees, print their bonuses, and print total employees.
// import java.util.Scanner;

class Employee{
	String name;
	double salary;
	int yearsofService;
	static int totalEmployees = 0;
	
	Employee(String name, double salary, int yearsofService){
		this.name = name;
		this.salary =salary;
		this.yearsofService = yearsofService;
		totalEmployees++;

	}

	void setname(String name){
		this.name=name;
	}

	String getname(){
		return name;
	}
	void setsalary(double salary){
		this.salary= salary;
	}

	double getsalary(){
		return salary;
	}

	void setyearsofService(int yearsofService){
		this.yearsofService=yearsofService;
	}

	int getyearsofService(){
		return yearsofService;
	}


	double calculateBonus(){
		if(yearsofService>5){
			return (salary*0.05);
		}else{
			return 0;
		}
	}

	static void showTotalEmployees(){
		System.out.println("Total Employees: "+totalEmployees);
	}


	
}

class Q4{
	public static void main(String args[]){
		Employee employee1= new Employee("Ravi", 150000, 40);
		System.out.println(employee1.calculateBonus());

		Employee employee2= new Employee("Harshal", 1200000, 1);
		System.err.println(employee2.calculateBonus());


		Employee employee3 = new Employee("Rohit", 200000, 6);
		System.out.println(employee3.calculateBonus());

		Employee.showTotalEmployees();
	}
}
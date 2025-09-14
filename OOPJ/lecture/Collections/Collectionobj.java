import java.util.*;


class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary){
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString(){
		return "id = "+id+" name= "+name+" salary= "+salary;
	}

}


class Collectionobj{

	public static void main(String[] args){
		Set<Employee> e = new HashSet<Employee>();
		
		e.add(new Employee(1,"Harshal", 20000));
		e.add(new Employee(22,"Rohit", 4000));
		e.add(new Employee(45,"vishwa", 500000));
		
		for(Object obj : e){
			System.out.println(obj);
		}
		
	}
}
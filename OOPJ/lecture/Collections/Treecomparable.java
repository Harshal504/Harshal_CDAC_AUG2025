import java.util.*;


class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary){
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString(){
		return "id = "+id+" name= "+name+" salary= "+salary;
	}
	
	@Override
	public int compareTo(Employee o) {
//		return id - o.id;
//		return salary - o.salary;
		return name.compareTo(o.name);

	}
}


class Treecomparable{

	public static void main(String[] args){
		Set<Employee> e = new TreeSet<Employee>();
		
		e.add(new Employee(1,"Harshal", 20000));
		e.add(new Employee(22,"Rohit", 4000));
		e.add(new Employee(45,"vishwa", 500000));
		e.add(new Employee(46,"Aditya", 500000));

		
		for(Object obj : e){
			System.out.println(obj);
		}
		
	}
}
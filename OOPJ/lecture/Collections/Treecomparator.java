import java.util.*;


class Employee{
	protected int id;
	protected String name;
	protected int salary;
	
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
	

}

class Employeecompare implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2){
		return o1.id - o2.id;
	}
}

class Employeecompare1 implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2){
		return o1.salary - o2.salary;
	}
}


class Treecomparator{

	public static void main(String[] args){
		Set<Employee> e = new TreeSet<Employee>(new Employeecompare());
		
		e.add(new Employee(1,"Harshal", 20000));
		e.add(new Employee(22,"Rohit", 4000));
		e.add(new Employee(45,"vishwa", 500000));
		e.add(new Employee(46,"Aditya", 500010));

		
		for(Object obj : e){
			System.out.println(obj);
		}
		
		
		
		Set<Employee> e1 = new TreeSet<Employee>(new Employeecompare1());
		
		e1.add(new Employee(1,"Harshal", 20000));
		e1.add(new Employee(22,"Rohit", 4000));
		e1.add(new Employee(45,"vishwa", 500000));
		e1.add(new Employee(46,"Aditya", 500010));

		
		for(Object obj : e){
			System.out.println(obj);
		}
		
	}
}
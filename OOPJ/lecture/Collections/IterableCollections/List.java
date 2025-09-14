
import java.util.*;

class Collections{	

	public static void main(String[] args) {
	List a = new ArrayList();
	List l = new LinkedList();
	List v = new Vector();

	
	System.out.println("==========================================");
	System.out.println("Arraylist");
	a.add(1);
	a.add(2);
	a.add(3);
	a.add("Harshal");
	a.add("Rohit");
	a.add("Vishnu");
	
	for(Object o : a){
		System.out.println(o);
	}
	
	
	
	
	
	
	System.out.println("==========================================");
	System.out.println("Linkedlist");
	l.add(1);
	l.add(2);
	l.add(3);
	l.add("Harshal");
	l.add("Rohit");
	l.add("Vishnu");
	for(Object o : l){
		System.out.println(o);
	}
	
	
	
	
	System.out.println("==========================================");
	System.out.println("Vector");
	v.add(1);
	v.add(2);
	v.add(3);
	v.add("Harshal");
	v.add("Rohit");
	v.add("Vishnu");
	for(Object o : v){
		System.out.println(o);
	}
	
	
	
	

	}



	}
	
	
}


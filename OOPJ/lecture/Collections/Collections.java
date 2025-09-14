
import java.util.*;

class Collections{	

	public static void main(String[] args) {
	Collection a = new ArrayList();
	Collection l = new LinkedList();
	Collection v = new Vector();
	
	Collection q = new PriorityQueue();
	
	Collection h = new HashSet();
	Collection lh = new LinkedHashSet();
	
	Collection t = new TreeSet();
	
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
	
	
	
	
	System.out.println("==========================================");
	System.out.println("PriorityQueue");
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	q.add(6);
	for(Object o : q){
		System.out.println(o);
	}
	
	
	
	
	System.out.println("==========================================");
	System.out.println("HashSet");
	h.add(1);
	h.add(2);
	h.add(3);
	h.add("Harshal");
	h.add("Rohit");
	h.add("Vishnu");
	for(Object o : h){
		System.out.println(o);
	}
	
	
	
	
	
	System.out.println("==========================================");
	System.out.println("LinkedHashSet");
	lh.add(1);
	lh.add(2);
	lh.add(3);
	lh.add("Harshal");
	lh.add("Rohit");
	lh.add("Vishnu");
	for(Object o : lh){
		System.out.println(o);
	}
	
	
	
	
	System.out.println("==========================================");
	System.out.println("TreeSet");
//	t.add(1);
//	t.add(2);
//	t.add(3);
	t.add("Harshal");
	t.add("Rohit");
	t.add("Vishnu");
	for(Object o : t){
		System.out.println(o);
	}



	}
	
	
}


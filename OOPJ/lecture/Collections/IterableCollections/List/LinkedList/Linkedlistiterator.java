
import java.util.*;

class Linkedlistiterator{	

	public static void main(String[] args) {
	LinkedList a = new LinkedList();
	LinkedList<Integer> a1 = new LinkedList<>();




	
	System.out.println("==========================================");
	System.out.println("Linkedlist1");
	a.add(1);
	a.add(2);
	a.add(3);
	a.add("Harshal");
	a.add("Rohit");
	a.add("Vishnu");
	
//	for(Object o : a){
//		System.out.println(o);
//	}
//	
//
//	Iterator<Object> iterator = a.iterator();
//	
//	while(iterator.hasNext()){
//		System.out.println(iterator.next());
//	}
	
	
//	To use has previous we have to set index the default index is 0
//	ListIterator<Object> literator = a.listIterator(a.size());
//	
//	while(literator.hasPrevious()){
//		System.out.println(literator.previous());
//	}
	
	ListIterator<Object> literator = a.listIterator();
	
	while(literator.hasNext()){
		Object obj = literator.next();
		if(obj != "Rohit"){
			System.out.println(obj);
		}else{break;}
	}
	while(literator.hasPrevious()){
		System.out.println(literator.previous());
	}
	
	
	
	


	}
	
	
}


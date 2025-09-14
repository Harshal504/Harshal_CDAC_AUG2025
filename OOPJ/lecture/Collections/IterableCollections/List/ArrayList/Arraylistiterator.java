
import java.util.*;

class Arraylistiterator{	

	public static void main(String[] args) {
	ArrayList a = new ArrayList();
	ArrayList<Integer> a1 = new ArrayList<>();


	
	System.out.println("==========================================");
	System.out.println("Arraylist1");
	a.add(1);
	a.add(2);
	a.add(3);
	a.add("Harshal");
	a.add("Rohit");
	a.add("Vishnu");
	
	
	Iterator<Object> iterator = a.iterator();
	
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
	
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


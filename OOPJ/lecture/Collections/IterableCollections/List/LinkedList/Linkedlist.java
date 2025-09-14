
import java.util.*;

class Linkedlist{	

	public static void main(String[] args) {
	LinkedList a = new LinkedList();
	LinkedList<Integer> a1 = new LinkedList<>();
	LinkedList<Object> a2 = new LinkedList<>();
	



	
	System.out.println("==========================================");
	System.out.println("Linkedlist1");
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
	System.out.println("Linkedlist2");
	a1.add(11);
	a1.add(22);
	a1.add(33);

	for(Object o : a1){
		System.out.println(o);
	}	
	
//	System.out.println("==========================================");
//	System.out.println(" the item at 2nd position in Linkedlist a: "+ a.get(1));
//	
//	
//	System.out.println("==========================================");
//	System.out.println("Get the index of Harshal from the list a:"+a.indexOf("Harshal"));
//	
//	System.out.println("==========================================");
//	System.out.println("Remove Harshal from the list a:"+a.indexOf("Harshal"));
//	a.remove("Harshal");
//	
//	for(Object o : a){
//		System.out.println(o);
//	}
//	
//	
//	System.out.println("==========================================");
//	System.out.println("Add Harshal in the list a at 3rd position");
//	a.add(3, "Harshal");
//	
//	for(Object o : a){
//		System.out.println(o);
//	}
	
	System.out.println("==========================================");
	System.out.println("Add First in the first place and Add Last in last place");
	a.addFirst("First");
	a.addLast("Last");
	
	for(Object o : a){
		System.out.println(o);
	}
	
	
	for(Object o : a){
		System.out.println(o);
	}
//	System.out.println("==========================================");
//	System.out.println("get First in the first place, get element in 3rd and get Last in last place But if empty it will throwh errorNoSuchElementException");
//	System.out.println(a.getFirst());
//	System.out.println(a.get(3));
//	System.out.println(a.getLast());
//	
//	System.out.println("==========================================");
//	System.out.println("Peek First in the first place, and peek Last in last place But if empty it will give Null");
//	System.out.println(a1.peekFirst());
//	System.out.println(a1.peek());
//	System.out.println(a2.peek());
//	System.out.println(a2.peekLast());
//
//
//	System.out.println("==========================================");
//	System.out.println("Retrive and remove poll First in the first place, and poll Last in last place But if empty it will give Null");
//	System.out.println(a.pollFirst());
//	System.out.println(a1.poll());
//	System.out.println(a2.pollLast());
//	System.out.println("==========================================");
//	for(Object o : a){
//		System.out.println(o);
//	}
	
	
//	System.out.println("==========================================");
//	System.out.println("Check if array contains Rohit then print yes it is there");
//	
//	if(a.contains("Rohit")){
//		System.out.println("yes it contains rohit");
//	}
//	if(a.isEmpty()){
//		System.out.println("yes it is empty");
//	}else{
//		System.out.println(" it is not empty");
//	}
//	
//	
//	System.out.println("==========================================");
//	System.out.println("Change the name at position of name Rohit to ravi");
//	a.set(a.indexOf("Rohit"), "Ravi");
//	
//	for(Object o : a){
//		System.out.println(o);
//	}
//	
//	
//	System.out.println("==========================================");
//	System.out.println("add all the items from a1 list to a list and then print using for each");
//	
//	a.addAll(a1);
//	
//	a.forEach(obj -> System.out.println(obj));
	
	
	
	
	
	
	


	}
	
	
}


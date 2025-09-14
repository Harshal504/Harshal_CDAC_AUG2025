
import java.util.*;

class Arraylist{	

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
	
	for(Object o : a){
		System.out.println(o);
	}
	
	System.out.println("==========================================");
	System.out.println("Arraylist2");
	a1.add(11);
	a1.add(22);
	a1.add(33);

	for(Object o : a1){
		System.out.println(o);
	}	
	
	System.out.println("==========================================");
	System.out.println(" the item at 2nd position in Arraylist a: "+ a.get(1));
	
	
	System.out.println("==========================================");
	System.out.println("Get the index of Harshal from the list a:"+a.indexOf("Harshal"));
	
	System.out.println("==========================================");
	System.out.println("Remove Harshal from the list a:"+a.indexOf("Harshal"));
	a.remove("Harshal");
	
	for(Object o : a){
		System.out.println(o);
	}
	
	
	System.out.println("==========================================");
	System.out.println("Add Harshal in the list a at 3rd position");
	a.add(3, "Harshal");
	
	for(Object o : a){
		System.out.println(o);
	}
	
	
	System.out.println("==========================================");
	System.out.println("Check if array contains Rohit then print yes it is there");
	
	if(a.contains("Rohit")){
		System.out.println("yes it contains rohit");
	}
	if(a.isEmpty()){
		System.out.println("yes it is empty");
	}else{
		System.out.println(" it is not empty");
	}
	
	
	System.out.println("==========================================");
	System.out.println("Change the name at position of name Rohit to ravi");
	a.set(a.indexOf("Rohit"), "Ravi");
	
	for(Object o : a){
		System.out.println(o);
	}
	
	
	System.out.println("==========================================");
	System.out.println("add all the items from a1 list to a list and then print using for each");
	
	a.addAll(a1);
	
	a.forEach(obj -> System.out.println(obj));
	
	
	
	
	
	
	


	}
	
	
}


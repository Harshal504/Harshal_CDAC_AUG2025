import java.util.*;

class Treeset{

	public static void main(String[] args){
		
		Set h = new TreeSet();
		
//		h.add(1);
//		h.add(2);
//		h.add(3);
		h.add("Harshal");
		h.add("Rohit");
		
		for(Object obj : h){
			System.out.println(obj);
		}
		
	}
}
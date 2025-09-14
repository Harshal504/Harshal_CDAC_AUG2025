import java.util.*;


class Treemap{

	public static void main(String[] args){
		TreeMap<Integer, String> hm = new TreeMap<>();
		
		hm.put(1,"Harshal");
		hm.put(73,"Rohit");
		hm.put(22,"Vishwa");
		
		Set<Map.Entry<Integer, String>> s = hm.entrySet();
		hm.put(34,"milan");
//		for(Map.Entry<Integer, String> a1 : s) {
//			System.out.println(a1);
//			System.out.println(a1.getKey());
//			System.out.println(a1.getValue());
//
//		}
		
//		Iterator<Map.Entry<Integer, String>> it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		System.out.println(hm.get(22));
//		System.out.println(it.next());
		
	}
}
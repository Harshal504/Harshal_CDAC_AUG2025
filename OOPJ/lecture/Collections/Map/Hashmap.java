import java.util.*;


class Hashmap{

	public static void main(String[] args){
		HashMap<Integer, String> hm = new HashMap<>();
//		HashMap<K,V>
		
		hm.put(1,"Harshal");
		hm.put(73,"Rohit");
		hm.put(22,"Vishwa");
		hm.put(34,"milan");

//		System.out.println(hm.get(22));
//		
//		Set<Integer> k = hm.keySet();
//		System.out.println(k);
//
//		Collection<String> st = hm.values();
//		System.out.println(st);
//
//		
//		for(Integer i : k){
//			System.out.println(i+" -> "+hm.get(i));
//			
//		}

		
		
		Set<Map.Entry<Integer, String>> s = hm.entrySet();
//		
//		hm.put(34,"milan");
//		for(Map.Entry<Integer, String> a1 : s) {
//			System.out.println(a1);
//			System.out.println(a1.getKey());
//			System.out.println(a1.getValue());
//
//		}
		
		Iterator<Map.Entry<Integer, String>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//		
//		for(String n : st){
//			System.out.println(n);
//		}
//		
//		
		
		
	}
}
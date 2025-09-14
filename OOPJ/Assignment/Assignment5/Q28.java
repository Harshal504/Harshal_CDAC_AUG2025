//Problem 28: Department Employee Mapping
//Use Case: Organize employees by department for HR management.
//Requirements:
//● Map departments to employee lists
//● Group employees by department
//● Display departmental structure
//Sample Input:
//Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"]
//Expected Output:
//Department Structure: IT: Amit, Rohan; HR: Priya

import java.util.*;
import java.util.Map.Entry;




class Q28{



	public static void main(String[] args){
		List<String> elist1 = new ArrayList<>();
		
		elist1.add("Amit");
		elist1.add("Rohan");
		
		List<String> elist2 = new ArrayList<>();
		elist2.add("Priya");
		
		Map<String,List<String>> deptlist = new HashMap<>();
		deptlist.put("IT", elist1);
		deptlist.put("HR", elist2);
		
		Set<String> dept = deptlist.keySet();
		for(String k : dept){
			System.out.print(k+": ");
//			String[] n = deptlist.get(k);
			System.out.print(String.join(",", deptlist.get(k) ));
//			for(String n : deptlist.get(k)){
//				System.out.print(n+" ");
//			}
			System.out.println();
		}
//		System.out.println(deptlist);
		
		
	}

}
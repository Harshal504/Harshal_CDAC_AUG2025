//Problem 20: Even Roll Number Filter
//Use Case: Filter and display only students with even roll numbers.
//Requirements:
//● Process list of roll numbers
//● Remove odd roll numbers
//● Display filtered results
//Sample Input:
//Roll numbers: 101, 102, 103, 104
//Expected Output:
//Even Roll Numbers: 102, 104

import java.util.*;
import java.util.Map.Entry;


class Q20{
	
	


	public static void main(String[] args){

		List<Integer> rollNo = new ArrayList<Integer>();
		
		rollNo.add(101);
		rollNo.add(102);
		rollNo.add(103);
		rollNo.add(104);
		
		
		Iterator<Integer> it = rollNo.iterator();
		
//		while(it.hasNext()){
//			int i = it.next();
//			if(i%2!=0){
//				it.remove();
//			}
//			
//		}

		rollNo.removeIf(n -> n%2!=0);
		
		System.out.println(rollNo);
		
		
		
		
		
	
	}

}
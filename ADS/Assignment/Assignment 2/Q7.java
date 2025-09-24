//Search for an element in the array (linear search).
//Testcase1:
//Input: [10, 20, 30, 40, 50], Search Element: 30
//Expected Output: Element found at index 2


import java.util.*;
import java.lang.*;

class Q7{
	static int n;
	static int evenCount;

	static void search(int[] a, int i,int key){
		if(a[i]==key){
			System.out.println("Element found at index "+ i);
		}else{
			search(a,i+1,key);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 31, 40, 50, 60};
		n = a.length;
		
		search(a,0,31);
		
        }
}
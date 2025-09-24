//Find the second largest element in the array.
//Testcase:
//Input: [10, 20, 30, 40, 50]
//Expected Output: 40


import java.util.*;
import java.lang.*;

class Q10{
	static int n;

	static void descendingSort(int[] a){
		for(int j=0; j<n; j++){
		for(int i=0; i<n-1; i++){
			if(a[i]<a[i+1]){
				int t = a[i];
				a[i] = a[i+1];
				a[i+1] = t;
			}
		}}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 31, 40,31,20, 50, 60};
		n = a.length;
		
		descendingSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);		
        }
}
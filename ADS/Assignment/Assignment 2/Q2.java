//Find the minimum element in an array.
//Testcases1:
//Input: [15, 8, 22, 5, 19]
//Expected Output: 5
//Testcase2:
//Input: [-4, -15, -7, -2, -30]
//Expected Output: -30
import java.util.*;
import java.lang.*;

class Q2{
	static int min;
	static int n;
	
	static void findMin(int[] a, int i){
		
		if(a[i]<min){
			min=a[i];
		}
		if(i==n-1){
			return;
		}
		
		findMin(a, i+1);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {15, 8, 22, 5, 19};
		min = a[0];
		n = a.length;
		findMin(a,1);
		
		System.out.println(min);
	}
}
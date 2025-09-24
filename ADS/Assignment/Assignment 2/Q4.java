//4. Find the average of array elements
//Testcase1:
//Input: [10, 20, 30, 40, 50]
//Expected Output: 30.0
//Testcase2:
//Input: [-5, 10, 15, -10, 5]
//Expected Output: 3.0


import java.util.*;
import java.lang.*;

class Q4{
	static double sum;
	static int n;
	
	static void findSum(int[] a, int i){
		sum += a[i];
		if(i==n-1){
			return;
		}
		findSum(a, i+1);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 30, 40, 50};
//		min = a[0];
		sum = 0;
		n = a.length;
		findSum(a,0);
		
		System.out.println(sum/n);
	}
}
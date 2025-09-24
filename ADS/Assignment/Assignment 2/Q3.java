//Calculate the sum of all array elements. Solve this problem using iterative and recursion method
//Testcase1:
//Input: [1, 2, 3, 4, 5]
//Expected Output: 15
//Testcase2:
//Input: [-1, 2, -3, 4, -5]
//Expected Output: -3


import java.util.*;
import java.lang.*;

class Q3{
	static int sum;
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
		
		int [] a = {-1, 2, -3, 4, -5};
//		min = a[0];
		sum = 0;
		n = a.length;
		findSum(a,0);
		
		System.out.println(sum);
	}
}
//1. Find the maximum element in an array. Solve this problem using iterative and recursion method
//Testcase1:
//Input: [10, 25, 47, 3, 19]
//Expected Output: 47
//Testcase2:
//Input: [-5, -10, -3, -20, -7]
//Expected Output: -3
import java.util.*;
import java.lang.*;

class Q1{
	static int max;
	static int n;
	
	static void findMax(int[] a, int i){
		
		if(a[i]>max){
			max=a[i];
		}
		if(i==n-1){
			return;
		}
		
		findMax(a, i+1);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 25, 47, 3, 19};
		max = a[0];
		n = a.length;
		findMax(a,1);
		
		System.out.println(max);
	}
}
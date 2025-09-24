//Print array elements in reverse order.
//Testcase1:
//Input: [1, 2, 3, 4, 5]
//Expected Output: [5, 4, 3, 2, 1]
//Testcase2:
//Input: [-1, 2, -3, 4, -5]
//Expected Output: [-5, 4, -3, 2, -1]


import java.util.*;
import java.lang.*;

class Q5{
	static int n;
	
	static void findReverse(int[] a, int i){
		
		if(i < n/2){
			int t = a[i];
			a[i]= a[n-1-i];
			a[n-1-i] = t;
			findReverse(a, i+1);
		}
		
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 30, 40, 50, 60};
//		min = a[0];

		n = a.length;
		findReverse(a,0);
        System.out.println(Arrays.toString(a));	
        }
}
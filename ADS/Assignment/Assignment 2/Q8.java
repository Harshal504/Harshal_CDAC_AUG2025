//Copy elements of one array into another.
//Testcase:
//Input: Source Array: [1, 2, 3, 4, 5]
//Expected Output: Destination Array: [1, 2, 3, 4, 5]


import java.util.*;
import java.lang.*;

class Q8{
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 31, 40, 50, 60};
		n = a.length;
		
		int[] b =new int[n];
		
		for(int i=0; i<n; i++){
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
        }
}
//Count even and odd elements in an array.
//Testcase1:
//Input: [1, 2, 3, 4, 5, 6]
//Expected Output: Even: 3, Odd: 3
//Input: [2, 4, 6, 8]
//Expected Output: Even: 4, Odd: 0


import java.util.*;
import java.lang.*;

class Q6{
	static int n;
	static int evenCount;
	static int oddCount;
	
	static void findEvenOdd(int[] a, int i){
		if(i==n){
			return;
		}
		
		if(a[i]%2==0){
			evenCount++;
		}else{
			oddCount++;
		}

		findEvenOdd(a,i+1);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 31, 40, 50, 60};
		n = a.length;
		
		evenCount = 0;
		oddCount = 0;
		findEvenOdd(a,0);
        System.out.println(evenCount+" "+oddCount);	
        }
}
//Display duplicate elements from an array.
//Testcase1:
//Input: [1, 2, 3, 4, 2, 5, 1]
//Expected Output: 1, 2
//Testcase2:
//Input: [10, 20, 30, 40, 50]
//Expected Output: No duplicates found


import java.util.*;
import java.lang.*;

class Q9{
	static int n;
	static int[] t;
	static int k = 0;
	static void findDuplicates(int[] a, int i){
		if(i==n){
			return;
		}
		boolean verify = false;
		for(int j= i+1; j<n; j++){
			if(a[i]==a[j]){
				verify = true;
			}
		}
		if(verify){
        	boolean alreadyStored = false;
            for (int x = 0; x < k; x++) {
                if (t[x] == a[i]) {
                    alreadyStored = true;
                    break;
                }
            }
            if (!alreadyStored) {
                t[k] = a[i];
                k++;
            }
		}
		
		findDuplicates(a,i+1);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] a = {10, 20, 31, 40,31,20, 50, 60};
		n = a.length;
		t= new int[n];
		findDuplicates(a,0);
//		System.out.println(Arrays.toString(t));
		if (k == 0) {
            System.out.println("No duplicates found");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.print(t[i] + (i < k - 1 ? ", " : ""));
            }
        }
		
        }
}
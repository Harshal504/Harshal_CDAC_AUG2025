//Replace all 0’s with 1 in a given integer


import java.util.Scanner;
import java.lang.Math;

class Q44{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		int n1 = sc.nextInt();
		String s = Integer.toString(n1);
		int len = s.length();
		
		for(int i=0; i<=len; i++){
			if(s.charAt(i)=='0'){
				s.setCharAt(i)='1';
			}
		}
		
		System.out.println(s);
		
	}

}
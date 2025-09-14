//Permutations in which n people can occupy r seats in a classroom n!/(n-r)!



import java.util.Scanner;
import java.lang.Math;

class Q41{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of students n and seats r");
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int perm =1;
		for(int i=0; i<=n-r; i++){
			perm *= (n-i);
		}
		System.out.println(perm);
	}

}
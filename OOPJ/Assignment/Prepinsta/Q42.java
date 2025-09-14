//Maximum number of handshakes if n people n(n-1)/2



import java.util.Scanner;
import java.lang.Math;

class Q42{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of people");
		
		int n = sc.nextInt();

		System.out.println((n*(n-1))/2);
	}

}
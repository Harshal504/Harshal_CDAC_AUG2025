//Perfect Square


import java.util.Scanner;
import java.lang.Math;

class Q24{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();	
//		int temp = 0;
		
		for(int i=1; i<=num/2; i++){
			if(num==i*i){
				System.out.println("it is a perfect Square");		
				break;
			}
		}


		
	}

}
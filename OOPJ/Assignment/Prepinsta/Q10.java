//Prime number within a given range

import java.util.Scanner;
import java.lang.Math;

class Q10{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number range");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
	
		for(int j =num1; j<=num2; j++)
			if(j>=2){
				int count=0;
				for(int i=2; i<=Math.sqrt(j); i++){
					if(j%i==0){
						count++;
					}

				}
				if(count==0){
						System.out.print(j+"\t");
						}
			}


		
	}

}
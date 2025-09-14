//Binary to Decimal to conversion


import java.util.Scanner;
import java.lang.Math;

class Q32{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		
		int num = sc.nextInt();
//		System.out.println(num);
		int len = Integer.toString(num).length();
		int temp=num;
		int dec =0;
		for(int i=0; i<len; i++){
			if(temp%10==1){
				dec += Math.pow(2,i);
			}
			temp /=10;
		}
		System.out.println(dec);
	
	
	
	
	}

}
//Hexadecimal to Decimal to conversion Follow the steps given below:

//At the time of extracting digits from the hexadecimal number, multiply the digit with the proper base (Power of 16) and add it to the above variable taken that is 'dec_value'. 
//In the end, the variable 'dec_value' will store the required decimal number
//65-90 for uppercase letters (A-Z), 97-122 for lowercase letters (a-z), and 48-57 for digits (0-9).
// for integer -48, for A-F - 55


import java.util.Scanner;
import java.lang.Math;

class Q34{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		String Hex = sc.next();
//		System.out.println(num);
		int len = Hex.length();
//		int temp=num;
		int dec =0;
		int base = 1;
		for(int i=len-1; i>=0; i--){
			if(Hex.charAt(i)>='0' && Hex.charAt(i)<='9'){
				dec +=(Hex.charAt(i)-48) * base;
				base=base*16;
			}else
			
			if(Hex.charAt(i)>='A' && Hex.charAt(i)<='F'){
				dec +=(Hex.charAt(i)-55) * base;
				base=base*16;
			}		}
		
		

		System.out.println(dec);
	
	
	
	
	}

}
//Positive, Negative, or Zero (Ternary)
//Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator

import java.util.*;


class Q31 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n1 = sc.nextInt();

        
        System.out.println(n1 > 0 ? "Number is positive": n1< 0 ? "Number is negative": "number is zero");
 
    }    
        
  
}
//Greatest of Two Numbers (Ternary)
//Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest using a ternary operator.

import java.util.*;


class Q31 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first no");
        int n1 = sc.nextInt();
        System.out.println("Enter the second no");
        int n2 = sc.nextInt();
        
        System.out.println(n1>n2 ? "Greatest no "+ n1: "Gretest no "+ n2);
 
    }    
        
  
}
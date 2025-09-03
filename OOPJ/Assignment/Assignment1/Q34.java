//Voting Eligibility (Ternary)
//Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operato

import java.util.*;


class Q34 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter age");
        int a = sc.nextInt();

        
        System.out.println(a >= 18 ? "Eligible to vote": "Not eligible to vote");
 
    }    
        
  
}
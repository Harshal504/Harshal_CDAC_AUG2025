//Pass/Fail Check (Ternary)
//Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).

import java.util.*;


class Q35 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Marks");
        int m = sc.nextInt();

        
        System.out.println(m >= 35 ? "Pass": "Fail");
 
    }    
        
  
}
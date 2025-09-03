//Even or Odd (Ternary)
//Scenario: Take a number and check if it is even or odd using ternary operator.

import java.util.*;


class Q31 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n1 = sc.nextInt();

        
        System.out.println(n1 == 0 ? "Number is zero": n1%2 == 0 ? "Number is Even": "number is Odd");
 
    }    
        
  
}
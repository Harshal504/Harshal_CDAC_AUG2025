//Message Based on Number (1–5) 
//Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu selection.

import java.util.*;


class Q25 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        switch(m){
            case 1:
                System.out.println("you selected option 1");
                break;
            case 2:
                System.out.println("you selected option 2");
                break;
            case 3:
                System.out.println("you selected option 3");
                break;
            case 4:
                System.out.println("you selected option 4");
                break;
            case 5:
                System.out.println("you selected option 5");
                break;
            default:
                System.out.println("not in menu");
                
            
        }        
    }    
        
  
}
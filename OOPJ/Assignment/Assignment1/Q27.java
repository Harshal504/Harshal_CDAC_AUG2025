//Print Message Based on Character (A–E)
//Scenario: Take a character (A–E) and print a specific message using switch-case.

import java.util.*;


class Q26 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Charcter between A-E");
        char c = sc.next.charAt();
        
        
        switch(c){
            case 'A':
                System.out.println("You selected option A");
                break;
            case 'B':
                System.out.println("You selected option B");
                break;
            case 'C':
                System.out.println("You selected option C");
                break;
            case 'D':
                System.out.println("You selected option D");
                break;
            case 'E':
                System.out.println("You selected option E");
                break;
            default:
                System.out.println("invalid option");
                
            
        }        
    }    
        
  
}
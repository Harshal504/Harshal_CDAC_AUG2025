//Season Based on Month
//Scenario: Print season based on month number:

import java.util.*;


class Q26 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter month number");
        int n = sc.nextInt();
        
        switch(m){
            case 1:
            case 2:
            case 12:
                System.out.println("Season is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season is Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season is Monsoon");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season is Autum");
                break;
            default:
                System.out.println("invalid month no");
                
            
        }        
    }    
        
  
}
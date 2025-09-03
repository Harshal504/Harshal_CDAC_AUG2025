//Grades using Swich
// Take marks 1-100 and use switch case grouping

import java.util.*;


class Q24 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks");
        int m = sc.nextInt();
        
        switch(m){
            case 100:
            case 99:
            case 90:
                System.out.println("Grade A+");
                break;
            case 20:
            case 30:
            case 40:
            case 50:
                System.out.println("Grade B");
                break;
            default:
                
            
        }        
    }    
        
  
}
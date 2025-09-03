//Month Name from Number
//Scenario: Take month number (1–12) and print the month name using ternary operators or if-else
import java.util.*;


class Q22 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter month number");
        int m = sc.nextInt();
        
        System.out.println( 
        m == 1 ? "Month is January":
        m == 2 ? "Month is Feb":
        m == 3 ? "Month is March":
        m == 4 ? "Month is April":
        m == 5 ? "Month is May":
        m == 6 ? "Month is june":
        m == 7 ? "Month is july":
        m == 8 ? "Month is august":
        m == 9 ? "Month is september":
        m == 10 ? "Month is oct":
        m == 11 ? "Month is nov":
        m == 12 ? "Month is dec":        
        "no such month number"
                            
        );
        
        sc.close();
    }
    
        
  
}
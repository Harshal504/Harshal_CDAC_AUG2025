//Day of the Week (Ternary)
//Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
import java.util.*;


class Q21 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter week number");
        int w = sc.nextInt();
        
        System.out.println( 
        w == 1 ? "Day is Monday":
        w == 2 ? "Day is Tuesday":
        w == 3 ? "Day is Wednesday":
        w == 4 ? "Day is Thursday":
        w == 5 ? "Day is Friday":
        w == 6 ? "Day is Saturday":
        w == 7 ? "Day is Sunday":
        "no such week number"
                            
        );
        
        sc.close();
    }
    
        
  
}
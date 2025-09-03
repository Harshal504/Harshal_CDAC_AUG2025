//Divisibility Check
//Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else
import java.util.*;


class Q17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        if (n%2 == 0){
          System.out.println("Divisible by 2");
        }  // continue;
        if(n%3 == 0){
            System.out.println("Divisible by 3");
        }  // continue;
        if(n%5 == 0){
            System.out.println("Divisible by 5");
        }
                        
        sc.close();
        

    }
}
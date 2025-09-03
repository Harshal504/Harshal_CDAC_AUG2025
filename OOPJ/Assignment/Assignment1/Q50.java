//Divisibility by 2, 3, 5 with Custom Messages
//Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.
import java.util.*;


class Q50 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check for divisibility by 2
        if (n % 2 == 0) {
            System.out.println("The number is divisible by 2.");
        }

        // Check for divisibility by 3
        if (n % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        }

        // Check for divisibility by 5
        if (n % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        }}
}
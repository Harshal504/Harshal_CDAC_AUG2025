//Reverse a 4-Digit Number
//Scenario: Take a 4-digit number and print its reverse
import java.util.*;


class Q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4-digit number: ");
        int n = sc.nextInt();
        
        int reversed = 0;
        
        while(n !=0 ){
            int temp = n%10;
            reversed = (reversed*10) + temp;
            n /= 10;
        }
        
        System.out.println("Reversed number : " + reversed);
        
        sc.close();
        

    }
}
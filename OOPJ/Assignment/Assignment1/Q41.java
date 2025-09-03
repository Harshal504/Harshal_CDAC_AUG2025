//Check Armstrong Number (3-Digit)
//Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = number
import java.util.*;


class Q41 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int arm = sc.nextInt();
        int a = 0;
        int ar =arm;
        while(ar > 0){
            int d = ar%10;
            a += (d*d*d);
            ar = ar/10;
        }
        
        System.out.println(arm == a? arm + " is an Armstrong number ": "It is not an armstrong number");
    }
        
  
}
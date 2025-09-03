//Reverse 4-Digit Number and Palindrome Check
//Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome
import java.util.*;


class Q44 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int ar = sc.nextInt();
        int a =0;
        int arm =ar;
        while(arm >0){
            a = (a*10)+(arm%10);
            arm /= 10;
        }
        
        System.out.println("reversed" + a);
        System.out.println(ar == a ? "Palindrome yes": "palindrome no");
        
        }
        
  
}
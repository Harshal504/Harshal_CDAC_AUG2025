//Sum of Digits of a Number
//Scenario: Take a number as input and print the sum of its digits
import java.util.*;


class Q42 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int arm = sc.nextInt();
        int a =0;
        while(arm >0){
            a += arm%10;
            arm /= 10;
        }
        
        System.out.println("sum" + a);
        
        }
        
  
}
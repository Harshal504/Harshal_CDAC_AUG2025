//Reverse 4-Digit Number and Palindrome Check
//Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome
import java.util.*;


class Q45 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if(n1<n2 && n1< n3){
            if(n2<n3){
                System.out.println("Ascending Order: " + n1+"," + n2+"," + n3);
            }else{
                System.out.println("Ascending Order: " + n1+"," + n3+"," + n2);
            }
        }else if(n2<n1 && n2< n3){
            if(n1<n3){
                System.out.println("Ascending Order: " + n2+"," + n1+"," + n3);
            }else{
                System.out.println("Ascending Order: " + n2+"," + n3+"," + n1);
            }
        }else if(n3<n1 && n3< n2){
            if(n2<n1){
                System.out.println("Ascending Order: " + n3+"," + n2+"," + n1);
            }else{
                System.out.println("Ascending Order: " + n3+"," + n1+"," + n2);
            }
        }
        
        
        
        }
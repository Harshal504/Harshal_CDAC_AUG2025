//Vowel or Consonant Checker
//Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.
import java.util.*;


class Q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        char c = Character.toLowerCase(ch);
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            System.out.println("It is Vowel");
        }else{
            System.out.println("It is Constant");
        }
                
        sc.close();
        

    }
}
//Even/Odd Status of Two Numbers
//Scenario: Take two numbers and print if both are even, both odd, or mixed.
import java.util.*;


class Q47 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = sc.nextInt();
        
        if (n1%2 == 0){
            if(n2%2 == 0){
                System.out.println("Both even");
            }else{
                System.out.println("Numbers are mixed: (one even, one odd)");
            }
        }else if (n2%2 == 0){
            if(n1%2 == 0){
                System.out.println("Both even");
            }else{
                System.out.println("Numbers are mixed: (one odd, one even)");
            }
        }else{
            System.out.println("Both odd");
        }

                
        
        }
}
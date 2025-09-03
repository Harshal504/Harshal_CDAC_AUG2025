//Basic Calculator Using Switch-Case
//Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result
import java.util.*;


class Q23 {

    pulic static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
        
        switch(op){
            case(+):
                System.out.println("Result : " + (n1+n2));
                break;
            case(-):
                System.out.println("Result : " + (n1 - n2));
                break;
            case(*):
                System.out.println("Result : " + (n1*n2));
                break;
            case(/):
                System.out.println("Result : " + (n1 /n2));
                break;
            default:
                System.out.println("sorry no operation available for the operator " + op);
            
        }
        
    }    
        
  
}
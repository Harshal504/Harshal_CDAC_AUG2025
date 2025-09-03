//Basic calculatior using if-else
//Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using nested if-else.
import java.util.*;


class Q20 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int n2 = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
        
        if(op == '+'){
            System.out.println("Result : " + (n1+n2));
        }else if(op == '-'){
            System.out.println("Result : " + (n1-n2));
        }else if(op == '*'){
            System.out.println("Result : " + (n1*n2));
        }else if(op == '/'){
            System.out.println("Result : " + (n1/n2));
        }
        sc.close();
    }
    
        
  
}
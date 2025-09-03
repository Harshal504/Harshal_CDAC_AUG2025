//Smallest of Three Numbers (Nested Ternary)
//Scenario: Take three numbers as input and print the smallest using nested ternary operator÷
//
import java.util.*;


class Q36 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();


        
        
        
        System.out.println(n1>n2 && n1>n3 ?"Smallest number"+ n1 : n1<n2 && n2>n3 ?"Smallest number"+ n2: n1>n3 && n2>n3 ?"Smallest number"+ n3);
 
    }    
        
  
}
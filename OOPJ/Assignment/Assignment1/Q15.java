//Lucky number Check
//A 4-digit no is lucky fr for ABCD A+B=C+D
import java.util.*;


class Q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4-digit number: ");
        int n = sc.nextInt();
        
        int reversed = 0;
        
        if (((n%10) + ((n/10)%10)) == (((n/100)%10)+((n/1000)%10))){
            System.out.println("lucky number");
        }else{
            System.out.println("Not a Lucky number");
        }
        
        sc.close();
        

    }
}
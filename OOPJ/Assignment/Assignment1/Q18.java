//Day of the Week
//Scenario: Take day number (1–7) and print the day name
import java.util.*;


class Q18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number: ");
        int d = sc.nextInt();
        
       switch(d){
           case(1):
               System.out.println("Monday");
               break;
            case(3):
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("All other days");
       }
                        
        sc.close();
        

    }
}
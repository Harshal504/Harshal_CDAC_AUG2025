//Character type Checker÷
import java.util.*;


class Q46 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Character: ");
        char c = sc.next().charAt(0);
        
        if(c >= 'a' && c<= 'z' || c >= 'A' && c<= 'Z' ){
            System.out.println("Aplhabet");
        }else if(c >= '0' && c<= '9' ){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
        
        
        }
}
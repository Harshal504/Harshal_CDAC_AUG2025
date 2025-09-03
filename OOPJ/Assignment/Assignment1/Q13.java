//Exam Eligibility with Medical Cause
//Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and medical cause (Y/N) as input and decide if the student can sit in exam

import java.util.*;


class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Class Held ");
        int ch = sc.nextInt();
        System.out.println("Classs Attended");
        int ca = sc.nextInt();
        System.out.println("Medical Cause (Y/N) ");
        char m = sc.next().charAt(0);
        
        if(ca >= (ch*0.75)){
            System.out.println("Student is allowed to sit for the exam.");
        
        }else if( m == 'Y'){
            System.out.println("Student is allowed to sit for the exam.");
        }else{
            System.out.println("Student is not allowed to sit for the exam.");
        }
        
        sc.close();
        

    }
}
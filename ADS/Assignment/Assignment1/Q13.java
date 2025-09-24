import java.util.*;

public class Q13 {
    private static TreeSet<String> employees = new TreeSet<>();

    public static boolean insert(String name) {
        return employees.add(name); // returns false if duplicate
    }

    public static boolean delete(String name) {
        return employees.remove(name); // returns false if not found
    }

    public static void display() {
        System.out.println(employees);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1: Basic insert, sorted display, and delete ----------
        insert("Zara");
        insert("Aman");
        insert("Neha");
        display();   // Expected: [Aman, Neha, Zara]
        System.out.println(delete("Neha")); // Expected: true
        display();   // Expected: [Aman, Zara]

        // Reset for next test
        employees.clear();

        // ---------- Test Case 2: Duplicates ignored & case sensitivity ----------
        insert("Meera");
        insert("meera");   // different because of case
        insert("Arjun");
        insert("Arjun");   // duplicate ignored
        display();   // Expected: [Arjun, Meera, meera]
        System.out.println(delete("Rahul")); // Expected: false (not present)
        System.out.println(delete("Meera")); // Expected: true
        display();   // Expected: [Arjun, meera]
    }
}

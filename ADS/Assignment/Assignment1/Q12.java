import java.util.*;

public class Q12 {
    private static HashSet<String> set = new HashSet<>();

    public static boolean add(String element) {
        return set.add(element); // returns false if already exists
    }

    public static boolean search(String element) {
        return set.contains(element);
    }

    public static boolean remove(String element) {
        return set.remove(element);
    }

    public static void display() {
        System.out.println(set);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1: Add duplicates ignored ----------
        add("A");
        add("A");  // duplicate ignored
        add("B");
        display(); // Expected: [A, B] (order may vary, HashSet doesn’t preserve order)

        // Reset for next test
        set.clear();

        // ---------- Test Case 2: Search present vs absent ----------
        add("A");
        add("B");
        System.out.println(search("A")); // Expected: true
        System.out.println(search("C")); // Expected: false
    }
}

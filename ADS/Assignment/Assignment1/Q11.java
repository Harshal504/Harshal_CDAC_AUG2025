import java.util.*;

public class Q11 {
    private static LinkedList<String> list = new LinkedList<>();

    public static void add(String element) {
        list.add(element);
    }

    public static boolean update(int index, String element) {
        if (index < 0 || index >= list.size()) return false;
        list.set(index, element);
        return true;
    }

    public static boolean remove(int index) {
        if (index < 0 || index >= list.size()) return false;
        list.remove(index);
        return true;
    }

    public static void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1: Add, Remove, Display ----------
        add("A");
        add("B");
        add("C");
        remove(0);        // removes "A"
        display();        // Expected: [B, C]

        // Reset for next test
        list.clear();

        // ---------- Test Case 2: Add, Update, Display ----------
        add("A");
        add("B");
        add("C");
        update(1, "X");  // replaces element at index 1 ("B" → "X")
        display();       // Expected: [A, X, C]
    }
}

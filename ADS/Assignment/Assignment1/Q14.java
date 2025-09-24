import java.util.*;

public class Q14 {
    private static HashMap<Integer, String> books = new HashMap<>();

    public static boolean add(int id, String title) {
        if (books.containsKey(id)) return false;
        books.put(id, title);
        return true;
    }

    public static boolean update(int id, String newTitle) {
        if (!books.containsKey(id)) return false;
        books.put(id, newTitle);
        return true;
    }

    public static boolean remove(int id) {
        if (!books.containsKey(id)) return false;
        books.remove(id);
        return true;
    }

    public static void display() {
        // Convert to TreeMap for sorted output
        TreeMap<Integer, String> sortedBooks = new TreeMap<>(books);
        System.out.println(sortedBooks);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1: Basic add & sorted display ----------
        add(205, "Refactoring");
        add(101, "Clean_Code");
        add(150, "Effective_Java");
        display();  // Expected: {101=Clean_Code, 150=Effective_Java, 205=Refactoring}

        // Reset for next test
        books.clear();

        // ---------- Test Case 2: Update, remove, and verify ----------
        add(1, "Alpha");
        add(2, "Beta");
        update(2, "Beta_2nd_Ed");
        remove(1);
        display();  // Expected: {2=Beta_2nd_Ed}
    }
}

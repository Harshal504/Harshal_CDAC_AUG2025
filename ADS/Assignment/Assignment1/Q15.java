import java.util.*;

public class Q15 {
    private static LinkedHashMap<String, String> logins = new LinkedHashMap<>();

    public static boolean add(String user, String pass) {
        if (logins.containsKey(user)) return false; 
        logins.put(user, pass);
        return true;
    }

    public static boolean update(String user, String pass) {
        if (!logins.containsKey(user)) return false; 
        logins.put(user, pass);
        return true;
    }

    public static boolean remove(String user) {
        if (!logins.containsKey(user)) return false; 
        logins.remove(user);
        return true;
    }

    public static void display() {
        System.out.println(logins);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1 ----------
        add("alice", "a1");
        add("bob", "b1");
        update("alice", "a2");
        display();  // Expected: {alice=a2, bob=b1}

        // Reset for next test
        logins.clear();

        // ---------- Test Case 2 ----------
        add("alice", "a1");
        add("bob", "b1");
        add("carol", "c1");
        remove("bob");
        add("bob", "b2");
        display();  // Expected: {alice=a1, carol=c1, bob=b2}
    }
}

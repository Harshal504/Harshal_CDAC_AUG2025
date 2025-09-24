public class Q8 {

    // Recursive function to find first non-repeated character
    private static Character findFirstUnique(String str, int index) {
        if (index == str.length()) return null; // base case: reached end

        char ch = str.charAt(index);

        // Check if character is unique
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            return ch; // found first unique
        }

        // Recursive call for next character
        return findFirstUnique(str, index + 1);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1 ----------
        String s1 = "stress";
        System.out.println(s1 + " → " + findFirstUnique(s1, 0)); // Expected: 't'

        // ---------- Test Case 2 ----------
        String s2 = "aabbcc";
        System.out.println(s2 + " → " + findFirstUnique(s2, 0)); // Expected: null
    }
}

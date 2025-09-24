public class Q9 {

    // Recursive function to reverse number
    private static int reverse(int n, int rev) {
        if (n == 0) return rev;                // base case
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;               // negatives not palindrome
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1 ----------
        int num1 = 121;
        System.out.println(num1 + " → " + isPalindrome(num1)); // Expected: true

        // ---------- Test Case 2 ----------
        int num2 = -121;
        System.out.println(num2 + " → " + isPalindrome(num2)); // Expected: false

    }
}

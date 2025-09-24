public class Q10 {

    public static boolean isLeapYear(int year) {
        // Rule: divisible by 4 and (not divisible by 100 unless divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // ---------- Test Case 1 ----------
        int year1 = 2020;
        System.out.println(year1 + " → " + isLeapYear(year1)); // Expected: true

        // ---------- Test Case 2 ----------
        int year2 = 1900;
        System.out.println(year2 + " → " + isLeapYear(year2)); // Expected: false
    }
}

public class Task10 {

    /*
     * Time Complexity: O(log n)
     * Each step divides n by 2.
     *
     * Space Complexity: O(log n)
     * Recursion depth.
     */

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            System.out.println("Reached 1 → true");
            return true;
        }

        if (n <= 0 || n % 2 != 0) {
            System.out.println("Invalid case: " + n);
            return false;
        }

        System.out.println("Dividing " + n + " by 2");
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " → " + isPowerOfTwo(i));
        }
    }
}
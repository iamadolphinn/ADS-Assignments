public class Task4 {

    /*
     * Time Complexity: O(n)
     * One recursive call for each power from n to 0.
     *
     * Space Complexity: O(n)
     * Recursion stack depth.
     */

    public static int sumPowersRecursive(int b, int n) {
        if (n == 0) {
            System.out.println("Base case: n = 0");
            return 1;
        }

        System.out.println("Computing power for n = " + n);
        int result = (int)Math.pow(b, n) + sumPowersRecursive(b, n - 1);
        System.out.println("Returning for n = " + n + ": " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumPowersRecursive(4, 3));
    }
}
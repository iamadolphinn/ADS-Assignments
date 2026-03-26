public class Task3 {

    /*
     * Time Complexity: O(n)
     * One recursive call per decrement of n.
     *
     * Space Complexity: O(n)
     * Recursion stack depth.
     */

    public static int sumNRecursive(int n) {
        if (n == 1) {
            System.out.println("Base case: n = 1");
            return 1;
        }

        System.out.println("Calling with n = " + n);
        int result = n + sumNRecursive(n - 1);
        System.out.println("Returning for n = " + n + ": " + result);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNRecursive(n));
    }
}
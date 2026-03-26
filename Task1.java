public class Task1 {

    /*
     * Time Complexity: O(n)
     * Each recursive call reduces n by 1 → total n calls.
     *
     * Space Complexity: O(n)
     * Due to recursion stack depth.
     */

    public static int squareNumbersSumRecursive(int n) {
        if (n == 1) {
            System.out.println("Base case reached: n = 1");
            return 1;
        }

        System.out.println("Calling recursion with n = " + n);
        int result = squareNumbersSumRecursive(n - 1) + n * n;
        System.out.println("Returning for n = " + n + ": " + result);
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(squareNumbersSumRecursive(n));
    }
}
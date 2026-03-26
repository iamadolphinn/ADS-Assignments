public class Task2 {

    /*
     * Time Complexity: O(n)
     * Each element is processed once.
     *
     * Space Complexity: O(n)
     * Recursion depth equals array size.
     */

    public static int sumArrayRecursive(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Base case reached: n = 0");
            return 0;
        }

        System.out.println("Processing index " + (n - 1));
        int result = arr[n - 1] + sumArrayRecursive(arr, n - 1);
        System.out.println("Returning sum for n = " + n + ": " + result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArrayRecursive(arr, arr.length));
    }
}
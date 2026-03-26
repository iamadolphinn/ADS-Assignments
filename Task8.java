public class Task8 {

    /*
     * Time Complexity: O(k^n)
     * Generates all possible sequences of length n with k choices.
     *
     * Space Complexity: O(n)
     * Recursion depth.
     */

    public static void generate(int[] arr, int index, int n, int k) {
        if (index == n) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
            return;
        }

        System.out.println("At position " + index);

        for (int i = 1; i <= k; i++) {
            arr[index] = i;
            generate(arr, index + 1, n, k);
        }
    }

    public static void main(String[] args) {
        int n = 2, k = 3;
        int[] arr = new int[n];

        generate(arr, 0, n, k);
    }
}
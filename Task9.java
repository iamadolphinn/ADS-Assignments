public class Task9 {

    /*
     * Time Complexity: O(n!)
     * All permutations are generated.
     *
     * Space Complexity: O(n)
     * Recursion stack depth.
     */

    public static void permute(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            System.out.println("Swapped positions " + index + " and " + i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        permute(arr, 0);
    }
}
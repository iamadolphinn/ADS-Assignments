import java.util.Arrays;

public class assignment3_task5 {


    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            System.out.println(
                    "Low = " + low +
                            ", High = " + high +
                            ", Mid = " + mid +
                            ", Value = " + arr[mid]
            );


            if (arr[mid] == target) {
                return mid;
            }


            else if (arr[mid] < target) {
                low = mid + 1;
            }


            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] arr = {45, 12, 89, 34, 67, 23, 90, 11};


        Arrays.sort(arr);

        System.out.println("Sorted Dataset:");
        System.out.println(Arrays.toString(arr));


        int target = 67;

        System.out.println("\nTracing Binary Search:");

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("\nTarget found at index: " + result);
        } else {
            System.out.println("\nTarget not found.");
        }
    }
}
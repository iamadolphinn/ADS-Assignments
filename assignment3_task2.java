public class assignment3_task2 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int pass = 0; pass < n - 1; pass++) {
            swapped = false;

            for (int i = 0; i < n - pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }


            System.out.print("Pass " + (pass + 1) + ": ");
            printArray(arr);


            if (!swapped) {
                System.out.println("No swaps → Array is sorted. Early exit.");
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 6};

        System.out.print("Initial: ");
        printArray(arr);

        bubbleSort(arr);
    }
}
public class assignment3_task3 {

    public static void heapSort(int[] arr) {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.print("After Heapify: ");
        printArray(arr);


        for (int i = n - 1; i > 0; i--) {

            // Swap root with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            if (i == n - 1) {
                System.out.print("After 1st Extract-Max: ");
                printArray(arr);
            }


            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;       // root
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }


        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }


        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        System.out.print("Original: ");
        printArray(arr);

        heapSort(arr);
    }
}
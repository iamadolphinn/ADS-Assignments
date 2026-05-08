public class assignment3_task4 {


    static class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }


    public static Pair findMinMax(int[] arr, int left, int right) {


        if (left == right) {
            return new Pair(arr[left], arr[left]);
        }


        if (right == left + 1) {

            if (arr[left] < arr[right]) {
                return new Pair(arr[left], arr[right]);
            } else {
                return new Pair(arr[right], arr[left]);
            }
        }


        int mid = (left + right) / 2;

        Pair leftPair = findMinMax(arr, left, mid);
        Pair rightPair = findMinMax(arr, mid + 1, right);


        int finalMin = Math.min(leftPair.min, rightPair.min);
        int finalMax = Math.max(leftPair.max, rightPair.max);

        return new Pair(finalMin, finalMax);
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 20, 3, 15, 7};

        Pair result = findMinMax(arr, 0, arr.length - 1);

        int range = result.max - result.min;

        System.out.println("Minimum = " + result.min);
        System.out.println("Maximum = " + result.max);
        System.out.println("Range = " + range);
    }
}
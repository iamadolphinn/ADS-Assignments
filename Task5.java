import java.util.Scanner;

public class Task5 {

    /*
     * Time Complexity: O(n)
     * Each number is read and printed once.
     *
     * Space Complexity: O(n)
     * Due to recursion stack.
     */

    public static void reverseNumbers(int n, Scanner sc) {
        if (n == 0) {
            System.out.println("Base case reached");
            return;
        }

        int x = sc.nextInt();
        System.out.println("Read: " + x);

        reverseNumbers(n - 1, sc);

        System.out.println("Printing: " + x);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumbers(n, sc);
    }
}
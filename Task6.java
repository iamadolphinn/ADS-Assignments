import java.util.Scanner;

public class Task6 {

    /*
     * Time Complexity: O(n)
     * Each string is processed once.
     *
     * Space Complexity: O(n)
     * Recursion depth.
     */

    public static void reverseStrings(int n, Scanner sc) {
        if (n == 0) {
            System.out.println("Base case reached");
            return;
        }

        String str = sc.nextLine();
        System.out.println("Read: " + str);

        reverseStrings(n - 1, sc);

        System.out.println("Printing: " + str);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        reverseStrings(n, sc);
    }
}
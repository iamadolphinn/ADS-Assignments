public class Task7 {

    /*
     * Time Complexity: O(n^2)
     * Every cell of the matrix is filled once.
     *
     * Space Complexity: O(n^2)
     * Matrix storage + recursion stack O(n).
     */

    public static void spiral(int[][] matrix, int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) {
            System.out.println("Stopping recursion");
            return;
        }

        System.out.println("Filling layer starting at " + num);

        for (int i = left; i <= right; i++)
            matrix[top][i] = num++;

        for (int i = top + 1; i <= bottom; i++)
            matrix[i][right] = num++;

        for (int i = right - 1; i >= left && top < bottom; i--)
            matrix[bottom][i] = num++;

        for (int i = bottom - 1; i > top && left < right; i--)
            matrix[i][left] = num++;

        spiral(matrix, top + 1, bottom - 1, left + 1, right - 1, num);
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        spiral(matrix, 0, n - 1, 0, n - 1, 1);

        for (int[] row : matrix) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
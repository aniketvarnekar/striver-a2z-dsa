public class Problem25 {

    /**
     * Rotates a square matrix by 90 degrees clockwise in-place.
     *
     * Algorithm:
     * 1. Transpose the matrix.
     * 2. Reverse each row.
     *
     * Example:
     * 1 2 3      1 4 7      7 4 1
     * 4 5 6  ->  2 5 8  ->  8 5 2
     * 7 8 9      3 6 9      9 6 3
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(1)
     */
    private static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    /**
     * Reverses a one-dimensional array in-place.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    /**
     * Prints the matrix row by row.
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(1)
     */
    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        print(matrix);
    }

}
public class Problem29 {

    /**
     * Searches for the target in a matrix using
     * the top-right corner traversal.
     *
     * This approach works when:
     * - Each row is sorted in ascending order.
     * - Each column is sorted in ascending order.
     *
     * Time Complexity: O(M + N)
     * Space Complexity: O(1)
     */
    private static boolean searchMatrixV1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int column = n - 1;

        while (row < m && column >= 0) {
            // Target found            
            if (matrix[row][column] == target) {
                return true;
            } 
            // Eliminate the current row
            else if (matrix[row][column] < target) {
                row++;
            } 
            // Eliminate the current column            
            else {
                column--;
            }
        }

        return false;
    }

    /**
     * Searches for the target by treating the
     * matrix as a single sorted array and
     * applying Binary Search.
     *
     * This approach works when:
     * - Each row is sorted.
     * - The first element of every row is
     *   greater than the last element of the
     *   previous row.
     *
     * Time Complexity: O(log(M × N))
     * Space Complexity: O(1)
     */
    private static boolean searchMatrixV2(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Convert 1D index into row and column
            int value = matrix[mid / n][mid % n];

            if (value == target) {
                return true;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 8;

        boolean result1 = searchMatrixV1(matrix, target);
        System.out.println(result1);

        boolean result2 = searchMatrixV2(matrix, target);
        System.out.println(result2);        
    }

}
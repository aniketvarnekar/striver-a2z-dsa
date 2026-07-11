import java.util.*;

public class Problem31 {

    /**
     * Finds a peak element in a 2D matrix using
     * Binary Search on columns.
     *
     * A peak element is greater than its left
     * and right neighbors. The row containing
     * the maximum element in the current column
     * is examined at every step.
     *
     * Time Complexity: O(M * log N)
     * Space Complexity: O(1)
     */
    private static int[] findPeakElement(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            // Middle column            
            int mid = low + (high - low) / 2;
            
            // Row containing the maximum element
            // in the current column            
            int row = findMaxElementRow(matrix, m, mid);

            // Left neighbor
            int left = (mid - 1) >= 0 ? matrix[row][mid - 1] : -1;
            // Right neighbor
            int right = (mid + 1) < n ? matrix[row][mid + 1] : -1;

            // Peak element found
            if (matrix[row][mid] > left && matrix[row][mid] > right) {
                return new int[] {row, mid};
            }

            // Peak lies on the right side            
            else if (matrix[row][mid] < right) {
                low = mid + 1;
            } 
            
            // Peak lies on the left side            
            else {
                high = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

    /**
     * Finds the row index containing the maximum
     * element in the specified column.
     *
     * Time Complexity: O(M)
     * Space Complexity: O(1)
     */
    private static int findMaxElementRow(int[][] matrix, int totalRows, int column) {
        int maxElement = -1;
        int maxRowIndex = -1;

        for (int i = 0; i < totalRows; i++) {
            if (matrix[i][column] > maxElement) {
                maxElement = matrix[i][column];
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {5, 10, 8},
            {4, 25, 7},
            {3, 9, 6}
        };
        
        int[] result = findPeakElement(matrix);
        
        System.out.println(Arrays.toString(result));
    }

}
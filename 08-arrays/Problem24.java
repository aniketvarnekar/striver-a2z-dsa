import java.util.*;

public class Problem24 {


    /**
     * Sets entire rows and columns to zero if any element
     * in that row or column is zero.
     *
     * This solution uses the first row and first column
     * as markers to achieve O(1) extra space.
     *
     * The variable col0 is used separately to track whether
     * the first column should be set to zero because matrix[0][0]
     * is already being used to represent the first row.
     *
     * Time Complexity: O(M × N)
     * Space Complexity: O(1)
     */
    private static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Tracks whether the first column should be zeroed
        int col0 = 1;


        // Step 1:
        // Mark rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // Mark current row                    
                    matrix[i][0] = 0;

                    // Mark first column separately                    
                    if (j == 0) {
                        col0 = 0;
                    } 
                    // Mark current column                    
                    else {
                        matrix[0][j] = 0;
                    }
                } 
            }
        }

        // Step 2:
        // Update matrix using row and column markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3:
        // Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4:
        // Handle first column
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

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
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        
        setZeroes(matrix);

        print(matrix);
    }

}
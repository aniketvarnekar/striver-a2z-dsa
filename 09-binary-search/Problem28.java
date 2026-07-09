public class Problem28 {

    /**
     * Finds the index of the row containing the
     * maximum number of 1s in a binary matrix.
     *
     * Each row of the matrix is sorted in
     * non-decreasing order.
     *
     * Time Complexity: O(M * log N)
     * Space Complexity: O(1)
     */
    private static int findRowWithMaximumOnesV1(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int maxCount = 0;
        int index = - 1;
        for (int i = 0; i < m; i++) {
            // Count the number of 1s in each row            
            int count = countOnes(matrix[i]);
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        return index;
    }

    /**
     * Counts the number of 1s in a sorted binary array
     * using Binary Search.
     *
     * Finds the first occurrence of 1 and returns
     * the number of elements from that position
     * to the end of the array.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int countOnes(int[] arr) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // First 1 may lie on the left            
            if (arr[mid] >= 1) {
                result = n - mid;
                high = mid - 1;
            } 
            
            // Search in the right half            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Finds the index of the row containing the
     * maximum number of 1s using the top-right
     * traversal technique.
     *
     * Since each row is sorted, moving left
     * indicates more 1s in the current row,
     * while moving down skips rows that cannot
     * have more 1s.
     *
     * Time Complexity: O(M + N)
     * Space Complexity: O(1)
     */
    private static int findRowWithMaximumOnesV2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int column = n - 1;
        int rowIndex = -1;

        while (row < m && column >= 0) {
            // Found a 1, so this row has at least
            // (n - column) ones. Move left to check
            // if there are more 1s in the same row.            
            if (matrix[row][column] == 1) {
                rowIndex = row;
                column--;
            } 
            // Found a 0, move to the next row.            
            else {
                row++;
            }
        }

        return rowIndex;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };
        
        int result1 = findRowWithMaximumOnesV1(matrix);
        System.out.println(result1);

        int result2 = findRowWithMaximumOnesV2(matrix);
        System.out.println(result2);
    }

}
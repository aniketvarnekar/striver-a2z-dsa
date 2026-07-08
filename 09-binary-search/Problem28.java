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
    private static int findRowWithMaximumOnes(int[][] matrix) {
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

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };
        
        int result = findRowWithMaximumOnes(matrix);
        System.out.println(result);
    }

}
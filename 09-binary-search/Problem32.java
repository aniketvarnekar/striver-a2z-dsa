public class Problem32 {

    /**
     * Finds the median of a row-wise sorted matrix
     * using Binary Search on the value range.
     *
     * The search space is between the smallest and
     * largest elements in the matrix. For each
     * candidate value, count how many elements are
     * less than or equal to it.
     *
     * Time Complexity: O(M * log N * log Range)
     * Space Complexity: O(1)
     */
    private static int findMedian(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Determine the search range
        for (int i = 0; i < m; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][n - 1]);
        }

        int low = min;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Count elements less than or equal to mid
            int count = 0;
            for (int i = 0; i < m; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            // Number of elements that should lie
            // before the median
            int required = (m * n) / 2;

            // Median lies on the left
            if (count > required) {
                high = mid - 1;
            }
            // Median lies on the right            
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    /**
     * Counts the number of elements less than or
     * equal to the target in a sorted array.
     *
     * Uses Binary Search to find the first element
     * greater than the target.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int countLessEqual(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // First element greater than target
            if (arr[mid] > target) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        
        int result = findMedian(matrix);

        System.out.println(result);
    }

}
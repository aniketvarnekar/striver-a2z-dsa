public class Problem15 {

    /**
     * Finds the integer Nth root of M using Binary Search.
     *
     * Returns the integer x such that:
     *
     * x^N = M
     *
     * If no such integer exists, returns -1.
     *
     * Time Complexity: O(N * log M)
     * Space Complexity: O(1)
     */
    private static int findNthRoot(int m, int n) {
        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = power(mid, n);

            // Exact Nth root found
            if (value == m) {
                return mid;
            } 

            // Search in the right half            
            else if (value < m) {
                low = mid + 1;
            } 

            // Search in the left half            
            else {
                high = mid - 1;
            }
        }

        // Integer Nth root does not exist
        return -1;
    }

    /**
     * Computes x raised to the power n.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static long power(int x, int n) {
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        int m = 81;
        int n = 4;

        int result = findNthRoot(m, n);

        System.out.println(result);
    }

}
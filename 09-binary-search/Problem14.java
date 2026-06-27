public class Problem14 {

    /**
     * Finds the floor value of the square root
     * of a non-negative integer using Binary Search.
     *
     * Returns the greatest integer x such that:
     *
     * x * x <= n
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findSquareRoot(int n) {
        int low = 1;
        int high = n;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = (long) mid * mid;
            
            // Valid square root candidate
            if (value <= n) {
                result = mid;
                
                // Try to find a larger one                
                low = mid + 1;
            }

            // Search left half            
            else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 28;

        int result = findSquareRoot(n);

        System.out.println(result);
    }

}
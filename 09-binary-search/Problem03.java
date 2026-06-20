public class Problem03 {

    /**
     * Finds the upper bound of x in a sorted array.
     *
     * The upper bound is the smallest index such that:
     *
     * arr[index] > x
     *
     * If no such index exists, returns arr.length.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;

        // Default answer if upper bound does not exist
        while (low <= high) {

            // Calculate middle index safely            
            int mid = low + (high - low) / 2;

            // Potential upper bound found
            if (arr[mid] > x) {
                result = mid;

                // Search further on the left
                high = mid - 1;
            } 

            // Search right half            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 8, 9, 15, 19};
        int x = 9;

        int result = upperBound(arr, x);
        System.out.println(result);
    }

}
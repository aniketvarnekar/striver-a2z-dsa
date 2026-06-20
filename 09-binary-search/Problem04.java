public class Problem04 {

    /**
     * Finds the index of the target if present.
     * Otherwise, returns the position where the target
     * should be inserted to maintain sorted order.
     *
     * This is equivalent to finding the lower bound
     * of the target.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int searchInsertPosition(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        // Default insertion position
        int result = arr.length;

        while (low <= high) {
            // Calculate middle index safely            
            int mid = low + (high - low) / 2;

            // Potential insertion position found
            if (arr[mid] >= x) {
                result = mid;

                // Search on the left side                
                high = mid - 1;
            } 
            
            // Search on the right side            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 7};
        int x = 6;

        int result = searchInsertPosition(arr, x);
        System.out.println(result);
    }

}
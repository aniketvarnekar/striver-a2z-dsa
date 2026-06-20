public class Problem02 {

    /**
     * Finds the lower bound of x in a sorted array.
     *
     * The lower bound is the smallest index such that:
     *
     * arr[index] >= x
     *
     * If no such index exists, returns arr.length.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int lowerBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        // Default answer if lower bound does not exist        
        int result = arr.length;

        while (low <= high) {
            // Calculate middle index safely            
            int mid = low + (high - low) / 2;

            // Potential lower bound found
            if (arr[mid] >= x) {
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
        int[] arr = new int[] {3, 5, 8, 15, 19};
        int x = 9;

        int result = lowerBound(arr, x);
        System.out.println(result);
    }

}
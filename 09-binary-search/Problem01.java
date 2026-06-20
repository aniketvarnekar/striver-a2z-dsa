public class Problem01 {

    /**
     * Performs Binary Search using an iterative approach.
     *
     * Binary Search works on a sorted array by repeatedly
     * dividing the search space into two halves.
     *
     * If the target is found, its index is returned.
     * Otherwise, -1 is returned.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int binarySearchV1(int[] arr, int target) {
        // Search range boundaries        
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculate middle index safely            
            int mid = low + (high - low) / 2;

            // Target found
            if (target == arr[mid]) {
                return mid;
            } 

            // Search left half
            else if (target < arr[mid]) {
                high = mid - 1;
            } 
            
            // Search right half            
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    /**
     * Performs Binary Search using recursion.
     *
     * The search range is recursively reduced to either
     * the left half or the right half depending on the
     * comparison with the middle element.
     *
     * If the target is found, its index is returned.
     * Otherwise, -1 is returned.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(log N) (due to recursive call stack)
     */
    private static int binarySearchV2(int[] arr, int low, int high, int target) {
        // Base case: target not present        
        if (low > high) {
            return -1;
        }

        // Calculate middle index safely
        int mid = low + (high - low) / 2;

        // Target found
        if (target == arr[mid]) {
            return mid;
        } 

        // Search left half
        else if (target < arr[mid]) {
            return binarySearchV2(arr, low, mid - 1, target);
        } 
        
        // Search right half        
        else {
            return binarySearchV2(arr, mid + 1, high, target);
        } 
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        int result1 = binarySearchV1(arr, target);
        System.out.println(result1);

        int result2 = binarySearchV2(arr, 0, arr.length - 1, target);
        System.out.println(result2);
    }

}
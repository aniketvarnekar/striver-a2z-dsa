public class Problem08 {

    /**
     * Searches for a target element in a rotated
     * sorted array containing distinct elements.
     *
     * The algorithm uses Binary Search and determines
     * which half of the array is sorted at each step.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int searchElement(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Target found
            if (arr[mid] == k) {
                return mid;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (k >= arr[low] && k <= arr[mid]) {
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            }
            
            // Right half is sorted            
            else {
                if (k >= arr[mid] && k <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 7, 0, 1, 2};
        int k = 0;

        int result = searchElement(arr, k);

        System.out.println(result);
    }

}
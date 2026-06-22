public class Problem09 {

    /**
     * Searches for a target element in a rotated
     * sorted array that may contain duplicates.
     *
     * Returns true if the target exists,
     * otherwise returns false.
     *
     * Time Complexity:
     * O(log N) on average
     * O(N) in the worst case due to duplicates
     *
     * Space Complexity: O(1)
     */
    private static boolean searchElement(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Target found
            if (arr[mid] == k) {
                return true;
            }

            // Handle duplicate elements
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
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

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;

        boolean result = searchElement(arr, k);

        System.out.println(result);
    }

}
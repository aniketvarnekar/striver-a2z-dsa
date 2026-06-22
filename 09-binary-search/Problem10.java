public class Problem10 {

    /**
     * Finds the minimum element in a rotated
     * sorted array containing distinct elements.
     *
     * Uses Binary Search by identifying the sorted
     * half at every step and tracking the minimum.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Current search space is already sorted
            if (arr[low] <= arr[high]) {
                result = Math.min(result, arr[low]);
                break;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                result = Math.min(result, arr[low]);
                low = mid + 1;
            } 
            
            // Right half is sorted            
            else {
                result = Math.min(result, arr[mid]);
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 7, 0, 1, 2, 3};
        int result = findMinimum(arr);

        System.out.println(result);
    }

}
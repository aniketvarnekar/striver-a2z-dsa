public class Problem13 {

    /**
     * Finds the index of a peak element in the array.
     *
     * A peak element is strictly greater than its
     * immediate neighbors.
     *
     * Uses Binary Search by observing that if the
     * sequence is increasing, a peak must exist on
     * the right; otherwise, it lies on the left.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findPeakElement(int[] arr) {
        int n = arr.length;

        // Only one element
        if (n == 1) {
            return 0;
        }

        // Peak at the beginning
        if (arr[0] > arr[1]) {
            return 0;
        }

        // Peak at the end
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                result = mid;
                break;
            }

            // Peak lies on the right
            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }
            
            // Peak lies on the left            
            else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};

        int result = findPeakElement(arr);

        System.out.println(result);
    }

}
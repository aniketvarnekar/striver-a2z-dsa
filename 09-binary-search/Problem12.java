public class Problem12 {

    /**
     * Finds the single element in a sorted array
     * where every other element appears exactly twice.
     *
     * Uses Binary Search based on the observation that
     * pairs occupy:
     * - (even, odd) indices before the single element.
     * - (odd, even) indices after the single element.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findSingleElement(int[] arr) {
        int n = arr.length;

        // Only one element
        if (n == 1) {
            return arr[0];
        }

        // Single element is at the beginning
        if (arr[0] != arr[1]) {
            return arr[0];
        }

        // Single element is at the end
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Found the single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                result = arr[mid];
                break;
            }

            // Single element lies on the right
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) 
                    || (mid % 2 != 0 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } 

            // Single element lies on the left            
            else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int result = findSingleElement(arr);

        System.out.println(result);
    }

}
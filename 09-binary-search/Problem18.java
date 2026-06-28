public class Problem18 {

    /**
     * Finds the smallest divisor such that the sum of
     * ceil(arr[i] / divisor) for all elements is less
     * than or equal to the given threshold.
     *
     * Uses Binary Search on the answer space:
     * [1, maximum element].
     *
     * Time Complexity: O(N * log M)
     * where M is the maximum element in the array.
     *
     * Space Complexity: O(1)
     */
    private static int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // Find the maximum element
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int low = 1;
        int high = max;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = calculateSum(arr, mid);

            // Current divisor satisfies the threshold
            if (sum <= threshold) {
                result = mid;
                high = mid - 1;
            } 

            // Need a larger divisor            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Computes the sum of
     * ceil(arr[i] / divisor)
     * for all elements in the array.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateSum(int[] arr, int x) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / x);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int threshold = 8;

        int result = smallestDivisor(arr, threshold);

        System.out.println(result);
    }

}
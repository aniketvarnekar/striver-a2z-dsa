public class Problem23 {

    /**
     * Splits the array into exactly k contiguous
     * subarrays such that the largest subarray sum
     * is minimized.
     *
     * Uses Binary Search on the answer space:
     * [maximum element, sum of all elements].
     *
     * Time Complexity: O(N * log S)
     * where S is the sum of all array elements.
     *
     * Space Complexity: O(1)
     */
    private static int findMaxSubarraySum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Determine search space
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int low = max;
        int high = sum;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int subarrays = calculateSubarrays(arr, mid);

            // Possible to split within k subarrays
            if (subarrays <= k) {
                result = mid;
                high = mid - 1;
            }

            // Need a larger maximum subarray sum            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Calculates the minimum number of subarrays
     * required if each subarray sum cannot exceed
     * maxSum.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateSubarrays(int[] arr, int maxSum) {
        int subarrays = 1;
        int subarraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (subarraySum + arr[i] > maxSum) {
                subarrays++;
                subarraySum = arr[i];
            } else {
                subarraySum += arr[i];
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int k = 3;

        int result = findMaxSubarraySum(arr, k);

        System.out.println(result);
    }

}
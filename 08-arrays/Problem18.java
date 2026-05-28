import java.util.*;

public class Problem18 {

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     *
     * The algorithm maintains a running sum of the current subarray.
     * If the running sum becomes negative, it is reset to 0 because
     * a negative sum cannot contribute to a maximum future subarray.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int maximumSubarraySumV1(int[] arr) {
        // Stores maximum subarray sum found so far        
        int max = Integer.MIN_VALUE;

        // Stores current subarray sum        
        int sum = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to running sum            
            sum += arr[i];

            // Update maximum subarray sum
            max = Math.max(max, sum);

            // Reset sum if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    /**
     * Finds and returns the subarray with the maximum sum
     * using Kadane's Algorithm.
     *
     * The function keeps track of:
     * - current running sum
     * - maximum sum found so far
     * - start and end indices of the maximum subarray
     *
     * If the running sum becomes negative, it is reset to 0
     * because a negative sum cannot contribute to a larger future sum.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — for returning the resulting subarray.
     */
    private static int[] maximumSubarraySumV2(int[] arr) {
        // Stores maximum subarray sum found so far
        int max = Integer.MIN_VALUE;

        // Stores current running sum        
        int sum = 0;

        // Temporary start index of current subarray        
        int start = 0;

        // Start index of maximum subarray
        int arrStart = -1;
        
        // End index of maximum subarray
        int arrEnd = -1;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If current sum becomes 0, potential new subarray starts here
            if (sum == 0) {
                start = i;
            }

            // Add current element to running sum
            sum += arr[i];

            // Update maximum sum and subarray indices
            if (sum > max) {
                max = sum;
                arrStart = start;
                arrEnd = i;
            }

            // Reset running sum if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return maximum sum subarray
        return Arrays.copyOfRange(arr, arrStart, arrEnd + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 5, -2, 7, -4};

        int result = maximumSubarraySumV1(arr);

        System.out.println(result);

        int[] resultArr = maximumSubarraySumV2(arr);

        System.out.println(Arrays.toString(resultArr));
    }

}
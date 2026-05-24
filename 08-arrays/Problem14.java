import java.util.*;

public class Problem14 {

    /**
     * Finds the length of the longest subarray with sum equal to k.
     *
     * The function uses the prefix sum technique with a HashMap.
     * The HashMap stores the first occurrence of each prefix sum.
     *
     * If a prefix sum difference of (sum - k) exists, it means
     * the subarray between those indices has sum equal to k.
     *
     * This approach works for arrays containing positive,
     * negative, and zero values.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — HashMap stores prefix sums.
     */    
    private static int longestSubarray(int[] arr, int k) {
        // Stores current prefix sum
        int sum = 0;

        // Stores maximum subarray length        
        int maxLength = 0;

        // HashMap to store prefix sum and its first occurrence index
        Map<Integer, Integer> prefixSum = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to prefix sum            
            sum += arr[i];

            // If prefix sum itself equals k,
            // subarray from 0 to i has sum k
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            } 
            
            // Check if there exists a prefix sum such that:
            // currentSum - previousPrefixSum = k            
            if (prefixSum.containsKey(sum - k)) {
                // Calculate subarray length                
                maxLength = Math.max(maxLength, i - prefixSum.get(sum - k));
            }

            // Store prefix sum only if it appears first time
            prefixSum.putIfAbsent(sum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {6, -2, 2, -8, 1, 7, 4, -10};
        int k = 0;

        int result = longestSubarray(arr, k);

        System.out.println(result);
    }

}
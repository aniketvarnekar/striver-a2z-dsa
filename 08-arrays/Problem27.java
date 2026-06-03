import java.util.*;

public class Problem27 {

    /**
     * Counts the number of subarrays whose sum equals k.
     *
     * Uses the Prefix Sum + HashMap approach.
     *
     * For each prefix sum, we check whether there exists a previous
     * prefix sum equal to (currentPrefixSum - k). If it exists,
     * then the subarray between those indices has sum k.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static int subarraySum(int[] arr, int k) {
        // Stores running prefix sum        
        int prefixSum = 0;

        // Stores count of valid subarrays        
        int count = 0;
        
        // Maps prefix sum -> frequency        
        Map<Integer, Integer> prefixCount = new HashMap<>();
        // Base case: prefix sum 0 occurs once        
        prefixCount.put(0, 1);

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update prefix sum            
            prefixSum += arr[i];

            // Check if there exists a prefix sum that can form sum k
            if (prefixCount.containsKey(prefixSum - k)) {
                count += prefixCount.get(prefixSum - k);
            }

            // Store/update current prefix sum frequency
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 1, 2, 4};
        int k = 6;

        int result = subarraySum(arr, k);

        System.out.println(result);
    }

}
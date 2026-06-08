import java.util.*;

public class Problem32 {

    /**
     * Finds the length of the longest subarray whose sum is zero.
     *
     * Uses the Prefix Sum + HashMap approach.
     *
     * Observation:
     * If the same prefix sum occurs at two different indices,
     * then the sum of elements between those indices is zero.
     *
     * The first occurrence of every prefix sum is stored to
     * maximize the length of the zero-sum subarray.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static int maxSubarrayLength(int[] arr) {
        // Stores maximum zero-sum subarray length        
        int maxLength = 0;
        
        // Running prefix sum        
        int prefixSum = 0;
        
        // Maps prefix sum -> first occurrence index        
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update prefix sum            
            prefixSum += arr[i];

            // Entire array from 0 to i sums to zero
            if (prefixSum == 0) {
                maxLength = i + 1;
            } 
            // Prefix sum seen before            
            else if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } 
            // Store first occurrence of prefix sum            
            else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {6, -2, 2, -8, 1, 7, 4, -10};

        int result = maxSubarrayLength(arr);

        System.out.println(result);
    }

}
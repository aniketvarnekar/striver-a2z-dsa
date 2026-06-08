import java.util.*;

public class Problem33 {

    /**
     * Counts the number of subarrays whose XOR equals the target value.
     *
     * Uses the Prefix XOR + HashMap approach.
     *
     * Observation:
     * Let:
     * prefixXOR = XOR of elements from index 0 to i
     *
     * If:
     * prefixXOR ^ previousXOR = target
     *
     * then:
     * previousXOR = prefixXOR ^ target
     *
     * Therefore, for every prefix XOR, we check how many times
     * (prefixXOR ^ target) has occurred before.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static int countSubarrayXOR(int[] arr, int target) {
        // Stores running prefix XOR        
        int prefixXOR = 0;

        // Stores count of valid subarrays        
        int count = 0;

        // Maps prefix XOR -> frequency
        Map<Integer, Integer> map = new HashMap<>();
        // Base case: XOR 0 occurs once before traversal        
        map.put(0, 1);

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update prefix XOR            
            prefixXOR ^= arr[i];

            // Check if a valid previous XOR exists
            if (map.containsKey(prefixXOR ^ target)) {
                count += map.get(prefixXOR ^ target);
            }

            // Update frequency of current prefix XOR
            map.put(prefixXOR, map.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 2, 6, 4};
        int target = 6;

        int result = countSubarrayXOR(arr, target);

        System.out.println(result);
    }

}
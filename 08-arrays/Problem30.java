import java.util.*;

public class Problem30 {

    /**
     * Finds all unique triplets in the array whose sum is zero.
     *
     * This approach fixes one element and uses a HashSet
     * to find the remaining two elements that complete
     * the triplet.
     *
     * A HashSet of triplets is used to avoid duplicate results.
     *
     * Example:
     * Input: [-1, 0, 1, 2, -1, -4]
     * Output: [[-1, -1, 2], [-1, 0, 1]]
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(N) for HashSet + result storage
     */
    private static List<List<Integer>> threeSumV1(int[] arr) {
        int n = arr.length;

        // Stores unique triplets        
        Set<List<Integer>> result = new HashSet<>();

        // Fix first element
        for (int i = 0; i < n; i++) {
            // Stores elements seen so far for current i
            Set<Integer> hashSet = new HashSet<>();

            // Find remaining two elements
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                // Triplet found
                if (hashSet.contains(third)) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], third);
                    // Sort to ensure uniqueness
                    Collections.sort(list);
                    result.add(list);
                }

                hashSet.add(arr[j]);
            }
        }

        return new ArrayList<>(result);
    }

    /**
     * Finds all unique triplets in the array whose sum is zero.
     *
     * This optimized approach first sorts the array and then
     * uses the two-pointer technique to find valid triplets.
     *
     * Duplicate triplets are avoided by:
     * - Skipping duplicate values for the fixed element.
     * - Skipping duplicate values after finding a valid triplet.
     *
     * Example:
     * Input: [-1, 0, 1, 2, -1, -4]
     * Output: [[-1, -1, 2], [-1, 0, 1]]
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(1)
     * (excluding the space used for storing the result)
     */
    private static List<List<Integer>> threeSumV2(int[] arr) {
        int n = arr.length;

        // Stores all unique triplets
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array for two-pointer processing
        Arrays.sort(arr);

        // Fix the first element of the triplet
        for (int i = 0; i < n; i++) {
            // Skip duplicate fixed elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            // Find remaining two elements using two pointers
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                // Need a larger sum
                if (sum < 0) {
                    j++;
                } 
                // Need a smaller sum                
                else if (sum > 0) {
                    k--;
                } 
                // Valid triplet found                
                else {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(list);

                    j++;
                    k--;

                    // Skip duplicate values for j
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    // Skip duplicate values for k
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result1 = threeSumV1(arr);

        System.out.println(result1);

        List<List<Integer>> result2 = threeSumV2(arr);

        System.out.println(result2);
    }

}
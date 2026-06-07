import java.util.*;

public class Problem31 {

    /**
     * Finds all unique quadruplets whose sum equals the target.
     *
     * This approach fixes two elements and uses a HashSet
     * to find the fourth element required to complete
     * the quadruplet.
     *
     * Duplicate quadruplets are eliminated using a Set.
     *
     * Time Complexity: O(N³)
     * Space Complexity: O(N) + O(Result)
     */
    private static List<List<Integer>> fourSumV1(int[] arr, int target) {
        int n = arr.length;

        // Stores unique quadruplets
        Set<List<Integer>> result = new HashSet<>();

        // Fix first element
        for (int i = 0; i < n; i++) {
            // Fix second element
            for (int j = i + 1; j < n; j++) {
                // Stores previously seen elements
                Set<Integer> hashSet = new HashSet<>();
                
                // Find remaining two elements                
                for (int k = j + 1; k < n; k++) {
                    int fourth = target - (arr[i] + arr[j] + arr[k]);

                    // Quadruplet found                    
                    if (hashSet.contains(fourth)) {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        // Sort to avoid duplicates    
                        Collections.sort(list);
                        result.add(list);
                    }

                    hashSet.add(arr[k]);
                }
            }
        }

        return new ArrayList<>(result);
    }

    /**
     * Finds all unique quadruplets whose sum equals the target.
     *
     * This optimized approach sorts the array and uses
     * two nested loops along with the two-pointer technique.
     *
     * Duplicate quadruplets are avoided by skipping
     * repeated elements.
     *
     * Time Complexity: O(N³)
     * Space Complexity: O(1)
     * (excluding the space used for storing the result)
     */
    private static List<List<Integer>> fourSumV2(int[] arr, int target) {
        int n = arr.length;

        // Stores all unique quadruplets
        List<List<Integer>> result = new ArrayList<>();

        // Sort array for two-pointer processing
        Arrays.sort(arr);

        // Fix first element
        for (int i = 0; i < n; i++) {
            // Skip duplicates for first element            
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Fix second element
            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for second element                
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                // Find remaining two elements
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    // Need a larger sum
                    if (sum < target) {
                        k++;
                    }
                    // Need a smaller sum                    
                    else if (sum > target) {
                        l--;
                    } 
                    // Valid quadruplet found
                    else {
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        result.add(list);

                        k++;
                        l--;

                        // Skip duplicate third elements
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        // Skip duplicate fourth elements
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        List<List<Integer>> result1 = fourSumV1(arr, target);

        System.out.println(result1);

        List<List<Integer>> result2 = fourSumV2(arr, target);

        System.out.println(result2);                
    }

}
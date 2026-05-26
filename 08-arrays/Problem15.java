import java.util.*;

public class Problem15 {

    /**
     * Finds two indices such that the corresponding elements
     * add up to the target using HashMap.
     *
     * The HashMap stores array elements along with their indices.
     * For each element, the function checks whether the remaining
     * value required to reach the target already exists in the map.
     *
     * Returns the indices of the two elements if found,
     * otherwise returns {-1, -1}.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — HashMap stores array elements.
     */
    private static int[] twoSumV1(int[] arr, int target) {
        // Default result if no valid pair exists
        int[] result = new int[] {-1, -1};

        // HashMap to store element and its index        
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate required remaining value            
            int remaining = target - arr[i];

            // Check if remaining value already exists
            if (map.containsKey(remaining)) {
                // Store indices of valid pair                
                result[0] = map.get(remaining);
                result[1] = i;
                return result;
            }
            
            // Store current element and its index
            map.put(arr[i], i);
        }

        return result;
    }

    /**
     * Finds two indices such that the corresponding elements
     * add up to the target using sorting and two pointers.
     *
     * The array elements are stored along with their original indices,
     * then sorted. Two pointers are used to find the target sum.
     *
     * Returns the indices of the two elements if found,
     * otherwise returns {-1, -1}.
     *
     * Time Complexity: O(N log N) — due to sorting.
     * Space Complexity: O(N) — auxiliary array for indices.
     */
    private static int[] twoSumV2(int[] arr, int target) {
        int n = arr.length;

        // Default result if no valid pair exists        
        int[] result = new int[] {-1, -1};
        
        // Stores array elements with their original indices
        int[][] arrWithIndex = new int[n][2];

        // Fill auxiliary array
        for (int i = 0; i < arr.length; i++) {
            arrWithIndex[i][0] = arr[i];
            arrWithIndex[i][1] = i;
        }

        // Sort array based on values
        Arrays.sort(arrWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n - 1;

        // Traverse until pointers meet
        while (left < right) {
            // Calculate current sum            
            int sum = arrWithIndex[left][0] + arrWithIndex[right][0];

            // If target sum is found
            if (sum == target) {
                // Store original indices                
                result[0] = arrWithIndex[left][1];
                result[1] = arrWithIndex[right][1];
                return result;
            }
            
            // Increase sum by moving left pointer
            if (sum < target) {
                left++;
            } 
            // Decrease sum by moving right pointer
            else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 6, 5, 8, 11};
        int target = 14;

        int[] result1 = twoSumV1(arr, target);
        System.out.println(Arrays.toString(result1));

        int[] result2 = twoSumV2(arr, target);
        System.out.println(Arrays.toString(result2));
    }

}
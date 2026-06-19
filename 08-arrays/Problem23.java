import java.util.*;

public class Problem23 {

    /**
     * Finds the length of the longest consecutive sequence
     * in an unsorted array.
     *
     * Approach:
     * 1. Store all elements in a HashSet.
     * 2. Consider an element as the start of a sequence
     *    only if (element - 1) does not exist.
     * 3. Expand the sequence forward and count its length.
     * 4. Track the maximum sequence length found.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static int longestConsecutiveSequence(int[] arr) {
        // Empty array case        
        if (arr.length == 0) {
            return 0;
        }

        int longest = 1;

        // Store unique elements
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Check only sequence starters
        for (int element : set) {
            if (!set.contains(element - 1)) {
                int currentLongest = 1;
                while (set.contains(element + 1)) {
                    element++;
                    currentLongest++;
                }
                longest = Math.max(longest, currentLongest);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutiveSequence(arr);

        System.out.println(result);
    }

}
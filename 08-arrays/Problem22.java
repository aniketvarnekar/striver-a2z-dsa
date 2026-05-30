import java.util.*;

public class Problem22 {

    /**
     * Finds all leaders in the array.
     *
     * An element is considered a leader if it is greater than
     * all the elements to its right.
     *
     * The rightmost element is always a leader because there
     * are no elements to its right.
     *
     * The array is traversed from right to left while maintaining
     * the maximum element seen so far.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — stores the leader elements.
     */
    private static List<Integer> leaders(int[] arr) {
        int n = arr.length;

        // Rightmost element is always a leader
        int max = arr[n - 1];

        // Stores leader elements
        List<Integer> result = new ArrayList<>();
        result.add(arr[n - 1]);


        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Current element is a leader if it is greater
            // than all elements seen so far on the right            
            if (arr[i] > max) {
                result.add(arr[i]);
                max = arr[i];
            }
        }

        // Reverse list to restore original left-to-right order
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 22, 12, 3, 0, 6};

        List<Integer> result = leaders(arr);

        System.out.println(result);
    }

}
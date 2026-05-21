import java.util.*;

public class Problem05 {

    /**
     * Removes duplicates from a sorted array in-place.
     *
     * The function uses the two-pointer technique:
     * - Pointer i tracks the position of the last unique element
     * - Pointer j traverses the array
     *
     * Each unique element is placed at the next valid position.
     *
     * Returns the count of unique elements in the array.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — modifies array in-place.
     */    
    private static int removeDuplicates(int[] arr) {
        // Pointer to track position of last unique element        
        int i = 0;

        // Traverse array starting from second element
        for (int j = 1; j < arr.length; j++) {
            // If current element is different from previous unique element
            if (arr[j] != arr[i]) {
                // Move i to next position
                i++;
                // Place unique element at index i
                arr[i] = arr[j];
            }
        }

        // Number of unique elements is i + 1
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        int count = removeDuplicates(arr);

        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }

}
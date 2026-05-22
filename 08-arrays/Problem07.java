import java.util.*;

public class Problem07 {

    /**
     * Moves all zeroes in the array to the end while maintaining
     * the relative order of non-zero elements.
     *
     * The function first finds the position of the first zero,
     * then swaps subsequent non-zero elements into that position.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — modifies the array in-place.
     */
    private static void moveZeroes(int[] arr) {
        // Pointer to track position of first zero        
        int p = -1;

        // Find the index of the first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                p = i;
                break;
            }
        }

        // If no zero exists, array is already in desired form
        if (p == -1) {
            return;
        }

        // Traverse remaining elements
        for (int i = p + 1; i < arr.length; i++) {
            // If current element is non-zero
            if (arr[i] != 0) {
                // Swap non-zero element with element at pointer p
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;

                // Move pointer to next zero position
                p++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }

}
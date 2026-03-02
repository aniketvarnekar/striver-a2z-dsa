import java.util.*;

public class Problem06 {

     /**
     * Reverses the given array using an additional array.
     *
     * The function creates a new array and copies elements
     * from the end of the input array to the beginning
     * of the result array.
     *
     * Time Complexity: O(N) — iterates through all elements once.
     * Space Complexity: O(N) — uses an extra array of size N.
     */
    private static int[] reverseArrayBruteForce(int[] arr) {
        // Create new array of same size as input array
        int[] result = new int[arr.length];

        // Loop from 0 to (length of array - 1)
        for (int i = 0; i < arr.length; i++) {
            // Place elements from the end of arr into start of result
            result[i] = arr[arr.length - i - 1];
        }

        // Return reversed array
        return result;
    }

    /**
     * Reverses the given array in-place using the two-pointer technique.
     *
     * The function swaps elements from the beginning and end
     * of the array, moving inward until both pointers meet.
     *
     * Time Complexity: O(N) — each element is visited once.
     * Space Complexity: O(1) — reversal is done in-place.
     */
    private static void reverseArrayBetter(int[] arr) {
        // Initialize pointer to beginning of array
        int p1 = 0;
        // Initialize pointer to end of array
        int p2 = arr.length - 1;

        // Loop until two pointers meet in the middle
        while (p1 < p2) {
            // Swap the elements
            int temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;

            // Move left pointer one step to the right
            p1++;

            // Move right pointer one step to the left
            p2--;
        }
    }

    /**
     * Reverses the given array using recursion.
     *
     * The function swaps elements at the left and right indices
     * and recursively moves inward until the base condition
     * (left >= right) is reached.
     *
     * Time Complexity: O(N) — each element is swapped once.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void reverseArrayRecursiveV1(int left, int right, int[] arr) {
        // Base Case - stop when pointers cross or meet
        if (left >= right) {
            return;
        }

        // Swap elements at left and right positions
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move pointers towards the center
        left++;
        right--;

        // Recursive call with updated pointers
        reverseArrayRecursiveV1(left, right, arr);
    }

    /**
     * Reverses the given array using recursion (single index approach).
     *
     * The function swaps the element at the current index with its
     * corresponding element from the end of the array and recursively
     * increments the index until the middle of the array is reached.
     *
     * Time Complexity: O(N) — processes half of the array elements.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void reverseArrayRecursiveV2(int index, int[] arr) {
        // Base Case - stop when index reaches the middle of the array
        if (index >= arr.length / 2) {
            return;
        }

        // Swap element at current index with its mirror element
        int temp = arr[index];
        arr[index] = arr[arr.length - index - 1];
        arr[arr.length - index - 1] = temp;

        index++;

        // Recursive call with next index
        reverseArrayRecursiveV2(index, arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        int[] reversed = reverseArrayBruteForce(arr);
        System.out.println(Arrays.toString(reversed));

        arr = new int[] {5, 4, 3, 2, 1};
        reverseArrayBetter(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {5, 4, 3, 2, 1};
        reverseArrayRecursiveV1(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {5, 4, 3, 2, 1};
        reverseArrayRecursiveV2(0, arr);
        System.out.println(Arrays.toString(arr));
    }

}
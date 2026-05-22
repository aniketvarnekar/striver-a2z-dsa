import java.util.*;

public class Problem06 {

    /**
     * Rotates the array to the left by k positions using the reversal algorithm.
     *
     * Steps:
     * 1. Reverse the first k elements
     * 2. Reverse the remaining elements
     * 3. Reverse the entire array
     *
     * Time Complexity: O(N) — each element is processed a constant number of times.
     * Space Complexity: O(1) — rotation is done in-place.
     */
    private static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        // Normalize k to handle cases where k > n
        k = k % n;
        
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
        // Reverse entire array
        reverse(arr, 0, n - 1);
    }

    /**
     * Rotates the array to the right by k positions using the reversal algorithm.
     *
     * Steps:
     * 1. Reverse the entire array
     * 2. Reverse the first k elements
     * 3. Reverse the remaining elements
     *
     * Time Complexity: O(N) — each element is processed a constant number of times.
     * Space Complexity: O(1) — rotation is done in-place.
     */
    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        // Normalize k to handle cases where k > n
        k = k % n;
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    /**
     * Reverses elements in the array between given indices (inclusive).
     *
     * Uses two-pointer approach to swap elements from both ends.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static void reverse(int[] arr, int start, int end) {
        // Swap elements while moving pointers towards the center
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        rotateLeft(arr1, 2);
        rotateRight(arr2, 2);
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
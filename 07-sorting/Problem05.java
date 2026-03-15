import java.util.*;

public class Problem05 {

    /**
     * Sorts the array in ascending order using a recursive version
     * of the Bubble Sort algorithm.
     *
     * The algorithm performs one pass through the array to push the
     * largest element to the end. After each pass, the size of the
     * unsorted portion is reduced by one and the function calls itself
     * recursively for the remaining elements.
     *
     * An optimization is included: if no swaps occur during a pass,
     * the array is already sorted and recursion stops early.
     *
     * Time Complexity:
     * Best Case: O(N) — when the array is already sorted.
     * Average Case: O(N^2)
     * Worst Case: O(N^2)
     *
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: if the array size is 1 or less, it is already sorted
        if (n <= 1) {
            return;
        }

        // Flag to track whether any swap occurs during the pass
        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap adjacent elements if they are in the wrong order
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                // A swap occurred, so the array was not sorted
                isSorted = false;
            }
        }

        // If no swaps occurred, the array is already sorted
        if (isSorted) {
            return;
        }

        // Recursively sort the remaining unsorted portion of the array
        recursiveBubbleSort(arr, n - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {13, 46, 24, 52, 20, 9};
        recursiveBubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
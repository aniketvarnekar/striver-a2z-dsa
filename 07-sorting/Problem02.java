import java.util.*;

public class Problem02 {

     /**
     * Sorts the given array in ascending order using the Bubble Sort algorithm.
     *
     * The algorithm repeatedly compares adjacent elements and swaps them
     * if they are in the wrong order. After each pass, the largest element
     * moves to its correct position at the end of the array.
     *
     * An optimization is used to stop early if no swaps occur in a pass,
     * indicating that the array is already sorted.
     *
     * Time Complexity:
     * Best Case: O(N) — when the array is already sorted.
     * Average Case: O(N^2)
     * Worst Case: O(N^2)
     *
     * Space Complexity: O(1) — sorting is done in-place.
     */
    private static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            // Flag to check if any swap happens during this pass
            boolean isSorted = true;
            // Compare adjacent elements in the unsorted portion
            for (int j = 0; j < i; j++) {
                // If current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Mark that a swap occurred
                    isSorted = false;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {13, 46, 24, 52, 20, 9};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
import java.util.*;

public class Problem03 {

    /**
     * Sorts the given array in ascending order using the Insertion Sort algorithm.
     *
     * The algorithm builds the sorted portion of the array one element at a time.
     * It takes each element and inserts it into its correct position in the
     * already sorted left part of the array.
     *
     * Time Complexity:
     * Best Case: O(N) — when the array is already sorted.
     * Average Case: O(N^2)
     * Worst Case: O(N^2) — when the array is sorted in reverse order.
     *
     * Space Complexity: O(1) — sorting is done in-place.
     */
    private static void insertionSort(int[] arr, int n) {
        // Start from the second element since the first element is considered sorted
        for (int i = 1; i < n; i++) {
            // Initialize pointer to current index
            int j = i;
            // Move the current element backwards until it reaches its correct position
            // in the sorted portion of the array
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] with arr[j - 1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                // Move one position to the left
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 4, 1, 5, 3};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
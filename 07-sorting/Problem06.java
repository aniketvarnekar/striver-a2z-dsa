import java.util.*;

public class Problem06 {

    /**
     * Sorts the array in ascending order using a recursive version
     * of the Insertion Sort algorithm.
     *
     * The algorithm assumes that the first (n-1) elements are already
     * sorted and inserts the nth element into its correct position
     * within the sorted portion of the array.
     *
     * The function recursively increases the sorted portion size
     * until the entire array is sorted.
     *
     * Time Complexity:
     * Best Case: O(N) — when the array is already sorted.
     * Average Case: O(N^2)
     * Worst Case: O(N^2) — when the array is sorted in reverse order.
     *
     * Space Complexity: O(N) — due to recursion call stack.
 */
    private static void recursiveInsertionSort(int[] arr, int n) {
        // Base case: when n reaches array length, sorting is complete
        if (n == arr.length) {
            return;
        }

        // Start inserting the element at index n
        int index = n;
        
        // Move the current element left until it reaches its correct position
        // in the already sorted portion of the array
        while (index > 0 && arr[index] < arr[index -1]) {
            // Swap arr[index] with arr[index - 1]
            int temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
            
            // Move one position to the left
            index--;
        }

        // Recursively sort the next element
        recursiveInsertionSort(arr, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {13, 46, 24, 52, 20, 9};
        recursiveInsertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

}
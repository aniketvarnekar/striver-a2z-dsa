import java.util.*;

public class Problem07 {

    /**
     * Sorts the array in ascending order using the Quick Sort algorithm.
     *
     * Quick Sort is a divide-and-conquer algorithm that selects a pivot
     * element and partitions the array such that elements smaller than
     * the pivot are placed on the left, and larger elements on the right.
     *
     * The process is recursively applied to the left and right subarrays.
     *
     * Time Complexity:
     * Best Case: O(N log N)
     * Average Case: O(N log N)
     * Worst Case: O(N^2) — when the pivot is always the smallest or largest element
     *
     * Space Complexity: O(N) — due to recursion stack (in-place sorting).
     */
    private static void quickSort(int[] arr, int start, int end) {
        // Base case: if the subarray has one or no elements
        if (start >= end) {
            return;
        }

        // Partition the array and get the pivot index
        int partitionIndex = partition(arr, start, end);

        // Recursively sort elements before pivot
        quickSort(arr, start, partitionIndex - 1);
        // Recursively sort elements after pivot
        quickSort(arr, partitionIndex + 1, end);
    }

    /**
     * Partitions the array around a pivot element.
     *
     * Elements smaller than or equal to the pivot are moved to the left,
     * and elements greater than the pivot are moved to the right.
     *
     * Returns the final position of the pivot.
     */
    private static int partition(int[] arr, int start, int end) {
        // Choose the last element as pivot
        int pivot = arr[end];

        // Index to place smaller elements
        int partitionIndex = start;

        // Traverse the array and rearrange elements
        for (int i = start; i < end; i++) {
            // If current element is less than or equal to pivot
            if (arr[i] <= pivot) {
                // Swap with partitionIndex element
                swap(arr, i, partitionIndex);
                // Move partitionIndex forward
                partitionIndex++;
            }
        }

        // Place pivot in its correct sorted position
        swap(arr, partitionIndex, end);

        return partitionIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 7, 9, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
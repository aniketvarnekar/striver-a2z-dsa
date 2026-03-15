import java.util.*;

public class Problem04 {

     /**
     * Merges two sorted subarrays of the given array into a single sorted segment.
     *
     * The first subarray is arr[low..mid] and the second subarray is arr[mid+1..high].
     * A temporary list is used to store elements in sorted order and then copied
     * back into the original array.
     *
     * Time Complexity: O(N) — where N is the number of elements between low and high.
     * Space Complexity: O(N) — uses an auxiliary list to store merged elements.
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        // Temporary list to store merged sorted elements
        List<Integer> list = new ArrayList<>();
        // Pointer for left subarray
        int left = low;
        // Pointer for right subarray
        int right = mid + 1;

        // Compare elements from both subarrays and add the smaller one
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from the left subarray
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        // Add remaining elements from the right subarray
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        // Copy merged elements back to the original array
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }
    }

     /**
     * Sorts the array using the Merge Sort algorithm.
     *
     * Merge Sort is a divide-and-conquer algorithm that recursively divides
     * the array into two halves, sorts them, and then merges the sorted halves.
     *
     * Time Complexity:
     * Best Case: O(N log N)
     * Average Case: O(N log N)
     * Worst Case: O(N log N)
     *
     * Space Complexity: O(N) — additional space is required for merging.
     */
    private static void mergeSort(int[] arr, int low, int high) {
        // Base case: if the array has only one element, it is already sorted
        if (low == high) {
            return;
        }

        // Find the middle index
        int mid = (low + high) / 2;

        // Recursively sort the left half
        mergeSort(arr, low, mid);
        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);
        // Merge the two sorted halves
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 8, 5, 1, 4, 23};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
import java.util.*;

public class Problem38 {

    /**
     * Counts inversions in the array using Merge Sort.
     *
     * An inversion is a pair of indices (i, j) such that:
     *
     * i < j and arr[i] > arr[j]
     *
     * The merge sort divides the array into smaller parts,
     * counts inversions in each half, and counts cross
     * inversions while merging.
     *
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */
    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;

        // Base case        
        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        // Count inversions in left half
        count += mergeSort(arr, low, mid);
        // Count inversions in right half        
        count += mergeSort(arr, mid + 1, high);
        // Count cross inversions while merging        
        count += merge(arr, low, mid, high);
        
        return count;
    }

    /**
     * Merges two sorted halves and counts inversions
     * between them.
     *
     * Whenever an element from the right half is placed
     * before an element from the left half, all remaining
     * elements in the left half form inversions with it.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int left = low;
        int right = mid + 1;

        List<Integer> list = new ArrayList<>();

        // Merge two sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
                // Count inversions                
                count += mid - left + 1;
            }
        }

        // Copy remaining left-half elements
        while (left <= mid) {
            list.add(arr[left++]);
        }

        // Copy remaining right-half elements
        while (right <= high) {
            list.add(arr[right++]);
        }

        // Copy merged result back to array
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 2, 1, 4};

        int count = mergeSort(arr, 0, arr.length - 1);

        System.out.println(count);
    }

}
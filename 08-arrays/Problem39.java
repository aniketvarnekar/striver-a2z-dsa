import java.util.*;

public class Problem39 {

    /**
     * Counts the number of reverse pairs in the array
     * using the Merge Sort technique.
     *
     * A reverse pair is defined as:
     *
     * i < j and arr[i] > 2 * arr[j]
     *
     * The array is recursively divided into two halves.
     * Reverse pairs are counted:
     * 1. In the left half.
     * 2. In the right half.
     * 3. Across both halves.
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

        // Count reverse pairs in left half
        count += mergeSort(arr, low, mid);
        
        // Count reverse pairs in right half        
        count += mergeSort(arr, mid + 1, high);

        // Count reverse pairs across both halves        
        count += countPairs(arr, low, mid, high);
        
        // Merge the sorted halves        
        merge(arr, low, mid, high);

        return count;
    }

    /**
     * Counts reverse pairs between two sorted halves.
     *
     * Left half:  [low ... mid]
     * Right half: [mid+1 ... high]
     *
     * Since both halves are already sorted, a two-pointer
     * approach can efficiently count valid pairs.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        // Count valid reverse pairs
        for (int left = low; left <= mid; left++) {
            while (right <= high && arr[left] > 2 * (long) arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }

        return count;
    }

    /**
     * Merges two sorted halves into a single sorted segment.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Merge sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left++]);
            } else {
                list.add(arr[right++]);
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

        // Copy merged elements back to array
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        int count = mergeSort(arr, 0, arr.length - 1);

        System.out.println(count);
    }

}
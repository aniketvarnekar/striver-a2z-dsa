import java.util.*;

public class Problem16 {

    /**
     * Sorts an array containing only 0s, 1s, and 2s
     * using the Dutch National Flag algorithm.
     *
     * The algorithm maintains three regions:
     *   0 to low - 1     -> contains 0s
     *   low to mid - 1   -> contains 1s
     *   high + 1 to end  -> contains 2s
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — sorting is done in-place.
     */
    private static void sortZeroOneTwo(int[] arr) {
        // Pointer for next position of 0
        int low = 0;
        
        // Current element pointer
        int mid = 0;
        
        // Pointer for next position of 2
        int high = arr.length - 1;

        // Traverse array until mid crosses high
        while (mid <= high) {
            // If current element is 0            
            if (arr[mid] == 0) {
                // Place 0 in correct region                
                swap(arr, mid, low);
                low++;
                mid++;
            }

            // If current element is 1
            else if (arr[mid] == 1) {
                // 1 is already in correct region                
                mid++;
            }

            // If current element is 2
            else {
                // Place 2 in correct region                
                swap(arr, mid, high);
                high--;
                // Do not increment mid here because swapped element
                // from high needs to be processed
            }
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, 2, 1, 0};
        
        sortZeroOneTwo(arr);

        System.out.println(Arrays.toString(arr));
    }

}
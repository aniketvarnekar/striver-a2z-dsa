import java.util.*;

public class Problem21 {

    /**
     * Rearranges the array into its next lexicographically greater permutation.
     *
     * If such a permutation does not exist (i.e., the array is in descending
     * order), the array is rearranged into the lowest possible order
     * (ascending order).
     *
     * Algorithm:
     * 1. Find the first index from the right where arr[i] < arr[i + 1].
     * 2. Find the smallest element greater than arr[index] on its right.
     * 3. Swap them.
     * 4. Reverse the suffix starting from index + 1.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Stores the breakpoint index
        int index = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no breakpoint exists, current permutation is the largest
        if (index == -1) {
            // Reverse entire array to obtain smallest permutation            
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element from the right
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[index]) {
                // Step 3: Swap breakpoint element                
                swap(arr, index, i);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(arr, index + 1, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 5, 4, 3, 0, 0};

        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }

}
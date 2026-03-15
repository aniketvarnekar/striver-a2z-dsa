import java.util.*;

public class Problem01 {

     /**
     * Sorts the array in ascending order using the Selection Sort algorithm.
     *
     * The algorithm repeatedly selects the smallest element from the
     * unsorted portion of the array and swaps it with the first element
     * of the unsorted section.
     *
     * Time Complexity: O(N^2) — nested loops are used to find the minimum element.
     * Space Complexity: O(1) — sorting is performed in-place without extra space.
     */
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Assume current index as minIndex
            int minIndex = i;

            // Find minimum element in remaining array and update minIndex
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with first element of unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {13, 46, 24, 52, 20, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
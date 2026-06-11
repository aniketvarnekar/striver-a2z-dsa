import java.util.*;

public class Problem35 {

    /**
     * Merges two sorted arrays into the first array in-place.
     *
     * The first array has enough extra space at the end to hold
     * all elements of the second array.
     *
     * Algorithm:
     * 1. Start from the end of both arrays.
     * 2. Compare the largest remaining elements.
     * 3. Place the larger element at the end of arr1.
     * 4. Continue until all elements are merged.
     *
     * Time Complexity: O(m + n)
     * Space Complexity: O(1)
     */
    private static void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        // Last valid element in arr1
        int left = m - 1;

        // Last element in arr2
        int right = n - 1;

        // Last position in merged array        
        int index = m + n - 1;

        // Merge from the end
        while (left >= 0 && right >= 0) {
            if (arr1[left] >= arr2[right]) {
                arr1[index] = arr1[left];
                left--;
            } else {
                arr1[index] = arr2[right];
                right--;                
            }
            index--;
        }

        // Copy remaining elements from arr1
        while (left >= 0) {
            arr1[index] = arr1[left];
            left--;   
            index--;         
        }

        // Copy remaining elements from arr2
        while (right >= 0) {
            arr1[index] = arr2[right];
            right--;    
            index--;          
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0};
        int[] arr2 = {2, 4, 6};

        mergeSortedArrays(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }

}
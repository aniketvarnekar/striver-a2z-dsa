import java.util.*;

public class Problem36 {

    /**
     * Merges two sorted arrays without using extra space.
     *
     * Approach:
     * 1. Compare the largest elements of arr1 with the smallest
     *    elements of arr2.
     * 2. Swap whenever arr1 contains a larger element.
     * 3. Sort both arrays individually after swapping.
     *
     * Time Complexity: O(min(m, n)) + O(m log m) + O(n log n)
     * Space Complexity: O(1)
     */
    private static void mergeSortedArraysV1(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int left = m - 1;
        int right = 0;

        // Move larger elements to arr2 and smaller elements to arr1
        while (left >= 0 && right < n) {
            if (arr2[right] <= arr1[left]) {
                swap(arr1, left, arr2, right);
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    /**
     * Merges two sorted arrays without using extra space
     * using the Gap Method (Shell Sort technique).
     *
     * Treats both arrays as a single virtual array and
     * repeatedly compares elements that are 'gap' distance apart.
     *
     * Time Complexity: O((m + n) log(m + n))
     * Space Complexity: O(1)
     */
    private static void mergeSortedArraysV2(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int length = m + n;
        
        // Initial gap
        int gap = (length / 2) + (length % 2);

        while (gap > 0) {
            int left = 0;
            int right = gap;

            while (right < length) {
                // Both pointers in arr1                
                if (left < m && right < m) {
                    swapIfGreater(arr1, left, arr1, right);
                }
                // Both pointers in arr2                
                else if (left >= m && right >= m) {
                    swapIfGreater(arr2, left - m, arr2, right - m);
                } 
                // One pointer in each array                
                else {
                    swapIfGreater(arr1, left, arr2, right - m);
                }
                left++;
                right++;
            }

            // Last iteration completed
            if (gap == 1) {
                break;
            }

            // Calculate next gap
            gap = (gap / 2) + (gap % 2);
        }
    }

    private static void swapIfGreater(int[] arr1, int x, int[] arr2, int y) {
        if (arr1[x] > arr2[y]) {
            int temp = arr1[x];
            arr1[x] = arr2[y];
            arr2[y] = temp;            
        }
    }

    private static void swap(int[] arr1, int x, int[] arr2, int y) {
        int temp = arr1[x];
        arr1[x] = arr2[y];
        arr2[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 7};
        int[] arr2 = new int[] {0, 2, 6, 8, 9};

        mergeSortedArraysV1(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[] {1, 3, 5, 7};
        int[] arr4 = new int[] {0, 2, 6, 8, 9};

        mergeSortedArraysV2(arr3, arr4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

}
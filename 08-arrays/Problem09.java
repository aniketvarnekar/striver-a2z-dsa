import java.util.*;

public class Problem09 {

    /**
     * Finds the union of two sorted arrays.
     *
     * The union contains all unique elements present in either array.
     * Duplicate elements are included only once in the result.
     *
     * The function uses the two-pointer technique to efficiently
     * traverse both arrays simultaneously.
     *
     * Time Complexity: O(N + M) — each array is traversed once.
     * Space Complexity: O(N + M) — stores union of both arrays.
     */
    private static List<Integer> union(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // Pointers for arr1 and arr2
        int i = 0, j = 0;

        // List to store union elements
        List<Integer> union = new ArrayList<>();

        // Traverse both arrays
        while (i < n && j < m) {
            // If current element in arr1 is smaller            
            if (arr1[i] < arr2[j]) {
                // Add element if it is not already present at end of union                
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            // If current element in arr2 is smaller            
            else if (arr2[j] < arr1[i]) {
                // Add element if it is not already present at end of union                
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
            // If both elements are equal            
            else {
                // Add element only once                
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[] {2, 3, 4, 4, 5, 11, 12};

        List<Integer> union = union(arr1, arr2);

        System.out.println(union);
    }

}
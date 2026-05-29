import java.util.*;

public class Problem20 {

    /**
     * Rearranges the array such that positive and negative
     * elements appear alternately.
     *
     * This approach stores positive and negative elements
     * separately using two lists and then places them back
     * alternately into the original array.
     *
     * Assumption:
     * Number of positive and negative elements are equal.
     *
     * Time Complexity: O(N) — traverses the array multiple times.
     * Space Complexity: O(N) — extra lists are used.
     */
    private static int[] rearrangeBySignV1(int[] arr) {
        // Stores positive elements        
        List<Integer> positives = new ArrayList<>();

        // Stores negative elements
        List<Integer> negatives = new ArrayList<>();

        // Separate positive and negative elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives.add(arr[i]);
            } else {
                negatives.add(arr[i]);
            }
        }

        // Place positive and negative elements alternately
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = positives.get(i);
            arr[2 * i + 1] = negatives.get(i);
        }

        return arr;
    }

    /**
     * Rearranges the array such that positive and negative
     * elements appear alternately using an auxiliary array.
     *
     * Positive elements are placed at even indices
     * and negative elements are placed at odd indices.
     *
     * Assumption:
     * Number of positive and negative elements are equal.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — auxiliary array is used.
     */
    private static int[] rearrangeBySignV2(int[] arr) {
        // Result array
        int[] result = new int[arr.length];

        // Even index for positive numbers        
        int positiveIndex = 0;

        // Odd index for negative numbers        
        int negativeIndex = 1;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Place positive number at even index            
            if (arr[i] > 0) {
                result[positiveIndex] = arr[i];
                positiveIndex += 2;
            } 
            // Place negative number at odd index            
            else {
                result[negativeIndex] = arr[i];
                negativeIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, -4, -5};
        int[] result1 = rearrangeBySignV1(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = new int[] {1, 2, -3, -1, -2, 3};
        int[] result2 = rearrangeBySignV2(arr2);
        System.out.println(Arrays.toString(result2));
    }

}
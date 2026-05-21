public class Problem04 {

    /**
     * Checks whether the given array is sorted and rotated.
     *
     * An array is considered sorted and rotated if it was originally
     * sorted in non-decreasing order and then rotated some number of times.
     *
     * The function counts the number of positions where the current
     * element is greater than the next element. For a valid sorted
     * and rotated array, this count should not exceed 1.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        // Count number of decreasing points in the array        
        int count = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Compare current element with next element
            // (i + 1) % n handles circular comparison for last element
            if (arr[(i + 1) % n] < arr[i]) {
                count++;
            }

            // More than one decreasing point means array is not sorted and rotated
            if (count > 1) {
                return false;
            }
        }

        // Array is sorted and rotated
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 1, 2};
        boolean isSortedAndRotated = isSortedAndRotated(arr);

        System.out.println(isSortedAndRotated);
    }

}
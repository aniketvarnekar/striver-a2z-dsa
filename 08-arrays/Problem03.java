public class Problem03 {

    /**
     * Checks whether the given array is sorted in ascending order.
     *
     * The function compares each element with its previous element.
     * If any element is smaller than the previous one, the array
     * is not sorted in ascending order.
     *
     * Time Complexity: O(N) — traverses the array once.
     * Space Complexity: O(1) — uses constant extra space.
     */    
    private static boolean isSortedAscending(int[] arr) {
        // Traverse the array starting from index 1        
        for (int i = 1; i < arr.length; i++) {
            // If current element is smaller than previous element, array is not sorted
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 6, 7, 8};
        boolean isSortedAscending = isSortedAscending(arr);

        System.out.println(isSortedAscending);
    }

}
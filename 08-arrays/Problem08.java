public class Problem08 {

    /**
     * Searches for a target element in the array using Linear Search.
     *
     * The function traverses the array sequentially and returns
     * the index of the target element if found.
     *
     * Returns -1 if the element does not exist in the array.
     *
     * Time Complexity: O(N) — in the worst case, every element is checked.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int linearSearch(int[] arr, int num) {
        // Traverse the array        
        for (int i = 0; i < arr.length; i++) {
            // If target element is found, return its index
            if (arr[i] == num) {
                return i;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        int index = linearSearch(arr, 3);

        System.out.println(index);
    }

}
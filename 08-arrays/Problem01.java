public class Problem01 {
    
    /**
     * Finds and returns the largest element in the given array.
     *
     * The function traverses the array and continuously updates
     * the largest value encountered.
     *
     * Time Complexity: O(N) — traverses the array once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int findLargest(int[] arr) {
        // Initialize largest with the first element        
        int largest = arr[0];

        // Traverse the remaining elements
        for (int i = 1; i < arr.length; i++) {
            // Update largest if current element is greater
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Return the largest element
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {8, 10, 5, 7, 9};
        int largest = findLargest(arr);

        System.out.println("Largest element : " + largest);
    }

}
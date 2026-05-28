public class Problem17 {

    /**
     * Finds the majority element in the array using
     * Moore’s Voting Algorithm.
     *
     * A majority element is an element that appears
     * more than n / 2 times in the array.
     *
     * The algorithm works in two steps:
     * 1. Find a potential candidate.
     * 2. Verify whether the candidate is actually a majority element.
     *
     * Returns the majority element if it exists,
     * otherwise returns -1.
     *
     * Time Complexity: O(N) — two traversals of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int majorityElement(int[] arr) {
        // Stores current count
        int count = 0;
        
        // Stores potential majority candidate
        int element = 0;

        // Step 1: Find candidate using Moore's Voting Algorithm
        for (int i = 0; i < arr.length; i++) {
            // If count becomes 0, choose new candidate            
            if (count == 0) {
                count = 1;
                element = arr[i];
            } 

            // Increment count if current element matches candidate
            else if (arr[i] == element) {
                count++;
            }

            // Otherwise decrement count            
            else {
                count--;
            }
        }

        // Step 2: Verify candidate frequency
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        // Check if candidate appears more than n / 2 times
        if (count > arr.length / 2) {
            return element;
        }

        // No majority element exists
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int result = majorityElement(arr);

        System.out.println(result);
    }

}
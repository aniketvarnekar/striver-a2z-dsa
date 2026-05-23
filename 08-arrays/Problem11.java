public class Problem11 {

    /**
     * Finds the maximum number of consecutive 1s in the array.
     *
     * The function traverses the array while maintaining a count
     * of consecutive 1s. Whenever a 0 is encountered, the count
     * is reset.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int maxConsecutiveOnes(int[] arr) {
        // Stores maximum consecutive ones found        
        int max = 0;
        // Stores current consecutive ones count        
        int count = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is 1, increment count            
            if (arr[i] == 1) {
                count++;
            }
            // Reset count if current element is 0                
            else {
                count = 0;
            }
            // Update maximum consecutive ones
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};

        int count = maxConsecutiveOnes(arr);

        System.out.println(count);
    }

}
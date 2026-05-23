public class Problem13 {

    /**
     * Finds the length of the longest subarray with sum equal to k.
     *
     * The function uses the sliding window technique.
     * The window expands by moving the right pointer and shrinks
     * by moving the left pointer whenever the sum exceeds k.
     *
     * Note:
     * This approach works only for arrays containing positive integers.
     *
     * Time Complexity: O(N) — each element is visited at most twice.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int longestSubarray(int[] arr, int k) {
        // Left pointer of sliding window        
        int left = 0;

        // Stores maximum subarray length
        int maxLength = 0;

        // Stores current window sum        
        int sum = 0;

        // Traverse array using right pointer
        for (int right = 0; right < arr.length; right++) {
            // Add current element to window sum            
            sum += arr[right];

            // Shrink window while sum exceeds k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Update maximum length if sum becomes k
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 5, 2, 7, 1, 9};
        int k = 15;

        int result = longestSubarray(arr, k);

        System.out.println(result);
    }

}
public class Problem16 {

    /**
     * Finds the minimum eating speed required for Koko
     * to finish all banana piles within h hours.
     *
     * Uses Binary Search on the answer space:
     * [1, maximum pile size].
     *
     * Time Complexity: O(N * log M)
     * where M is the maximum pile size.
     *
     * Space Complexity: O(1)
     */
    private static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        // Find the maximum pile size
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Current speed is sufficient
            int totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                result = Math.min(result, mid);
                high = mid - 1;
            } 
            // Need to eat faster            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Calculates the total hours required to finish
     * all piles at the given eating speed.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateTotalHours(int[] piles, int eatingSpeed) {
        int totalHours = 0;

        for (int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil((double) piles[i] / eatingSpeed);
        }

        return totalHours;
    }

    public static void main(String[] args) {
        int[] piles = new int[] {7, 15, 6, 3};
        int h = 8;

        int result = minEatingSpeed(piles, h);

        System.out.println(result);
    }

}
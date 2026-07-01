public class Problem19 {

    /**
     * Finds the minimum ship capacity required
     * to ship all packages within the given number
     * of days.
     *
     * Uses Binary Search on the answer space:
     * [maximum package weight, sum of all weights].
     *
     * Time Complexity: O(N * log S)
     * where S is the sum of all package weights.
     *
     * Space Complexity: O(1)
     */
    private static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Determine search space
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int low = max;
        int high = sum;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysRequired = calculateDaysRequired(weights, mid);

            // Current capacity is sufficient
            if (daysRequired <= days) {
                result = mid;
                high = mid - 1;
            } 

            // Increase the ship capacity            
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    /**
     * Calculates the number of days required
     * to ship all packages with the given capacity.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateDaysRequired(int[] weights, int capacity) {
        int days = 1;
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentWeight + weights[i] > capacity) {
                days++;
                currentWeight = weights[i];
            } else {
                currentWeight += weights[i];
            }
        }

        return days;
    }

    public static void main(String[] args) {
        int[] weights = new int[] {5, 4, 5, 2, 3, 4, 5, 6};
        int days = 5;

        int result = shipWithinDays(weights, days);

        System.out.println(result);
    }

}
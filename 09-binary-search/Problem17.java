public class Problem17 {

   /**
     * Finds the minimum number of days required
     * to make m bouquets, where each bouquet
     * requires k adjacent flowers.
     *
     * Returns -1 if it is impossible.
     *
     * Uses Binary Search on the answer space:
     * [minimum bloom day, maximum bloom day].
     *
     * Time Complexity: O(N * log D)
     * where D = maxBloomDay - minBloomDay.
     *
     * Space Complexity: O(1)
     */
    private static int minDaysToMakeBouquets(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // Not enough flowers
        if (m * k > n) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find search space
        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        int low = min;
        int high = max;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalBouquets = calculateTotalBouquets(bloomDay, mid, k);

            // Possible to make required bouquets
            if (totalBouquets >= m) {
                result = mid;
                high = mid - 1;
            } 

            // Need more days            
            else {
                low = mid + 1;
            }
        }

        return result;
    }


    /**
     * Counts how many bouquets can be formed
     * after the given number of days.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateTotalBouquets(int[] bloomDay, int days, int k) {
        int count = 0;
        int totalBouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (days >= bloomDay[i]) {
                count++;
            } else {
                totalBouquets += count / k;
                count = 0;
            }
        }

        totalBouquets += count / k;

        return totalBouquets;
    }

    public static void main(String[] args) {
        int[] bloomDay = new int[] {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;

        int result = minDaysToMakeBouquets(bloomDay, m, k);

        System.out.println(result);
    }

}
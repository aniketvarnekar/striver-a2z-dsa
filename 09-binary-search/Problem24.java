public class Problem24 {

    /**
     * Finds the minimum time required to paint
     * all boards using k painters.
     *
     * Each painter paints contiguous boards only.
     *
     * Uses Binary Search on the answer space:
     * [maximum board length, total board length].
     *
     * Time Complexity: O(N * log S)
     * where S is the sum of all board lengths.
     *
     * Space Complexity: O(1)
     */
    private static int findMinimumTime(int[] boards, int k) {
        // More painters than boards is allowed.
        // Some painters may remain idle.
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Determine search space
        for (int i = 0; i < boards.length; i++) {
            max = Math.max(max, boards[i]);
            sum += boards[i];
        }

        int low = max;
        int high = sum;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int painters = calculatePainters(boards, mid);

            // Possible within k painters
            if (painters <= k) {
                result = mid;
                high = mid - 1;
            } 

            // Increase allowed time            
            else {
                low = mid + 1;
            }
        }

        return result;
    }


    /**
     * Calculates the minimum number of painters
     * required if each painter can paint at most
     * maxTime units.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculatePainters(int[] boards, int maxTime) {
        int painters = 1;
        int totalTime = 0;

        for (int i = 0; i < boards.length; i++) {
            if (totalTime + boards[i] > maxTime) {
                painters++;
                totalTime = boards[i];
            } else {
                totalTime += boards[i];
            }
        }

        return painters;
    }

    public static void main(String[] args) {
        int[] boards = new int[] {10, 20, 30, 40};
        int k = 2;

        int result = findMinimumTime(boards, k);

        System.out.println(result);
    }

}
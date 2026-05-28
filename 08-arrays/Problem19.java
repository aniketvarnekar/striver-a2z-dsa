public class Problem19 {

    /**
     * Finds the maximum profit that can be achieved
     * by buying and selling a stock once.
     *
     * The function tracks:
     * - the minimum stock price seen so far
     * - the maximum profit possible at each step
     *
     * The stock must be bought before it is sold.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int stockBuySell(int[] arr) {
        // Stores minimum stock price seen so far        
        int minimum = arr[0];

        // Stores maximum profit        
        int profit = 0;

        // Traverse stock prices starting from day 1
        for (int i = 1; i < arr.length; i++) {
            // Calculate profit if stock is sold today            
            profit = Math.max(profit, arr[i] - minimum);

            // Update minimum stock price
            minimum = Math.min(minimum, arr[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 1, 5, 3, 6, 4};

        int profit = stockBuySell(arr);

        System.out.println(profit);
    }

}
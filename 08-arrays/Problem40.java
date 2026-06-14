public class Problem40 {

    /**
     * Finds the maximum product of any contiguous subarray.
     *
     * This approach maintains both prefix and suffix products.
     * It handles negative numbers and zeros efficiently:
     *
     * - A zero breaks the product chain, so the product is reset.
     * - A negative number can turn a small product into a large one
     *   when multiplied by another negative number.
     *
     * Therefore, we traverse from both directions and keep track
     * of the maximum product encountered.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int maximumProductSubarray(int[] arr) {
        int n = arr.length;

        // Stores the maximum product found so far        
        int maxProduct = Integer.MIN_VALUE;

        // Prefix and suffix products        
        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 0; i < n; i++) {
            // Reset prefix product after encountering zero            
            if (prefixProduct == 0) {
                prefixProduct = 1;
            }
            // Reset suffix product after encountering zero            
            if (suffixProduct == 0) {
                suffixProduct = 1;
            }

            // Product from left to right
            prefixProduct *= arr[i];

            // Product from right to left            
            suffixProduct *= arr[n - i - 1];

            // Update maximum product
            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }

        return maxProduct;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, -3, 0, -4, -5};

        int result = maximumProductSubarray(arr);

        System.out.println(result);
    }

}
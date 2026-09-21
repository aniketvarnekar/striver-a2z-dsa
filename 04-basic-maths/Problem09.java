public class Problem09 {

    /**
     * Finds the largest digit present in the given number.
     *
     * The last digit is extracted using n % 10.
     * The current digit is compared with the largest digit
     * found so far.
     *
     * After processing the digit, n is divided by 10
     * to remove the last digit.
     *
     * Time Complexity: O(log10 N)
     * Space Complexity: O(1)
     */
    private static int largestDigit(int n) {
        int largestDigit = 0;

        // Process each digit from right to left
        while (n != 0) {
            // Extract the last digit            
            int digit = n % 10;

            // Update the largest digit if the current
            // digit is greater                        
            largestDigit = Math.max(largestDigit, digit);

            // Remove the last digit            
            n = n / 10;
        }

        return largestDigit;
    }

    public static void main(String[] args) {
        int n = 12345;
        int result = largestDigit(n);

        System.out.println(result);
    }

}
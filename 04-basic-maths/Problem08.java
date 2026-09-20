public class Problem08 {

    /**
     * Counts the number of odd digits in a given integer.
     *
     * The last digit is extracted using n % 10.
     * After processing the digit, n is divided by 10
     * to remove the last digit.
     *
     * Time Complexity: O(log10 N), since the number of digits in N is
     * floor(log10 N) + 1 and each iteration processes one digit.
     * Space Complexity: O(1).
     */
    private static int countOddDigit(int n) {
        int count = 0;
        
        // Process each digit from right to left        
        while (n != 0) {
            // Extract the last digit            
            int digit = n % 10;

            // Check whether the digit is odd            
            if (digit % 2 != 0) {
                count++;
            }

            // Remove the last digit            
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        int result = countOddDigit(n);

        System.out.println(result);
    }

}
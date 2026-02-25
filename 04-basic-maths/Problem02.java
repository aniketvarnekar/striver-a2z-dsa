public class Problem02 {

    /**
     * Optimal approach: repeatedly extract the last digit of the number
     * using modulus (%) and build the reversed number by multiplying the
     * current result by 10 and adding the extracted digit.
     *
     * Note: Trailing zeros in the original number are naturally removed
     * during reversal (e.g., 10400 → 401).
     *
     * Time Complexity: O(log10 N) — the loop runs once per digit in the number.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static int reverseNumber(int number) {
        int reverseNumber = 0;

        // Loop until all digits are processed
        while (number > 0) {
            // Extract last digit from number
            int lastDigit = number % 10;
            // Append last digit to reverseNumber
            reverseNumber = (reverseNumber * 10) + lastDigit;
            // Remove last digit from number
            number /= 10;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        int reverseNumber = reverseNumber(10400);
        System.out.println(reverseNumber);
    }

}
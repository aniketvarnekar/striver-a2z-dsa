public class Problem03 {

    /**
     * Optimal approach: reverses the given number and compares it
     * with the original number to determine whether it is a palindrome.
     *
     * A number is said to be a palindrome if it reads the same
     * forward and backward (e.g., 4554).
     *
     * Time Complexity: O(log10 N) — the loop runs once per digit in the number.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static boolean checkPalindrome(int number) {
        int reverseNumber = 0;
        int originalNumber = number;
        
        // Loop until all digits are processed
        while (number > 0) {
            // Extract last digit from number
            int lastDigit = number % 10;
            // Append last digit to reverseNumber
            reverseNumber = (10 * reverseNumber) + lastDigit;
            // Remove last digit from number
            number /= 10;
        }
        // Check if the originalNumber is equal to its reverseNumber
        return reverseNumber == originalNumber;
    }

    public static void main(String[] args) {
        boolean isPalindrome = checkPalindrome(4554);
        if (isPalindrome) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
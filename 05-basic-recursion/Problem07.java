public class Problem07 {

    /**
     * Checks whether a given string is a palindrome using
     * the two-pointer iterative approach.
     *
     * The function compares characters from the beginning
     * and end of the string, moving inward. If all corresponding
     * characters match, the string is a palindrome.
     *
     * Time Complexity: O(N) — each character is checked once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static boolean isPalindromeIterative(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Loop until left < right
        while (left < right) {
            // If characters are different, its not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            // Move towards the middle if characters are same
            left++;
            right--;
        }

        // The string is palindrome if loop completes
        return true;
    }

    /**
     * Checks whether a given string is a palindrome using recursion.
     *
     * The function compares the character at the current index
     * with its corresponding character from the end of the string.
     * If all matching pairs are equal up to the middle, the string
     * is a palindrome.
     *
     * Time Complexity: O(N) — each character is checked once.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static boolean isPalindromeRecursive(int index, String s) {
        // Base case - If index exceeds half of the string, all elements have been compared
        // and string is a palindrome
        if (index >= s.length() / 2) {
            return true;
        }

        // If the start and end characters are not equal, it's not a palindrome
        if (s.charAt(index) != s.charAt(s.length() - index - 1)) {
            return false;
        }

        // If both characters are same, increment index by 1
        return isPalindromeRecursive(index + 1, s);
    }

    public static void main(String[] args) {
        if (isPalindromeIterative("ABCDCBA")) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        if (isPalindromeRecursive(0, "ABCDCBA")) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
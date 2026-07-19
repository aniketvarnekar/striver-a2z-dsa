public class Problem13 {

    /**
     * Finds the longest palindromic substring
     * using the expand-around-center technique.
     *
     * Every character is treated as the center
     * of an odd-length palindrome, and every
     * adjacent pair is treated as the center of
     * an even-length palindrome.
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(1)
     */
    private static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        // Expand around every possible center
        for (int i = 0; i < s.length(); i++) {
            
            // Check for odd-length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            int length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }

            // Check for even-length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }            
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println(result);
    }

}
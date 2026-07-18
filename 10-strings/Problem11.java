public class Problem11 {

    /**
     * Converts a string to a 32-bit signed integer.
     *
     * The method ignores leading whitespace, handles
     * an optional sign, reads consecutive digits,
     * and clamps the result within the integer range
     * if an overflow occurs.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long result = 0;

        // Skip leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // String contains only whitespaces
        if (i == s.length()) {
            return 0;
        }

        // Determine the sign
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // Build the number digit by digit
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // Clamp the value if it exceeds
            // the integer range
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        String s = "-042";

        int result = myAtoi(s);

        System.out.println(result);
    }

}
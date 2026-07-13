public class Problem03 {

    /**
     * Returns the largest odd-valued substring
     * from the given numeric string.
     *
     * The substring ends at the rightmost odd
     * digit and excludes any leading zeros.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static String largestOddNumber(String s) {
        int end = -1;

        // Find the rightmost odd digit
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                end = i;
                break;
            }
        }

        // No odd digit found
        if (end == -1) {
            return "";
        }

        // Skip leading zeros
        int start = 0;
        while (start <= end && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String s = "0214638";
    
        String result = largestOddNumber(s);

        System.out.println(result);
    }

}
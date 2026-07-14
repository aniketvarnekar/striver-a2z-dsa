public class Problem06 {

    /**
     * Checks whether one string can be obtained
     * by rotating another string.
     *
     * If goal is a rotation of s, then it must
     * appear as a substring of (s + s).
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static boolean rotateString(String s, String goal) {
        // Rotation is possible only if both
        // strings have the same length        
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate the string with itself
        String ss = s + s;

        // Check if goal exists as a substring
        return ss.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);

        System.out.println(result);
    }

}
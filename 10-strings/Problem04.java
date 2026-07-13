public class Problem04 {

    /**
     * Finds the longest common prefix among
     * all strings in the array.
     *
     * The first string is used as the reference,
     * and each character is compared with the
     * corresponding character in every other string.
     *
     * Time Complexity: O(N × M)
     * N = Number of strings
     * M = Length of the shortest common prefix
     *
     * Space Complexity: O(1)
     */
    private static String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        // Compare each character of the first string
        for (int i = 0; i < first.length(); i++) {
            char current = first.charAt(i);

            // Check the same position in every string
            for (int j = 1; j < strs.length; j++) {
                // Prefix ends if the current string
                // is shorter or characters differ                
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }

}
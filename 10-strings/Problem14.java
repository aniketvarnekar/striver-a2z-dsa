public class Problem14 {

    /**
     * Computes the sum of the beauty values
     * of all substrings.
     *
     * For every starting index, the substring
     * is expanded while maintaining character
     * frequencies. The beauty of each substring
     * is calculated as the difference between
     * the maximum and minimum non-zero
     * character frequencies.
     *
     * Time Complexity: O(N² × 26) ≈ O(N²)
     * Space Complexity: O(26) ≈ O(1)
     */
    private static int beautySum(String s) {
        int result = 0;

        // Consider every possible starting index
        for (int left = 0; left < s.length(); left++) {
            int[] frequency = new int[26];

            // Expand the substring one character at a time
            for (int right = left; right < s.length(); right++) {
                char ch = s.charAt(right);

                frequency[ch - 'a']++;

                int maxFrequency = 0;
                int minFrequency = Integer.MAX_VALUE;

                // Find the maximum and minimum
                // non-zero frequencies
                for (int value : frequency) {
                    if (value > 0) {
                        maxFrequency = Math.max(maxFrequency, value);
                        minFrequency = Math.min(minFrequency, value);
                    }
                }

                // Add the beauty of the current substring
                result += maxFrequency - minFrequency;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "aabcb";

        int result = beautySum(s);

        System.out.println(result);
    }

}
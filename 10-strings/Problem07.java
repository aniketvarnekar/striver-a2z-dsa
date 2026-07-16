public class Problem07 {

    /**
     * Checks whether two strings are anagrams.
     *
     * A frequency array is used to count the
     * occurrences of each character in the first
     * string and subtract the occurrences from
     * the second string.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static boolean isAnagram(String s, String t) {
        // Strings of different lengths
        // cannot be anagrams        
        if (s.length() != t.length()) {
            return false;
        }

        int[] frequency = new int[26];

        // Count characters in s and
        // remove characters from t
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        // Verify that all frequencies are zero
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println(result);
    }

}
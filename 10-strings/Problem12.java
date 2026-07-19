import java.util.*;

public class Problem12 {

    /**
     * Counts the number of substrings containing
     * exactly k distinct characters.
     *
     * The result is obtained by subtracting the
     * number of substrings with at most (k - 1)
     * distinct characters from those with at
     * most k distinct characters.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(K)
     */
    private static int countSubstrings(String s, int k) {
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }

    /**
     * Counts the number of substrings containing
     * at most k distinct characters using the
     * sliding window technique.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(K)
     */
    private static int countAtMostKDistinct(String s, int k) {
        int left = 0;
        int count = 0;

        // Stores the frequency of characters
        // inside the current window
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Shrink the window until it
            // contains at most k distinct characters
            while (map.size() > k) {
                char leftCharacter = s.charAt(left);

                map.put(leftCharacter, map.get(leftCharacter) - 1);

                if (map.get(leftCharacter) == 0) {
                    map.remove(leftCharacter);
                }

                left++;
            }

            // All substrings ending at 'right'
            // and starting from 'left' are valid
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abc";
        int k = 2;

        int result = countSubstrings(s, k);

        System.out.println(result);
    }

}
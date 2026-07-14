import java.util.*;

public class Problem05 {

    /**
     * Checks whether two strings are isomorphic.
     *
     * Two hash maps are maintained to ensure a
     * one-to-one mapping between the characters
     * of both strings.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * (At most 256 character mappings for ASCII)
     */
    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Maps characters from s to t
        Map<Character, Character> mapST = new HashMap<>();
        
        // Maps characters from t to s
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Existing mapping from s to t
            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            }
            // Create a new mapping            
            else {
                // Character in t is already mapped                
                if (mapTS.containsKey(ch2)) {
                    return false;
                }

                mapST.put(ch1, ch2);
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        boolean result = isIsomorphic(s, t);

        System.out.println(result);
    }

}
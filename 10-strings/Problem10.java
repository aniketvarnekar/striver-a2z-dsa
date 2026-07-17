import java.util.*;

public class Problem10 {

    /**
     * Converts a Roman numeral to its
     * corresponding integer value.
     *
     * If a smaller numeral appears before
     * a larger numeral, it is subtracted;
     * otherwise, it is added.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int romanToInt(String s) {
        int result = 0;

        // Store the value of each Roman numeral
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Process all characters except the last        
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            // Subtract if a smaller numeral
            // appears before a larger one
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        // Add the value of the last numeral
        result += map.get(s.charAt(s.length() - 1));

        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        int result = romanToInt(s);
        
        System.out.println(result);
    }

}
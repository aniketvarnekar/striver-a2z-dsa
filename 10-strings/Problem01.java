import java.util.*;

public class Problem01 {

    /**
     * Removes the outermost parentheses of every
     * primitive valid parentheses string using a stack.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static String removeOuterParenthesesV1(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Ignore the outermost opening parenthesis                
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                // Ignore the outermost closing parenthesis                
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    /**
     * Removes the outermost parentheses using
     * a counter instead of a stack.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static String removeOuterParenthesesV2(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // Append only if it is not an outermost '('                
                if (count > 0) {
                    result.append(ch);
                }
                count++;
            } else {
                count--;
                // Append only if it is not an outermost ')'
                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";

        String result1 = removeOuterParenthesesV1(s);
        System.out.println(result1);

        String result2 = removeOuterParenthesesV2(s);
        System.out.println(result2);        
    }

}
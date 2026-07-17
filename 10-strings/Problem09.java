public class Problem09 {

    /**
     * Finds the maximum nesting depth of
     * parentheses in a valid expression.
     *
     * The current depth is increased for every
     * opening parenthesis and decreased for
     * every closing parenthesis. The maximum
     * depth encountered is returned.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        // Traverse the string and track
        // the current nesting depth
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                currentDepth++;
                // Update the maximum depth                
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        int result = maxDepth(s);
        
        System.out.println(result);
    }

}
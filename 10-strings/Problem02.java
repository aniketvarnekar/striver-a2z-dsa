public class Problem02 {

    /**
     * Reverses the order of words in a string.
     *
     * Extra spaces at the beginning, end, and
     * between words are ignored in the output.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        // Start from the end of the string
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip trailing spaces            
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // Find the beginning of the current word
            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Append the current word
            String word = s.substring(j + 1, i + 1);
            result.append(word);

            // Skip spaces before the next word
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            // Add a space if more words remain
            if (j >= 0) {
                result.append(' ');
            }

            i = j;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "  the   sky   is blue  ";
        
        String result = reverseWords(s);

        System.out.println(result);
    }

}
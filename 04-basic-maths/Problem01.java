public class Problem01 {

    /**
     * Brute force approach: repeatedly divide the number by 10 and count how many times
     * we can do this before it becomes 0 (one step per digit).
     * Time Complexity: O(log10 N) — the loop runs once per digit in the number.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static int countDigitsLoop(int number) {
        // Initialize variable to store count of digits
        int digits = 0;
        // Run loop until number becomes 0 (i.e. no digits left)
        while (number > 0) {
            // Divide number by 10 to remove the last digit
            number /= 10;
            // Increment count of digits by 1
            digits++;
        }
        return digits;
    }

    /**
     * Optimal approach: uses the mathematical property that the number of digits
     * in N is floor(log10(N)) + 1.
     * Time Complexity: O(1) — the logarithmic operation takes constant time.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static int countDigitsLog(int number) {
        // Cast to int to remove decimal part
        int digits = (int) (Math.log10(number) + 1);
        return digits;
    }

    public static void main(String[] args) {
        int digitsLoop = countDigitsLoop(12345);
        int digitsLog = countDigitsLog(12345);
        System.out.println(digitsLoop);
        System.out.println(digitsLog);
    }

}
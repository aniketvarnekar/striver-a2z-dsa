public class Problem03 {

    /**
     * Prints numbers from N down to 1 using recursion.
     *
     * The function prints the current number and recursively
     * calls itself with the next smaller number until the
     * base condition (current < 1) is reached.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void printNumbers(int current) {
        // Base Case - if current is less than 1, stop recursion
        if (current < 1) {
            return;
        }

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next smaller number
        printNumbers(--current);
    }

    public static void main(String[] args) {
        printNumbers(4);
        System.out.println();
    }

}
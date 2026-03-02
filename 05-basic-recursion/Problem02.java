public class Problem02 {

     /**
     * Prints numbers from 1 to N using recursion.
     *
     * The function prints the current number and recursively
     * calls itself with the next number until the base
     * condition (current > N) is reached.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void printNumbers(int current, int n) {
        // Base Case - if current exceeds n, stop recursion
        if (current > n) {
            return;
        }
        
        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(++current, n);
    }

    public static void main(String[] args) {
        printNumbers(1, 4);
        System.out.println();
    }

}
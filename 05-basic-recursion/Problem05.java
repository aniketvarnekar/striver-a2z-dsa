public class Problem05 {

    /**
     * Computes the factorial of a given number using recursion.
     *
     * Factorial of N (denoted as N!) is the product of all
     * positive integers from 1 to N.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static int factorial(int n) {
        // Base case - factorial of 1 is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

}
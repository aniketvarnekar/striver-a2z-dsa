public class Problem08 {

    /**
     * Prints the Fibonacci series up to the Nth index using
     * a dynamic programming (array-based) approach.
     *
     * The function stores previously computed Fibonacci numbers
     * in an array and builds the sequence iteratively.
     *
     * Fibonacci sequence:
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)
     *
     * Time Complexity: O(N) — computes each Fibonacci number once.
     * Space Complexity: O(N) — uses an array of size (n + 1).
     */
    private static void fibonacciBruteForce(int n) {
        // If n = 0, print 1st fibonacci number
        if (n == 0) {
            System.out.println("0");
        } 
        // If n = 1, print 1st and 2nd fibonacci number
        else if (n == 1) {
            System.out.println("0 1");
        }
        // Compute and print fibonacci series
        else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;

            // Compute fibonacci from 2 to n
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }

            System.out.println();
        }
    }

    /**
     * Prints the Fibonacci series up to the Nth index
     * using an iterative space-optimized approach.
     *
     * Instead of storing all Fibonacci numbers,
     * the function maintains only the last two values
     * and updates them iteratively.
     *
     * Fibonacci sequence:
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)
     *
     * Time Complexity: O(N) — computes each Fibonacci number once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static void fibonacciBetter(int n) {
        // If n is 0, print 1st fibonacci number
        if (n == 0) {
            System.out.println("0");
        } else {
            int secondLast = 0;
            int last = 1;

            System.out.print(secondLast + " " + last + " ");

            for (int i = 2; i <= n; i++) {
                // Calculate current
                int current = secondLast + last;
                System.out.print(current + " ");
                // Slide the window
                secondLast = last;
                last = current;
            }

            System.out.println();
        }
    }

    /**
     * Computes the Nth Fibonacci number using recursion.
     *
     * The function follows the recursive definition:
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)
     *
     * Time Complexity: O(2^N) — exponential due to repeated subproblems.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static int fibonacciRecursive(int n) {
        // Base case - return n if it's 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case - calculate previous two terms
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        fibonacciBruteForce(7);
        fibonacciBetter(7);
        System.out.println(fibonacciRecursive(7));
    }

}
public class Problem04 {

    /**
     * Computes and prints the sum of the first N natural numbers
     * using parameterized recursion.
     *
     * The function accumulates the sum in a parameter and
     * recursively decrements N until the base condition (n < 1)
     * is reached, at which point the final sum is printed.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static void sumOfNaturalNumbersV1(int n, int sum) {
        // Base Case - if n is less than 1, print sum and stop recursion
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        // Recursive call - add n to sum and decrement n by 1
        sumOfNaturalNumbersV1(n - 1, sum + n);
    }

    /**
     * Computes the sum of the first N natural numbers
     * using functional recursion.
     *
     * The function returns the sum of N and the result
     * of the recursive call for (N - 1) until the base
     * condition (n == 0) is reached.
     *
     * Time Complexity: O(N) — the function is called N times.
     * Space Complexity: O(N) — due to recursive call stack.
     */
    private static int sumOfNaturalNumbersV2(int n) {
        // Base Case - if n = 0, return 0
        if (n == 0) {
            return 0;
        }

        // Recursive Case - current number + sum of previous number
        return n + sumOfNaturalNumbersV2(n - 1);
    }

    public static void main(String[] args) {
        sumOfNaturalNumbersV1(5, 0);
        int sum = sumOfNaturalNumbersV2(5);
        System.out.println(sum);
    }

}
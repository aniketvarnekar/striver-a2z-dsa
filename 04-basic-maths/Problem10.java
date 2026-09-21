public class Problem10 {

    /**
     * Checks whether the given number is a perfect number.
     *
     * Divisors are found in pairs. If i divides n, then
     * n / i is also a divisor.
     *
     * The number itself is excluded from the divisor sum.
     *
     * Time Complexity: O(√N)
     * Space Complexity: O(1)
     */
    private static boolean isPerfect(int n) {
        // Numbers less than or equal to 1 are not perfect  
        if (n <= 1) {
            return false;
        }

        // 1 is a proper divisor of every number greater than 1
        int sum = 1;

        // Check for divisors up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            // Check whether i is a divisor of n            
            if (n % i == 0) {
                // Add the first divisor                
                sum += i;

                // Find the paired divisor
                int divisor = n / i;

                // Avoid adding the square root twice when
                // n is a perfect square
                if (divisor != i) {
                    sum += divisor;
                }
            }
        }

        // A number is perfect if the sum of its proper
        // divisors is equal to the number itself
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 6;
        boolean result = isPerfect(n);

        System.out.println(result);
    }

}
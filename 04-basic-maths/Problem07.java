public class Problem07 {

    /**
     * Brute force approach: counts the total number of factors
     * of the given number by iterating from 1 to N.
     *
     * A prime number has exactly two distinct positive divisors:
     * 1 and itself.
     *
     * Time Complexity: O(N) — checks divisibility for all numbers from 1 to N.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static boolean isPrimeBruteForce(int number) {
        // To count number of factors
        int count = 0;

        // Loop through 1 to number
        for (int i = 1; i <= number; i++) {
            // If number is completely divisible by i, increment count for number of factors
            if (number % i == 0) {
                count++;
            }
        }
        // If number of factors is exactly 2, then its a prime number
        return count == 2;
    }

     /**
     * Optimal approach: checks divisibility only up to the square root
     * of the number and counts divisor pairs.
     *
     * If i divides N, then (N / i) is also a divisor. This reduces
     * unnecessary iterations compared to checking up to N.
     *
     * A prime number has exactly two distinct positive divisors:
     * 1 and itself.
     *
     * Time Complexity: O(√N) — iterates up to the square root of N.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static boolean isPrimeOptimal(int number) {
        // To count number of factors
        int count = 0;

        // Loop through 1 to square root of number
        for (int i = 1; i * i <= number; i++) {
            // If number is completely divisible by i, increment count for number of factors
            if (number % i == 0) {
                count++;
                // If (number / i) is same as i, no need to increment count for number of factors, else increment the count
                if (number / i != i) {
                    count++;
                }
            }
        }

        // If number of factors is exactly 2, then its a prime number
        return count == 2;
    }

    public static void main(String[] args) {
        if (isPrimeBruteForce(17)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (isPrimeOptimal(17)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
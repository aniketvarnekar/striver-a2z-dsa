public class Problem04 {

    /**
     * Brute force approach: iterates from 1 up to the minimum of the two numbers
     * and checks for the largest integer that divides both numbers exactly.
     *
     * The greatest common divisor (GCD) of two integers is the largest
     * positive integer that divides both numbers without leaving a remainder.
     *
     * Time Complexity: O(min(a, b)) — the loop runs from 1 to the smaller of the two numbers.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static int gcdBruteForce(int a, int b) {
        int gcd = 1;
        int minimum = Math.min(a, b);

        // Iterate from 1 upto minimum of a & b
        for (int i = 1; i <= minimum; i++) {
            // Check if i is a common factor of both a & b
            if ((a % i) == 0 && (b % i) == 0) {
                // Update gcd
                gcd = i;
            }
        }

        return gcd;
    }

    /**
     * Improved brute force approach: iterates from the minimum of the two numbers
     * down to 1 and returns the first common divisor encountered.
     *
     * Since the GCD cannot be greater than the smaller of the two numbers,
     * iterating in descending order allows early termination once the
     * greatest common divisor is found.
     *
     * Time Complexity: O(min(a, b)) in the worst case — if the GCD is 1,
     * the loop runs through all values down to 1.
     * Best Case: O(1) — if both numbers are equal or the smaller number itself is the GCD.
     * Space Complexity: O(1) — uses a constant amount of extra space.
     */
    private static int gcdBetter(int a, int b) {
        int gcd = 1;
        int minimum = Math.min(a, b);

        // Iterate from minimum of n1 & n2 (since GCD cannot exceed smaller number) down to 1
        for (int i = minimum; i >= 1; i--) {
            // Check if i is a common factor of both a & b
            if ((a % i) == 0 && (b % i) == 0) {
                // Update gcd and break the loop
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    /**
     * Optimal approach: uses the Euclidean Algorithm to compute the
     * Greatest Common Divisor (GCD) of two integers.
     *
     * The algorithm is based on the mathematical property:
     * GCD(a, b) = GCD(b, a % b)
     *
     * At each step, the larger number is replaced by the remainder
     * of dividing it by the smaller number. The process continues
     * until one of the numbers becomes 0. The non-zero number at
     * that point is the GCD.
     *
     * Time Complexity: O(log(min(a, b))) — highly efficient due to
     * repeated division by remainder.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int gcdOptimal(int a, int b) {
        // Continue loop as long as both a & b are greater than 0
        while (a > 0 && b > 0) {
            // Replace the larger number with its remainder
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        
        // If a becomes 0, b is the GCD; otherwise, a is the GCD
        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {
        int gcd1 = gcdBruteForce(20, 15);
        int gcd2 = gcdBetter(20, 15);
        int gcd3 = gcdOptimal(20, 15);
        System.out.println(gcd1);
        System.out.println(gcd2);
        System.out.println(gcd3);
    }

}
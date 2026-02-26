import java.util.*;

public class Problem06 {

    /**
     * Brute force approach: iterates from 1 to the given number
     * and checks for all integers that divide the number exactly.
     *
     * A divisor of a number is an integer that divides it without
     * leaving a remainder.
     *
     * Time Complexity: O(N) — iterates through all numbers from 1 to N.
     * Space Complexity: O(K) — where K is the number of divisors stored.
     */
    private static List<Integer> getDivisorsBruteForce(int number) {
        List<Integer> divisors = new ArrayList<>();
        
        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }

     /**
     * Optimal approach: iterates only up to the square root of the number
     * and adds both the divisor and its corresponding pair (number / i).
     *
     * Divisors always occur in pairs. If i divides N, then (N / i)
     * is also a divisor. This reduces unnecessary iterations.
     *
     * Time Complexity: O(√N) — iterates up to the square root of N.
     * Space Complexity: O(K) — where K is the number of divisors stored.
     */
    private static List<Integer> getDivisorsOptimal(int number) {
        List<Integer> divisors = new ArrayList<>();
        
        // Loop from 1 to square root of number
        for (int i = 1; i * i <= number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                divisors.add(i);

                // If (number / i) is same as i, don't add it, else add it to list of divisors
                if (number / i != i) {
                    divisors.add(number / i);
                }
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        List<Integer> divisorsBruteForce = getDivisorsBruteForce(36);
        List<Integer> divisorsOptimal = getDivisorsOptimal(36);
        System.out.println(divisorsBruteForce);
        System.out.println(divisorsOptimal);
    }

}
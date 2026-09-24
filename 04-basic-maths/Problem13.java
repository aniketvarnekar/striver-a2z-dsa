import java.util.*;

public class Problem13 {

    /**
     * Finds all divisors of a given number in sorted order.
     *
     * Iterates only up to the square root of n. For every divisor i,
     * its corresponding divisor n / i is also added.
     *
     * Time Complexity: O(sqrt(N))
     * Space Complexity: O(N) for storing the divisors
     */
    private static int[] divisors(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        // Check all numbers up to the square root of n
        for (int i = 1; i * i <= n; i++) {
            // If i divides n, then i and n / i are divisors            
            if (n % i == 0) {
                small.add(i);

                // Avoid adding the same divisor twice for perfect squares                
                if (n / i != i) {
                    large.add(n / i);
                }
            }
        }

        // Create an array to store all divisors in sorted order
        int[] result = new int[small.size() + large.size()];
        int index = 0;

        // Add the smaller divisors in ascending order
        for (int i = 0; i < small.size(); i++) {
            result[index++] = small.get(i); 
        }

        // Add the larger divisors in reverse order
        // so that the complete result remains sorted
        for (int i = large.size() - 1; i >= 0; i--) {
            result[index++] = large.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        
        int[] result = divisors(n);

        System.out.println(Arrays.toString(result));
    }

}
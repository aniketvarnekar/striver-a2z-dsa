public class Problem11 {

    /**
     * Counts the number of prime numbers in the range [1, n].
     *
     * Uses the Sieve of Eratosthenes to mark composite numbers.
     *
     * Time Complexity: O(N log log N)
     * Space Complexity: O(N)
     */
    private static int primeUptoN(int n) {
        // There are no prime numbers less than 2        
        if (n < 2) {
            return 0;
        }

        // Create an array to track whether each number is prime
        boolean[] isPrime = new boolean[n + 1];

        // Initially, assume all numbers from 2 to n are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark all composite numbers using the Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            // Process only numbers that are still marked as prime            
            if (isPrime[i]) {
                // Start from i * i because smaller multiples
                // have already been marked by smaller prime factors                
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        // Count all numbers that are still marked as prime
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = primeUptoN(n);

        System.out.println(result);
    }

}
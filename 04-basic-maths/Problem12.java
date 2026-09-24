public class Problem12 {

    /**
     * Finds the Lowest Common Multiple (LCM) of two numbers.
     *
     * The LCM is calculated using the relationship:
     * LCM(a, b) = (a * b) / GCD(a, b)
     *
     * Time Complexity: O(log(min(A, B)))
     * Space Complexity: O(1)
     */
    private static int lcm(int a, int b) {
        // Find the Greatest Common Divisor of a and b        
        int gcd = gcd(a, b);

        // Calculate the LCM using the GCD
        return (a * b / gcd);
    }

    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }

        return a == 0 ? b : a;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int result = lcm(a, b);

        System.out.println(result);
    }

}
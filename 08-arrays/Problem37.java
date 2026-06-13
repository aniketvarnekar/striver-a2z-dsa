import java.util.*;

public class Problem37 {

    /**
     * Finds the repeating and missing numbers using
     * mathematical equations.
     *
     * Let:
     * x = repeating number
     * y = missing number
     *
     * We use:
     * x - y = actualSum - expectedSum
     *
     * x² - y² =
     * actualSquareSum - expectedSquareSum
     *
     * => (x - y)(x + y)
     *
     * Solving these two equations gives x and y.
     *
     * Returns:
     * [repeating, missing]
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int[] findRepeatingAndMissingV1(int[] arr) {
        int n = arr.length;

        long actualSum = 0;
        long actualSquareSum = 0;
        
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Compute actual sum and square sum
        for (int i = 0; i < n; i++) {
            actualSum += (long) arr[i];
            actualSquareSum += (long) arr[i] * arr[i];
        }

        long repeatingMinusMissing = actualSum - expectedSum;
        long repeatingSquareMinusMissingSquare = actualSquareSum - expectedSquareSum;
        long repeatingPlusMissing = repeatingSquareMinusMissingSquare / repeatingMinusMissing;

        int repeating = (int) ((repeatingMinusMissing + repeatingPlusMissing) / 2);
        int missing = (int) (repeatingPlusMissing - repeating);

        return new int[] {repeating, missing};
    }

    /**
     * Finds the repeating and missing numbers using XOR.
     *
     * Observation:
     * XOR of array elements and numbers from 1 to n
     * gives:
     *
     * xor = repeating ^ missing
     *
     * Using the rightmost set bit, we divide numbers
     * into two groups and recover both values.
     *
     * Finally, we determine which one is repeating
     * by checking the original array.
     *
     * Returns:
     * [repeating, missing]
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int[] findRepeatingAndMissingV2(int[] arr) {
        int n = arr.length;

        int xor = 0;

        // XOR all array elements and numbers 1..n
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= i + 1;
        }

        // Find position of rightmost set bit
        int rightmostSetBitPosition = 0;

        while (true) {
            if ((xor & (1 << rightmostSetBitPosition)) != 0) {
                break;
            }
            rightmostSetBitPosition++;
        }

        int rightmostSetBit = 1 << rightmostSetBitPosition;
        int xorSet = 0;
        int xorNotSet = 0;

        // Divide array elements into two groups
        for (int i = 0; i < n; i++) {
            if ((arr[i] & rightmostSetBit) != 0) {
                xorSet ^= arr[i];
            } else {
                xorNotSet ^= arr[i];
            }
        }

        // Divide numbers 1..n into two groups
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                xorSet ^= i;
            } else {
                xorNotSet ^= i;
            }
        }

        // Determine which value is repeating
        for (int i = 0; i < n; i++) {
            if (arr[i] == xorSet) {
                return new int[] {xorSet, xorNotSet};
            }
        }

        return new int[] {xorNotSet, xorSet};
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 6, 7, 5, 7};

        int[] result1 = findRepeatingAndMissingV1(arr);

        int[] result2 = findRepeatingAndMissingV2(arr);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

}
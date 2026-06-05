import java.util.*;

public class Problem28 {

    /**
     * Returns the element at the given row and column
     * in Pascal's Triangle.
     *
     * Pascal's Triangle element at position (row, column)
     * is given by:
     *
     * C(row - 1, column - 1)
     *
     * where:
     * C(n, r) = n! / (r! * (n - r)!)
     *
     * This implementation computes the binomial coefficient
     * iteratively to avoid factorial calculations.
     *
     * Rows and columns are considered 1-indexed.
     *
     * Time Complexity: O(r)
     * Space Complexity: O(1)
     */
    private static long pascalTriangleElement(int row, int column) {
        // Convert to 0-indexed values for nCr calculation        
        int n = row - 1;
        int r = column - 1;

        // Use smaller r for efficient computation
        r = Math.min(r, n - r);

        long result = 1;

        // Compute nCr iteratively
        for (int i = 0; i < r; i++) {
            result *= n - i;
            result /= i + 1;
        }

        return result;
    }

    /**
     * Returns the nth row of Pascal's Triangle.
     *
     * Each element in the row is generated using the relation:
     *
     * C(n - 1, r)
     *
     * Instead of computing every element independently,
     * the next element is derived from the previous one:
     *
     * value = value * (n - i) / i
     *
     * Rows are considered 1-indexed.
     *
     * Example:
     * n = 5
     * Output: [1, 4, 6, 4, 1]
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    private static List<Long> pascalTriangleNthRow(int n) {
        // First element of every row is 1        
        long value = 1;
        
        List<Long> row = new ArrayList<>();
        row.add(value);

        // Generate remaining elements of the row
        for (int i = 1; i < n; i++) {
            value *= n - i;
            value /= i;
            row.add(value);
        }

        return row;
    }

    /**
     * Generates the first n rows of Pascal's Triangle.
     *
     * Each row is constructed using the
     * pascalTriangleNthRow() method.
     *
     * Example:
     * n = 5
     *
     * Output:
     * [
     *   [1],
     *   [1, 1],
     *   [1, 2, 1],
     *   [1, 3, 3, 1],
     *   [1, 4, 6, 4, 1]
     * ]
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(n²)
     */
    private static List<List<Long>> pascalTriangle(int n) {
        // Stores all rows of Pascal's Triangle        
        List<List<Long>> result = new ArrayList<>();
        
        // Generate rows from 1 to n        
        for (int i = 1; i <= n; i++) {
            List<Long> row = pascalTriangleNthRow(i);
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 5;
        int column = 3;

        long result1 = pascalTriangleElement(row, column);

        System.out.println(result1);

        List<Long> result2 = pascalTriangleNthRow(n);

        System.out.println(result2);

        List<List<Long>> result3 = pascalTriangle(n);

        System.out.println(result3);
    }

}
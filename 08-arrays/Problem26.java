import java.util.*;

public class Problem26 {


    /**
     * Returns the elements of the matrix in spiral order.
     *
     * The traversal starts from the top-left corner and proceeds:
     * 1. Left to Right
     * 2. Top to Bottom
     * 3. Right to Left
     * 4. Bottom to Top
     *
     * After completing one layer, the boundaries are shrunk
     * and the process repeats until all elements are visited.
     *
     * Time Complexity: O(M × N)
     * Space Complexity: O(M × N) — result list stores all elements.
     */
    private static List<Integer> spiralOrder(int[][] matrix) {
        // Define current boundaries of the matrix        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Stores spiral traversal result
        List<Integer> result = new ArrayList<>();

        // Continue while there are rows and columns remaining
        while (top <= bottom && left <= right) {
            // Traverse left to right along the top row            
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse top to bottom along the right column            
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse right to left along the bottom row            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse bottom to top along the left column            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);

        System.out.println(result);
    }

}
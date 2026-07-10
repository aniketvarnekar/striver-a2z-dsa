public class Problem30 {

    /**
     * Searches for the target in a matrix using
     * the top-right corner traversal.
     *
     * This approach works when:
     * - Each row is sorted in ascending order.
     * - Each column is sorted in ascending order.
     *
     * Time Complexity: O(M + N)
     * Space Complexity: O(1)
     */
    private static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int column = n - 1;

        while (row < m && column >= 0) {
            int value = matrix[row][column];

            // Target found
            if (value == target) {
                return true;
            } 
            // Eliminate the current row            
            else if (value < target) {
                row++;
            } 
            // Eliminate the current column            
            else {
                column--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 8;

        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
    }

}
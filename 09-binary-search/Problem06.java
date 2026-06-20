import java.util.*;

public class Problem06 {

    /**
     * Finds the first and last occurrence of x
     * in a sorted array.
     *
     * Returns:
     * [firstPosition, lastPosition]
     *
     * If x is not present, returns:
     * [-1, -1]
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int[] findFirstAndLastPosition(int[] arr, int x) {
        int firstPosition = findFirstPosition(arr, x);
        if (firstPosition == -1) {
            return new int[] {-1, -1};
        }
        int lastPosition = findLastPosition(arr, x);
        return new int[] {firstPosition, lastPosition};
    }

    /**
     * Finds the first occurrence of x.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findFirstPosition(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;

                // Search further left                
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    /**
     * Finds the last occurrence of x.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findLastPosition(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;

                // Search further right
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }    

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 13, 13, 13, 20, 40};
        int x = 13;

        int[] result = findFirstAndLastPosition(arr, x);

        System.out.println(Arrays.toString(result));
    }

}
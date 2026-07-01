import java.util.*;

public class Problem21 {

    /**
     * Finds the largest minimum distance possible
     * between any two cows.
     *
     * The stalls are first sorted, and Binary Search
     * is applied on the answer space.
     *
     * Time Complexity: O(N log N + N log D)
     * where D is the distance between the first and
     * last stall.
     *
     * Space Complexity: O(1)
     */
    private static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Possible to place all cows
            if (canPlaceCows(stalls, cows, mid)) {
                result = mid;
                low = mid + 1;
            } 
            
            // Try a smaller minimum distance            
            else {
                high = mid - 1;
            }
        }

        return result;
    }

    /**
     * Checks whether all cows can be placed
     * such that the minimum distance between
     * consecutive cows is at least minDistance.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static boolean canPlaceCows(int[] stalls, int cows, int minDistance) {
        int count = 1;
        int lastCowPosition = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCowPosition >= minDistance) {
                count++;
                lastCowPosition = stalls[i];
            }

            if (count >= cows) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] stalls = new int[] {0, 3, 4, 7, 10, 9};
        int cows = 4;

        int result = aggressiveCows(stalls, cows);

        System.out.println(result);
    }

}
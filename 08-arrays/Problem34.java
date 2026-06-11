import java.util.*;

public class Problem34 {

    /**
     * Merges all overlapping intervals.
     *
     * Algorithm:
     * 1. Sort intervals based on starting time.
     * 2. Add the first interval to the result.
     * 3. For each remaining interval:
     *    - If it overlaps with the last interval in the result,
     *      merge them.
     *    - Otherwise, add it as a new interval.
     *
     * Example:
     * Input:
     * [[1,3],[2,6],[8,10],[15,18]]
     *
     * Output:
     * [[1,6],[8,10],[15,18]]
     *
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */
    private static int[][] mergeIntervals(int[][] intervals) {
        // Stores merged intervals        
        List<int[]> result = new ArrayList<>();

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Add first interval
        result.add(intervals[0]);

        // Process remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // Last merged interval            
            int[] lastInterval = result.get(result.size() - 1);

            // Check for overlap            
            if (intervals[i][0] <= lastInterval[1]) {
                // Merge intervals                
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            } 
            // No overlap            
            else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = mergeIntervals(intervals);

        System.out.println(Arrays.deepToString(result));
    }

}
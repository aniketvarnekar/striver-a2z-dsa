import java.util.*;

public class Problem25 {

    /**
     * Greedily places one gas station at a time in the
     * interval having the largest current distance.
     *
     * addedStations[i] stores the number of new stations
     * inserted between stations[i] and stations[i + 1].
     *
     * Time Complexity: O(K * N)
     * Space Complexity: O(N)
     */
    private static double minimizeMaxDistanceV1(int[] stations, int k) {
        int n = stations.length;

        // Number of stations added in each interval        
        int[] addedStations = new int[n - 1];

        // Place k stations greedily
        for (int i = 1; i <= k; i++) {
            double maxSectionLength = -1;
            int maxIndex = -1;

            // Find the interval with the largest section
            for (int j = 0; j < n - 1; j++) {
                double sectionLength = (stations[j + 1] - stations[j]) / (addedStations[j] + 1.0);

                if (sectionLength > maxSectionLength) {
                    maxSectionLength = sectionLength;
                    maxIndex = j;
                }                
            }

            // Add a station to that interval
            addedStations[maxIndex]++;
        }

        // Compute the largest remaining section
        double maxSectionLength = -1;
        for (int i = 0; i < n - 1; i++) {
            maxSectionLength = Math.max(maxSectionLength, (stations[i + 1] - stations[i]) / (addedStations[i] + 1.0));
        }

        return maxSectionLength;
    }

    private static class Pair {
        double sectionLength;
        int index;

        Pair(double sectionLength, int index) {
            this.sectionLength = sectionLength;
            this.index = index;
        }
    }

    /**
     * Minimizes the maximum distance between adjacent
     * gas stations using a Max Heap.
     *
     * The interval with the largest current section
     * length is always chosen to place the next gas
     * station.
     *
     * Time Complexity: O((N + K) log N)
     * Space Complexity: O(N)
     */
    private static double minimizeMaxDistanceV2(int[] stations, int k) {
        int n = stations.length;

        // Number of stations added in each interval        
        int[] addedStations = new int[n - 1];

        // Max Heap storing the current largest section
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> Double.compare(b.sectionLength, a.sectionLength));

        // Initialize the heap with all intervals
        for (int i = 0; i < n - 1; i++) {
            priorityQueue.add(new Pair(stations[i + 1] - stations[i], i));
        }

        // Add k stations
        for (int i = 1; i <= k; i++) {
            // Interval with the largest section            
            Pair maxPair = priorityQueue.poll();
            
            addedStations[maxPair.index]++;

            // Updated maximum section length
            double maxSectionLength = (stations[maxPair.index + 1] - stations[maxPair.index]) / (addedStations[maxPair.index] + 1.0);
            priorityQueue.add(new Pair(maxSectionLength, maxPair.index));
        }

        // The top of the heap contains the answer
        return priorityQueue.poll().sectionLength;
    }

    /**
     * Minimizes the maximum distance between adjacent
     * gas stations using Binary Search on the answer.
     *
     * Binary Search is performed on the maximum allowed
     * distance between two consecutive gas stations.
     *
     * Time Complexity: O(N * log(Range / Precision))
     * Space Complexity: O(1)
     */
    private static double minimizeMaxDistanceV3(int[] stations, int k) {
        double maxSectionLength = -1;

        // Find the largest existing gap
        for (int i = 0; i < stations.length - 1; i++) {
            maxSectionLength = Math.max(maxSectionLength, stations[i + 1] - stations[i]);
        }

        double low = 0;
        double high = maxSectionLength;
        double result = -1;

        // Continue until the desired precision
        while (high - low > 1e-6) {
            double mid = (low + high) / 2.0;
            int totalStations = calculateTotalStations(stations, mid);

            // Possible with k or fewer stations
            if (totalStations <= k) {
                result = mid;
                high = mid;
            } 


            // Need to allow a larger maximum distance            
            else {
                low = mid;
            }
        }

        return result;
    }

    /**
     * Calculates the minimum number of additional
     * gas stations required so that no adjacent
     * stations are farther than the given distance.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int calculateTotalStations(int[] stations, double distance) {
        int totalStations = 0;

        for (int i = 0; i < stations.length - 1; i++) {
            int count = (int) ((stations[i + 1] - stations[i]) / distance);

            // If the interval is exactly divisible,
            // one station is counted extra.
            if (count * distance == stations[i + 1] - stations[i]) {
                count--;
            }

            totalStations += count; 
        }

        return totalStations;
    }

    public static void main(String[] args) {
        int[] stations = new int[] {1, 2, 3, 4, 5};
        int k = 4;

        double result1 = minimizeMaxDistanceV1(stations, k);
        System.out.println(result1);

        double result2 = minimizeMaxDistanceV2(stations, k);
        System.out.println(result2);

        double result3 = minimizeMaxDistanceV3(stations, k);
        System.out.println(result3);
    }

}
import java.util.*;

public class Problem02 {

    /**
     * Finds and prints the elements with the highest and lowest
     * frequency in the array using a brute force approach.
     *
     * The function counts occurrences of each element using
     * nested loops and tracks the maximum and minimum frequencies.
     *
     * Time Complexity: O(N^2) — nested loops compare each element with others.
     * Space Complexity: O(N) — uses a visited array to avoid recounting elements.
     */
    private static void countFrequencyBruteForce(int[] arr, int n) {
        boolean[] visited = new boolean[n]; // To track visited elements
        int maxFrequency = 0;
        int minFrequency = n;
        int maxElement = 0;
        int minElement = 0;

        for (int i = 0; i < n; i++) {
            // If element already processed, skip
            if (visited[i]) {
                continue;
            }

            // Count frequency of element
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Update min frequency and min element
            if (count < minFrequency) {
                minFrequency = count;
                minElement = arr[i];
            }

            // Update max frequency and max element
            if (count > maxFrequency) {
                maxFrequency = count;
                maxElement = arr[i];
            }
        }

        System.out.println(maxElement + " " + minElement);
    }

    /**
     * Finds and prints the elements with the highest and lowest
     * frequency in the array using a HashMap.
     *
     * The function first counts occurrences of each element in
     * the map, then traverses the map to determine the elements
     * with maximum and minimum frequency.
     *
     * Time Complexity: O(N) — one pass to build the map and one pass to evaluate it.
     * Space Complexity: O(N) — stores up to N distinct elements in the HashMap.
     */
    private static void countFrequencyOptimal(int[] arr, int n) {
        Map<Integer, Integer> hash = new HashMap<>();
        int maxFrequency = 0;
        int minFrequency = n;
        int maxElement = 0;
        int minElement = 0;

        // Count frequency
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse map to find min and max frequency elements
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count < minFrequency) {
                minFrequency = count;
                minElement = element;
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                maxElement = element;
            }
        }

        System.out.println(maxElement + " " + minElement);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 2, 3, 4, 4, 2};
        countFrequencyBruteForce(arr, arr.length);
        countFrequencyOptimal(arr, arr.length);
    }

}
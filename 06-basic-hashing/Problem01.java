import java.util.*;

public class Problem01 {

    /**
     * Counts and prints the frequency of each element in the array
     * using a brute force approach.
     *
     * The function uses a visited array to avoid recounting
     * elements that have already been processed.
     *
     * Time Complexity: O(N^2) — nested loops compare each element with others.
     * Space Complexity: O(N) — uses an additional visited array.
     */
    private static void countFrequencyBruteForce(int[] arr, int n) {
        // Create a visited array to mark elements that are already processed
        boolean[] visited = new boolean[n];

        // Traverse through all elements of the array
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i]) {
                continue;
            }

            // Count the frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Mark arr[j] as visited
                    visited[j] = true;
                    count++;
                }
            }

            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }
    }

    /**
     * Counts and prints the frequency of each element in the array
     * using a HashMap.
     *
     * The function stores each element as a key in the map and
     * increments its count while traversing the array.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(N) — stores up to N elements in the HashMap.
     */
    private static void countFrequencyOptimal(int[] arr, int n) {
        // Create a HashMap to store frequency of each element
        Map<Integer, Integer> hash = new HashMap<>();

        // Traverse the array and count frequencies
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse through the HashMap and print frequencies
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        countFrequencyBruteForce(arr, arr.length);
        countFrequencyOptimal(arr, arr.length);
    }

}
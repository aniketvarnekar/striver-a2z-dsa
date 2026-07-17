import java.util.*;

public class Problem08 {

    /**
     * Sorts the characters of a string in
     * decreasing order of their frequencies.
     *
     * A hash map stores character frequencies,
     * and a max heap retrieves the characters
     * in descending order of frequency.
     *
     * Time Complexity: O(N log K)
     * N = Length of the string
     * K = Number of distinct characters
     *
     * Space Complexity: O(K)
     */
    private static String frequencySortV1(String s) {
        // Store the frequency of each character        
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on character frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Add all entries to the heap
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.offer(entry);
        }

        StringBuilder result = new StringBuilder();
        
        // Build the answer        
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int frequency = entry.getValue();

            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    /**
     * Sorts the characters of a string in
     * decreasing order of their frequencies
     * using Bucket Sort.
     *
     * Characters with the same frequency are
     * placed in the same bucket. The buckets
     * are processed from highest to lowest
     * frequency.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    private static String frequencySortV2(String s) {
        // Store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Buckets where index represents frequency
        List<Character>[] buckets = new ArrayList[s.length() + 1];

        // Place each character into its frequency bucket
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(ch);
        }

        StringBuilder result = new StringBuilder();

        // Process buckets from highest frequency
        // to lowest frequency
        for (int frequency = buckets.length - 1; frequency >= 1; frequency--) {
            if (buckets[frequency] == null) {
                continue;
            }

            for (char ch : buckets[frequency]) {
                // Append the character
                // 'frequency' times                
                for (int i = 0; i < frequency; i++) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";

        String result1 = frequencySortV1(s);
        System.out.println(result1);

        String result2 = frequencySortV2(s);
        System.out.println(result2);
    }

}
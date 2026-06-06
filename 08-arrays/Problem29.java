import java.util.*;

public class Problem29 {

    /**
     * Finds all elements that appear more than ⌊n / 3⌋ times
     * in the array using the extended Moore's Voting Algorithm.
     *
     * Observation:
     * There can be at most two elements that occur more than n / 3 times.
     *
     * Algorithm:
     * 1. Find up to two potential candidates.
     * 2. Verify their actual frequencies.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static List<Integer> findMajorityElements(int[] arr) {
        int n = arr.length;

        // Candidate 1 and its count
        int count1 = 0;
        int element1 = Integer.MIN_VALUE;

        // Candidate 2 and its count
        int count2 = 0;
        int element2 = Integer.MIN_VALUE;

        // Minimum frequency required to be a majority element
        int minFrequency = (n / 3) + 1;

        List<Integer> result = new ArrayList<>();

        // Step 1: Find potential candidates
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && arr[i] != element2) {
                count1 = 1;
                element1 = arr[i];
            }
            else if (count2 == 0 && arr[i] != element1) {
                count2 = 1;
                element2 = arr[i];
            }
            else if (arr[i] == element1) {
                count1++;
            }
            else if (arr[i] == element2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        // Step 2: Verify actual frequencies
        for (int i = 0; i < n; i++) {
            if (arr[i] == element1) {
                count1++;
            }
            else if (arr[i] == element2) {
                count2++;
            }
        }

        // Add candidates that satisfy frequency condition
        if (count1 >= minFrequency) {
            result.add(element1);
        }

        if (count2 >= minFrequency) {
            result.add(element2);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 1, 1, 3, 2, 2};

        List<Integer> result = findMajorityElements(arr);

        System.out.println(result);
    }

}
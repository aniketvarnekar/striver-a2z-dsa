import java.util.*;

public class Problem23 {

    private static int longestConsecutiveSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int element : set) {
            if (!set.contains(element - 1)) {
                int currentLongest = 1;
                while (set.contains(element + 1)) {
                    element++;
                    currentLongest++;
                }
                longest = Math.max(longest, currentLongest);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutiveSequence(arr);

        System.out.println(result);
    }

}
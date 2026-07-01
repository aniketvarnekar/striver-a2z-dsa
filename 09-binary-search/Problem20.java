public class Problem20 {

    /**
     * Finds the kth missing positive number
     * using a linear scan.
     *
     * Every array element less than or equal to the
     * current value of k shifts the answer by one,
     * so increment k.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int findKthPositiveV1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }

        return k;
    }

    /**
     * Finds the kth missing positive number
     * using Binary Search.
     *
     * Missing numbers before index i are:
     *
     * arr[i] - (i + 1)
     *
     * Binary Search locates the first position where
     * missing numbers are greater than or equal to k.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findKthPositiveV2(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // arr[high] + k - (arr[high] - (high + 1))
        // (high + 1) + k
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 7, 11};
        int k = 5;

        int result1 = findKthPositiveV1(arr, k);
        System.out.println(result1);

        int result2 = findKthPositiveV2(arr, k);
        System.out.println(result2);
    }

}
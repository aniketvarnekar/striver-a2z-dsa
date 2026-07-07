public class Problem27 {

    /**
     * Finds the kth smallest element from two sorted arrays
     * using Binary Search.
     *
     * The search is performed on the smaller array by
     * partitioning both arrays such that the left partition
     * contains exactly k elements.
     *
     * Time Complexity: O(log(min(N, M)))
     * Space Complexity: O(1)
     */
    private static int kthElement(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Always perform Binary Search on the smaller array
        if (n1 > n2) {
            return kthElement(arr2, arr1, k);
        }

        // Determine the valid search range for the partition
        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);

        while (low <= high) {
            // Partition in the first array            
            int cut1 = low + (high - low) / 2;
            // Remaining elements are taken from the second array            
            int cut2 = k - cut1;

            // Largest element on the left side of arr1
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            // Largest element on the left side of arr2            
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

            // Smallest element on the right side of arr1
            int right1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
            // Smallest element on the right side of arr2            
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];

            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            } 
            // Move partition to the left            
            else if (left1 > right2) {
                high = cut1 - 1;
            } 
            // Move partition to the right            
            else {
                low = cut1 + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {2, 3, 6, 7, 9};
        int[] arr2 = new int[] {1, 4, 8, 10};
        int k = 5;

        int result = kthElement(arr1, arr2, k);
        System.out.println(result);
    }

}
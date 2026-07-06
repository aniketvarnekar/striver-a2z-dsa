public class Problem26 {

    /**
     * Finds the median of two sorted arrays using
     * Binary Search on the smaller array.
     *
     * The arrays are partitioned such that every
     * element on the left partition is less than or
     * equal to every element on the right partition.
     *
     * Time Complexity: O(log(min(N, M)))
     * Space Complexity: O(1)
     */
    private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Always binary search on the smaller array
        if (n1 > n2) {
            return findMedianSortedArrays(arr2, arr1);
        }

        int low = 0;
        int high = n1;
        double result = -1;

        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];

            // Correct partition found
            if (left1 <= right2 && left2 <= right1) {
                // Even total number of elements                
                if ((n1 + n2) % 2 == 0) {
                    result = (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                    break;
                }
                // Odd total number of elements                
                else {
                    result = Math.max(left1, left2);
                    break;
                }
            } 
            // Move towards the left            
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            // Move towards the right
            else {
                low = cut1 + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {7, 12, 14, 15};
        int[] arr2 = new int[] {1, 2, 3, 4, 9, 11};

        double result = findMedianSortedArrays(arr1, arr2);
        System.out.println(result);
    }

}
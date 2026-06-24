public class Problem11 {

    /**
     * Finds the number of times a sorted array
     * has been rotated.
     *
     * The number of rotations is equal to the index
     * of the minimum element in the array.
     *
     * Uses Binary Search to locate the minimum element.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int findNumberOfRotations(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Current search space is already sorted
            if (arr[low] <= arr[high]) {
                if (arr[low] < min) {
                    min = arr[low];
                    minIndex = low;
                }
                break;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    minIndex = low;
                }
                low = mid + 1;
            } 
            
            // Right half is sorted            
            else {
                if (arr[mid] < min) {
                    min = arr[mid];
                    minIndex = mid;
                }
                high = mid - 1;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 7, 0, 1, 2, 3};

        int result = findNumberOfRotations(arr);

        System.out.println(result);
    }

}
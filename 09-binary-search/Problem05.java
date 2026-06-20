public class Problem05 {

    /**
     * Finds the floor of x in a sorted array.
     *
     * Floor:
     * Largest element less than or equal to x.
     *
     * Returns -1 if the floor does not exist.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int floor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Potential floor found
            if (arr[mid] <= x) {
                result = arr[mid];

                // Search for a larger valid floor                
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    /**
     * Finds the ceil of x in a sorted array.
     *
     * Ceil:
     * Smallest element greater than or equal to x.
     *
     * Returns -1 if the ceil does not exist.
     *
     * Time Complexity: O(log N)
     * Space Complexity: O(1)
     */
    private static int ceil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Potential ceil found
            if (arr[mid] >= x) {
                result = arr[mid];

                // Search for a smaller valid ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 7, 8, 10};
        int x = 5;

        int floor = floor(arr, x);
        int ceil = ceil(arr, x);
        
        System.out.println(floor);
        System.out.println(ceil);
    }

}
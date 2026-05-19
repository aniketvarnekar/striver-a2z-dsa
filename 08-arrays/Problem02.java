public class Problem02 {

    /**
     * Finds and returns the second smallest element in the array.
     *
     * The function keeps track of the smallest and second smallest
     * elements while traversing the array in a single pass.
     *
     * Returns -1 if the array contains fewer than two elements.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int findSecondSmallest(int[] arr) {
        // If array has fewer than 2 elements, second smallest does not exist        
        if (arr.length < 2) {
            return -1;
        }

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update smallest and second smallest            
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            // Update second smallest if current element lies between them            
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;        
    }

    /**
     * Finds and returns the second largest element in the array.
     *
     * The function keeps track of the largest and second largest
     * elements while traversing the array in a single pass.
     *
     * Returns -1 if the array contains fewer than two elements.
     *
     * Time Complexity: O(N) — single traversal of the array.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int findSecondLargest(int[] arr) {
        // If array has fewer than 2 elements, second largest does not exist        
        if (arr.length < 2) {
            return -1;
        }        

        // Initialize largest and second largest        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update largest and second largest            
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            // Update second largest if current element lies between them            
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;        
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 5, 7, 7};        
        int secondSmallest = findSecondSmallest(arr);
        int secondLargest = findSecondLargest(arr);

        System.out.println("Second smallest : " + secondSmallest);
        System.out.println("Second largest : " + secondLargest);
    }

}
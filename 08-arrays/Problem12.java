public class Problem12 {

    /**
     * Finds the element that appears only once in the array.
     *
     * Every other element appears exactly twice.
     * The function uses XOR operation to cancel out duplicate elements.
     *
     * XOR properties:
     * - a ^ a = 0
     * - a ^ 0 = a
     *
     * After XOR-ing all elements, only the single element remains.
     *
     * Time Complexity: O(N) — traverses the array once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int getSingleElement(int[] arr) {
        // Stores XOR result
        int result = 0;
        
        // XOR all array elements            
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        // Remaining value is the single element
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 2, 1, 2};

        int result = getSingleElement(arr);

        System.out.println(result);
    }

}
import java.util.*;

public class Problem10 {

    /**
     * Finds the missing number in the array using the sum formula.
     *
     * The array contains numbers from 1 to N with exactly one number missing.
     * The expected sum of first N natural numbers is calculated and the
     * actual array sum is subtracted from it.
     *
     * Time Complexity: O(N) — traverses the array once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int missingNumberV1(int[] arr) {
        // Total numbers should be array length + 1
        int n = arr.length + 1;

        // Calculate expected sum of numbers from 1 to N
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of array elements
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Missing number is the difference
        return expectedSum - sum;
    }


    /**
     * Finds the missing number in the array using XOR operation.
     *
     * The XOR of all array elements and numbers from 1 to N is performed.
     * Equal numbers cancel each other out, leaving only the missing number.
     *
     * Time Complexity: O(N) — traverses the array and range once.
     * Space Complexity: O(1) — uses constant extra space.
     */
    private static int missingNumberV2(int[] arr) {
        // Total numbers should be array length + 1
        int n = arr.length + 1;
        
        // XOR of array elements
        int xor1 = 0;

        // XOR of numbers from 1 to N
        int xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor1 ^= arr[i];
        }
        
        // XOR all numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }
        
        // XOR of xor1 and xor2 gives missing number
        return xor1 ^ xor2;
    }    

    public static void main(String[] args) {
        int[] arr = new int[] {8, 2, 4, 5, 3, 7, 1};

        int missingNumber1 = missingNumberV1(arr);

        System.out.println(missingNumber1);

        int missingNumber2 = missingNumberV2(arr);

        System.out.println(missingNumber2);
    }

}
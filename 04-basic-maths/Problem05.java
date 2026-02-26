public class Problem05 {

    /**
     * Optimal approach:
     *
     * An Armstrong number is a number that is equal to the sum of its
     * digits each raised to the power of the total number of digits.
     *
     * Time Complexity: O(log10 N) — processes each digit.
     * Space Complexity: O(1) — constant extra space.
     */
    private static boolean isArmstrongNumber(int number) {
        // Calculate number of digits in number
        int digits = (int) (Math.log10(number) + 1);
        int originalNumber = number;
        int sum = 0;
        
        // Apply Armstrong number formula by extracting digits from number
        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        if (isArmstrongNumber(153)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
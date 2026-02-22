/**
 * Pattern 19: Print a symmetric star pattern (butterfly / hollow diamond outline).
 */
public class Pattern19 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (size - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (size - i - 1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
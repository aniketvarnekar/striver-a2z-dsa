/**
 * Pattern 20: Print a symmetric butterfly of stars (1-2-3-4-5-4-3-2-1 each side with spaces in between).
 */
public class Pattern20 {

    private static void printPattern(int size) {
        int stars = 1;
        int spaces = 2 * (size - 1);
        for (int i = 1; i <= (2 * size - 1); i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i >= size) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
/**
 * Pattern 17: Print a pyramid of letters (A, ABA, ABCBA, ABCDCBA, ...) centered with spaces.
 */
public class Pattern17 {

    private static void printPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + (i - 2)); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
/**
 * Pattern 16: Print a right-angled triangle with row letter repeated (A, B B, C C C, ...).
 */
public class Pattern16 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
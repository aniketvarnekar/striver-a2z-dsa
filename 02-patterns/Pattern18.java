/**
 * Pattern 18: Print an inverted right-angled triangle of letters (E, D E, C D E, ..., A..E).
 */
public class Pattern18 {

    private static void printPattern(int size) {
        for (int i = 1; i <= size; i++) {
            char ch = (char) ('A' + (size - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
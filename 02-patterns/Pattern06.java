/**
 * Pattern 6: Print an inverted right-angled triangle of numbers (1 to n, 1 to n-1, ...).
 */
public class Pattern06 {

    private static void printPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
/**
 * Pattern 11: Print a right-angled triangle of 0s and 1s with alternating rows (1, 01, 101, ...).
 */
public class Pattern11 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            int start = (i % 2) == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
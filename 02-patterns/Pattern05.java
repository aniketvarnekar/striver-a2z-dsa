/**
 * Pattern 5: Print an inverted right-angled triangle of stars.
 */
public class Pattern05 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
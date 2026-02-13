/**
 * Pattern 2: Print a right-angled triangle of stars.
 */
public class Pattern02 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
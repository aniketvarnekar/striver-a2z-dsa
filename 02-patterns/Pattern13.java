/**
 * Pattern 13: Print a right-angled triangle with continuously incrementing numbers (1, 2 3, 4 5 6, ...).
 */
public class Pattern13 {

    private static void printPattern(int size) {
        int value = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(value++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
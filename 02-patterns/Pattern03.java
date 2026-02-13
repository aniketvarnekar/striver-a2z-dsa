/**
 * Pattern 3: Print a right-angled triangle of numbers.
 */
public class Pattern03 {

    private static void printPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
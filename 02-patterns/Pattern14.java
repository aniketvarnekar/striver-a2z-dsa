/**
 * Pattern 14: Print a right-angled triangle of letters (A, A B, A B C, ...).
 */
public class Pattern14 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
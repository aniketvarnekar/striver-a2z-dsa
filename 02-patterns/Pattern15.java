/**
 * Pattern 15: Print an inverted right-angled triangle of letters (A..E, A..D, ..., A).
 */
public class Pattern15 {

    private static void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (char ch = 'A'; ch < ('A' + size - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
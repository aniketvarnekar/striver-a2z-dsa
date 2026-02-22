/**
 * Pattern 10: Print a hill/arrow of stars (1 to n, then n-1 down to 1).
 */
public class Pattern10 {

    private static void printPattern(int size) {
        for (int i = 1; i <= (2 * size) - 1; i++) {
            int k = (i > size) ? (2 * size) - i : i;
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}